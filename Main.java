package com.company;

public class Main {

    public static void main(String[] args) {
        AbstractButton abstractButton = new AbstractButton();
        abstractButton.display(CircleButton());
        abstractButton.display(RectangleButton());
    }
}
