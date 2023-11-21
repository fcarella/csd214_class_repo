package csd214.intellij_gui_designer_example;

import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // run GUI from here or run from GuiApp.java - see csd214/intellij_gui_designer_example/GuiApp.java
        JFrame frame = new JFrame("GuiApp");
        frame.setContentPane(new GuiApp().getPanel1());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}