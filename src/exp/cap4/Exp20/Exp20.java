package exp.cap4.Exp20;

public class Exp20 {
    public static void main(String args[]) {
        String str1 = "Hello";
        String str2 = "World!";
        String str = str1 + str2;
        System.out.println("str = " + str);
        System.out.println("str 的长度是 " + str.length());
        System.out.println("str 的第三个字符串是 " + str.substring(3, 4));
        System.out.println("str 中串 or 第一次出现的位置是 " + str.indexOf("or"));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
    }
}