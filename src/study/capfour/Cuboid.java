package study.capfour;

public class Cuboid extends Rectangle implements Volume {
    private double height;

    public Cuboid(double height, double length, double width) {
        super(length, width);
        this.height = height;
    }

    public Cuboid(Rectangle a, double height) {
        this(height, a.length, a.width);
    }

    public Cuboid(double width) {
        this(width, width, width);
    }

    public Cuboid() {
        this(0, 0, 0);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return (super.perimeter() * this.height + 2 * super.area());
    }

    @Override
    public double perimeter() {
        return -1;
    }


    @Override
    public double volume() {
        return (super.area() * this.height);
    }

    @Override
    public String toString() {
        return ("A cuboid, length is " + this.length + ", width is " + this.width
                + " and height is " + this.height + ". Area is " + this.area() + " and volumn is "
                + this.volume());
    }
}
