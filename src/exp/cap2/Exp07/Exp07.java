package exp.cap2.Exp07;

public class Exp07 {
    public static void main(String[] args) {
        boolean a, x, y, z;
        a = (5 > 6);
        x = !a;
        y = a && x;
        z = x || y;
        //System.out.println(a + " " + x);
        System.out.println("a = " + a + "\nx = " + x + "\ny = " + y + "\nz = " + z);
    }
}