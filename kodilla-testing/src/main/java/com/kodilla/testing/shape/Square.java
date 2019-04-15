package com.kodilla.testing.shape;

public class Square implements Shape {
    private String name;
    private double side;

    public Square(String name, double side) {
        this.name = name;
        this.side = side;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return Math.pow(side, 2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;
        Square that = (Square) o;
        if (!(side == (that.side))) return false;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 21 * result + (int) side;
        return result;
    }
    @Override
    public String toString() {
        return getShapeName()+": "+getField()+", ";
    }

}
