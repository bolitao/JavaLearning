package testing;

import java.util.Scanner;

public class DateTesting {
    public static String returnDate(int year, int month, int day) {
        return year + "-" + month + "-" + day;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = scanner.nextInt();
        while (year <= 0) {
            System.out.println("年份输入错误，请重新输入：");
        }
        System.out.println("请输入月份：");
        int month = scanner.nextInt();
        while (month < 1 || month > 12) {
            System.out.println("月份错误，请重新输入：");
            month = scanner.nextInt();
        }
        System.out.println("请输入日：");
        int day = scanner.nextInt();
        System.out.println("日期：" + DateTesting.returnDate(year, month, day));
    }
}