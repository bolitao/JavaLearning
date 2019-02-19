package exp.cap3.Exp14;

import java.util.*;

public class SwitchSentence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = -1;

        while ((i < 0) || (i > 6)) {
            System.out.println("请输入一个 0~6 的整数: ");
            i = input.nextInt();
        }

        switch (i) {
            case 0:
                System.out.println("今天是周日");
                break;
            case 1:
                System.out.println("今天是周一");
                break;
            case 2:
                System.out.println("今天是周二");
                break;
            //周三至周日省略
            default:
                System.out.println("Error!");
        }
    }
}