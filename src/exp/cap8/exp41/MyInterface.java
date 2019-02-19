package exp.cap8.exp41;

//import java.text.DecimalFormat;

public class MyInterface {
    public static void main(String args[]) {
        Cylinder a = new Cylinder(4, 5);
        System.out.println("Area of the cylinder is " + a.area());
        System.out.println("Volume of the cylinder is " + a.volume());
    }
    //DecimalFormat myFormat = new DecimalFormat("0.00");
}