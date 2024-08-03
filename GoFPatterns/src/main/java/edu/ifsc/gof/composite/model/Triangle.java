package edu.ifsc.gof.composite.model;

import edu.ifsc.gof.composite.interfaces.Shape;

public class Triangle implements Shape{

    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing Triangle with color "+fillColor);
    }
    
}
