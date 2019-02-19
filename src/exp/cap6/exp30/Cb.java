package exp.cap6.exp30;

public class Cb {
    public static void main(String[] args) {
        Ca s1 = new Ca();
        Ca s2 = new Ca();
        Ca.b = 5;
        s1.b = 6;
        s2.b = 7;
        System.out.println("Ca.b = " + Ca.b);
        System.out.println("s1.b = " + s1.b);
        System.out.println("s2.b = " + s2.b);
    }
}