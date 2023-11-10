package com.mycode.designpatternsstructuraladapter.entities.adapters;

import com.mycode.designpatternsstructuraladapter.entities.files.JSONFile;
import com.mycode.designpatternsstructuraladapter.entities.files.XMLFile;
import com.mycode.designpatternsstructuraladapter.entities.painters.Painter;
import com.mycode.designpatternsstructuraladapter.entities.painters.PainterV2;

public class PainterAdapter implements Painter {
    private PainterV2 painterV2;

    public PainterAdapter() {
        this.painterV2 = new PainterV2();
    }

    @Override
    public void displayWelcomeMessage(XMLFile file) {
        JSONFile jsonFile = convertXMLFileToJSONFile(file);
        painterV2.displayWelcomeMessage(jsonFile);
    }

    @Override
    public void displayContent(XMLFile file) {
        JSONFile jsonFile = convertXMLFileToJSONFile(file);
        painterV2.displayContent(jsonFile);
    }

    private JSONFile convertXMLFileToJSONFile(XMLFile xmlFile) {
        return new JSONFile(xmlFile.getName(), xmlFile.getSize() * 2);
    }
}
