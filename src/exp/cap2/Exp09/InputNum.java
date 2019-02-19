package exp.cap2.Exp09;

import java.util.*;

public class InputNum {
    public static void main(String[] args) {
        int a = 0;
        float b = 0f;
        double c = 0d;
        String s = "";
        Scanner reader = new Scanner(System.in);
        System.out.print("从键盘输入一串字符：");
        s = reader.nextLine();
        System.out.println("你输入的字符串是：" + s + "\n从键盘输入一个整数：");
        a = reader.nextInt();
        System.out.println("你输入的整数是：" + a + "\n从键盘输入一个单精度浮点数：");
        b = reader.nextFloat();
        System.out.println("你输入的单精度浮点数是：" + b + "\n从键盘输入一个双精度浮点数：");
        c = reader.nextDouble();
        System.out.println("你输入的双精度浮点数是：" + c);
    }
}
