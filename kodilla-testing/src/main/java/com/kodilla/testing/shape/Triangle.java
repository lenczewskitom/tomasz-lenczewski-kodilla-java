package com.kodilla.testing.shape;

public class Triangle implements Shape{

    private double height;
    private double base;
    private String shapeName = "Triangle";

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.height, height) != 0) return false;
        if (Double.compare(triangle.base, base) != 0) return false;
        return shapeName.equals(triangle.shapeName);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", base=" + base +
                ", shapeName='" + shapeName + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(height);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(base);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + shapeName.hashCode();
        return result;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField() {
        return (height*base)/2;
    }
}
