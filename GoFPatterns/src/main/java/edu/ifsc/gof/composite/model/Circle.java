package edu.ifsc.gof.composite.model;

import edu.ifsc.gof.composite.interfaces.Shape;

public class Circle implements Shape {

    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing Circle with color "+fillColor);
    }
    
}
