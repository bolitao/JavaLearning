package exp.cap3.Exp12;

import java.util.*;

public class WhileSetence {
    public static void main(String args[]) {
        int inputNum = 0;
        int i = 1, sum = 0;
        Scanner reader = new Scanner(System.in);
        while (inputNum < 50 || inputNum > 100) {
            System.out.print("请输入一个 50~100 的整数:");
            inputNum = reader.nextInt();
        }
        System.out.print("你输入的数是：" + inputNum + "\n1 + 2 + 3 + ... + " + inputNum + " = ");
        while (i <= inputNum) {
            sum += i;
            i++;
        }
        System.out.print(sum);
    }
}
