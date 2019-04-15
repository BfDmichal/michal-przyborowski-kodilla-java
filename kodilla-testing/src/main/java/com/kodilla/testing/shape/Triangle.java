package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private String name;
    private double height;
    private double base;

    public Triangle(String name, double height, double base) {
        this.name = name;
        this.height = height;
        this.base = base;
    }

    @Override
    public String getShapeName() {
        return this.name;
    }

    @Override
    public double getField() {
        return (base / 2) * height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Triangle that = (Triangle) o;
        if (!(base == (that.base))) return false;
        if (!(height == (that.height))) return false;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 21 * result + (int) base + (int) height;
        return result;
    }
    @Override
    public String toString() {
        return getShapeName()+": "+getField()+", ";
    }
}
