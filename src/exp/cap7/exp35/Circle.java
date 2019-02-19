package exp.cap7.exp35;

public class Circle extends Shape {
    final float pi = 3.14F;
    int radius;

    public Circle(int newRadius) {
        this.radius = newRadius;
    }

    @Override
    public float area() {
        return pi * radius * radius;
    }

    @Override
    public void printArea() {
        System.out.println("Area of the Circle is " + this.area());
    }
}
