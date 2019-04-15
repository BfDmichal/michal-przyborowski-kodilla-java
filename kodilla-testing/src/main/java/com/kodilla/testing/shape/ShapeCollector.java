package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    ArrayList<Shape> listOfFigures = new ArrayList<Shape>();

    public void addFigure(Shape shape) {
        listOfFigures.add(shape);
    }

    public Shape getFigure(int i) {
        Shape shape = null;
        if (i >= 0 && i < listOfFigures.size()) {
            shape = listOfFigures.get(i);
        }
        return shape;
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (listOfFigures.contains(shape)) {
            listOfFigures.remove(shape);
            result = true;
        }
        return result;
    }

    public String showFigures() {
        String result = "";
        for (Shape in : listOfFigures) {
            result += in.toString();
        }
        return result;
    }

    public int getNumberOfFigures() {
        return listOfFigures.size();
    }
}
