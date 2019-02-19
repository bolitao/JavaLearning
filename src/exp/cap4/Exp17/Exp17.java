package exp.cap4.Exp17;

//import java.util.*;
//
//public class Exp17 {
//    public static void main(String args[]) {
//        int i, max, min;
//        int a[] = new int[5];
//        Scanner reader = new Scanner(System.in);
//        for (i = 0; i < 5; i++) {
//            System.out.print("从键盘输入一个整数元素到 a[" + (i + 1) + "]: ");
//            a[i] = reader.nextInt();
//        }
//        max = a[0];
//        min = a[0];
//        for (i = 1; i < 5; i++) {
//            if (a[i] > max)
//                max = a[i];
//            if (a[i] < min)
//                min = a[i];
//        }
//        System.out.println("最大值: " + max + "\n最小值: " + min);
//    }
//}

import java.util.Scanner;

public class Exp17 {
    public static void main(String[] args) {
        int[] array = new int[5];
        int max, min;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Please enter an integer for array[" + i + "]: ");
            array[i] = scanner.nextInt();
        }
        max = array[0];
        min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min =array[i];
            }
        }
        System.out.println("Max: " + max + ", Min: " + min);
    }
}