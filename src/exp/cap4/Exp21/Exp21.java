package exp.cap4.Exp21;

public class Exp21 {
    public static void main(String args[]) {
        if (args.length == 0)
            System.out.println("没有输入参数");
        else
            System.out.println("共输入了 " + args.length + " 个参数");
        for (int i = 0; i < args.length; i++)
            System.out.print(args[i]);
    }
}