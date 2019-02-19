package exp.cap9.exp45;

public class ExceptionsTest {
    public static void main(String[] args) {
        try {
            int a[] = null;
            a[0] = 1;
        } catch (NullPointerException npe) {
            System.out.println("空指针异常");
        }
        try {
            String str = null;
            str.length();
        } catch (NullPointerException npe) {
            System.out.println("空指针异常");
        }
        try {
            Object obj = new Object();
            String str = (String) obj;
        } catch (ClassCastException e) {
            System.out.println("强制类型转换异常");
        }
        try {
            int a[] = new int[-1];
        } catch (NegativeArraySizeException e) {
            System.out.println("数组负下标异常");
        }
        try {
            int a[] = new int[1];
            a[0] = 0;
            a[1] = 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组下标越界异常");
        }
    }
}
