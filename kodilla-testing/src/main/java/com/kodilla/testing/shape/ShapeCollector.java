package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private ArrayList<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result =  false;
        if (shapes.contains(shape)) {
            shapes.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n) {
        if (n > shapes.size()-1 || n < 0) {
            return null;
        } else {
            System.out.println("Figure at "+n+" index in shapes collection is: ");
            return shapes.get(n);
        }
    }

    public ArrayList<Shape> showFigures() {
        System.out.println("Collection shapes contains: ");
        return shapes;
    }

}
