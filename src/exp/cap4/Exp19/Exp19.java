package exp.cap4.Exp19;

public class Exp19 {
    public static void main(String args[]) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        String str4 = new String("Hello");
        System.out.println("运算符 == ");
        if (str1 == str2)
            System.out.println("str1 与 str2 相等");
        else
            System.out.println("str1 与 str2 不相等");
        if (str3 == str4)
            System.out.println("str3 与 str4 相等");
        else
            System.out.println("str3 与 str4 不相等");
        if (str2 == str3)
            System.out.println("str2 与 str3 相等");
        else
            System.out.println("str2 与 str3 不相等");
        System.out.println("\nequals 方法: ");
        if (str1.equals(str2))
            System.out.println("str1 与 str2 相等");
        else
            System.out.println("str1 与 str2 不相等");
        if (str3.equals(str4))
            System.out.println("str3 与 str4 相等");
        else
            System.out.println("str3 与 str4 不相等");
        if (str2.equals(str3))
            System.out.println("str2 与 str3 相等");
        else
            System.out.println("str2 与 str3 不相等");
    }
}