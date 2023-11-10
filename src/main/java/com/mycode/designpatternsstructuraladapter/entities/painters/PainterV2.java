package com.mycode.designpatternsstructuraladapter.entities.painters;

import com.mycode.designpatternsstructuraladapter.entities.files.JSONFile;

public class PainterV2 {

    public void displayWelcomeMessage(JSONFile file) {
        System.out.println("Welcome To Painter Version 2, Painting File With Name :: " + file.getName());
    }

    public void displayContent(JSONFile file) {
        System.out.println("PainterV2 :: Painting File With Name :: " + file.getName() + ", Size :: " + file.getSize() + " MB");
    }

}
