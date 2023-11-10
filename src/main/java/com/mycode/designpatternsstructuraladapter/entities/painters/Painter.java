package com.mycode.designpatternsstructuraladapter.entities.painters;

import com.mycode.designpatternsstructuraladapter.entities.files.XMLFile;

public interface Painter {
    void displayWelcomeMessage(XMLFile file);

    void displayContent(XMLFile file);
}
