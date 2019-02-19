package exp.cap2.Exp08;

public class Exp08 {
    public static void main(String args[]) {
        byte a = 0;
        short b = 0;
        int c = 0;
        long d = 0;
        float e = 0f;
        double f = 0d;
        String s = "10";
        a = Byte.parseByte(s);
        b = Short.parseShort(s);
        c = Integer.parseInt(s);
        d = Long.parseLong(s);
        e = Float.parseFloat(s);
        f = Double.parseDouble(s);
        int Myint = 1234;
        String MyString = "" + Myint;
        System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f + " " + MyString);
    }
}
