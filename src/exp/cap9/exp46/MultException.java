package exp.cap9.exp46;

public class MultException {
    public static void main(String[] args) {
        int i;
        int a[] = {1, 2, 3, 4};
        for (i = 0; i < 5; i++) {
            try {
                System.out.print("a[" + i + "] / " + i + " = " + (a[i] / i));
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("数组下标越界异常");
            } catch (ArithmeticException e) {
                System.out.println("异常类名称：" + e);
            } catch (Exception e) {
                System.out.println("捕获" + e.getMessage() + "异常");
            } finally {
                System.out.println("   Finally i = " + i);
            }
        }
        System.out.println("Finished.");
    }
}

//TODO: 理解