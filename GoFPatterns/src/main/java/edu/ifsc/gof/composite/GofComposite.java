package edu.ifsc.gof.composite;

import edu.ifsc.gof.composite.interfaces.Shape;
import edu.ifsc.gof.composite.model.Circle;
import edu.ifsc.gof.composite.model.Drawing;
import edu.ifsc.gof.composite.model.Triangle;

public class GofComposite {
    public static void main(String[] args) {
        Shape tri = new Triangle();
        Shape tri1 = new Triangle();
        Shape cir = new Circle();

        Drawing drawing = new Drawing();
        drawing.add(tri);
        drawing.add(tri1);
        drawing.add(cir);

        drawing.draw("Red");

        drawing.clear();

        drawing.add(tri);
        drawing.add(cir);
        drawing.draw("Green");
    }
}
