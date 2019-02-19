package exp.cap4.Exp16;

public class Exp16 {
    public static void main(String args[]) {
        int a[], i;
        a = new int[10];
        for (i = 0; i <= a.length - 1; i++) {
            a[i] = i;
            System.out.print("a[" + i + "]=" + a[i] + " ");
        }
        System.out.println("");
        for (i = a.length - 1; i >= 0; --i) {
            a[i] = i;
            System.out.print("a[" + i + "]=" + a[i] + " ");
        }
    }
}
