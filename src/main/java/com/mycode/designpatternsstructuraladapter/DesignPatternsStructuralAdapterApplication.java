package com.mycode.designpatternsstructuraladapter;

import com.mycode.designpatternsstructuraladapter.entities.adapters.PainterAdapter;
import com.mycode.designpatternsstructuraladapter.entities.files.XMLFile;
import com.mycode.designpatternsstructuraladapter.entities.painters.PainterV1;

public class DesignPatternsStructuralAdapterApplication {

    public static void main(String[] args) {
        XMLFile xmlFile = new XMLFile("XML File 1", 25);

        PainterV1 painterV1 = new PainterV1();
        painterV1.displayWelcomeMessage(xmlFile);
        painterV1.displayContent(xmlFile);

        PainterAdapter painterAdapter = new PainterAdapter();
        painterAdapter.displayWelcomeMessage(xmlFile);
        painterAdapter.displayContent(xmlFile);
    }

}
