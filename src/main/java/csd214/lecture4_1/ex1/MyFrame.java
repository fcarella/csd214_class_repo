/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csd214.lecture4_1.ex1;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Fred
 */
public class MyFrame extends JFrame {

    public MyFrame() throws HeadlessException {
        setup();
        setTitle("My Frame");
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyFrame();
    }

    private void setup() {
        setLayout(new BorderLayout());
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 4));

        JButton b1 = new JButton("B1");
        JButton b2 = new JButton("B2");
        JButton b3 = new JButton("B3");
        JButton b4 = new JButton("B4");
        JButton b5 = new JButton("B1");
        JButton b6 = new JButton("B2");
        JButton b7 = new JButton("B3");
        JButton b8 = new JButton("B4");

        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        panel.add(b7);
        panel.add(b8);

        add(panel, BorderLayout.CENTER);

    }

}
