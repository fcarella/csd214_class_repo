package csd214.f24.lab1.lecture_examples._05_app_skeleton;//package csd214.f24.lab1.lecture_examples._05_app_skeleton;

import java.util.Objects;

public class MyObject {
    private String aString;
    private int anInt;

    // Constructors, getters, and setters

    public MyObject() {
        this.aString="A string";
        this.anInt=12;
    }

    public MyObject(String aString) {
        this();
        this.aString = aString;
    }

    public MyObject(int anInt) {
        this();
        this.anInt = anInt;
    }

    public MyObject(String aString, int anInt) {
        this();
        this.aString = aString;
        this.anInt = anInt;
    }
}
