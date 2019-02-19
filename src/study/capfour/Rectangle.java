package study.capfour;

public class Rectangle implements Area {
    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(double width) {
        this(width, width);
    }

    public Rectangle() {
        this(0, 0);
    }

    public Rectangle(Rectangle r) {
        this(r.length, r.width);
    }

    public double perimeter() {
        return (this.length + this.width) * 2;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double area() {
        return this.length * this.width;
    }

    @Override
    public String toString() {
        return ("This is a rectangle, length is " + this.length + " and width is " + this.width +
                ". The area of this rectangle is " + this.area() + ". THe perimeter is "
                + this.perimeter() + ".");
    }
}
