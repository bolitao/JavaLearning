package exp.cap7.exp35;

public class Rectangle extends Shape {
    int width;
    int length;

    public Rectangle(int newWidth, int newLength) {
        this.width = newWidth;
        this.length = newLength;
    }

    @Override
    public float area() {
        return width * length;
    }

    @Override
    public void printArea() {
        System.out.println("Area of the rectangle is: " + this.area());
    }
}
