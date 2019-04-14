package com.kodilla.testing.shape;

public class Circle implements Shape {
    private String name;
    private double radius;

    public Circle(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }


    @Override
    public String getShapeName() {
        return this.name;
    }

    @Override
    public double getField() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle that = (Circle) o;
        if (!(radius == (that.radius))) return false;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 21 * result + (int) radius;
        return result;
    }
}
