package exp.cap8.exp41;

public class Cylinder implements Shape {
    private double radius;
    private int height;

    public Cylinder(double r, int h) {
        this.radius = r;
        this.height = h;
    }

    @Override
    public double area() {
        return pi * radius * radius;
    }

    @Override
    public double volume() {
        return this.area() * height;
    }
}
