package com.mycode.designpatternsstructuraladapter.entities.painters;

import com.mycode.designpatternsstructuraladapter.entities.files.XMLFile;

public class PainterV1 implements Painter {
    @Override
    public void displayWelcomeMessage(XMLFile file) {
        System.out.println("Welcome To Painter Version 1, Painting File With Name :: " + file.getName());
    }

    @Override
    public void displayContent(XMLFile file) {
        System.out.println("PainterV1 :: Painting File With Name :: " + file.getName() + ", Size :: " + file.getSize() + " MB");
    }
}
