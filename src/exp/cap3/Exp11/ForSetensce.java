package exp.cap3.Exp11;

public class ForSetensce {
    public static void main(String args[]) {
        final int NUM = 99;
        int i, sum = 0;
        for (i = 1; i <= NUM; i++) {
            sum += i;
            i++;
        }
        System.out.println("1 + 3 + 5 + ... + " + NUM + " = " + sum);
    }
}
