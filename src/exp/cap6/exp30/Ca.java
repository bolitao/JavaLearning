package exp.cap6.exp30;

class Ca {
    int a;
    static int b;

    public static void m1() {
        int a = 10;
        b = 10;
    }

    public void m2() {
        a = 5;
        b = 5;
    }

    //    以下代码为何不行？
//    public static void m3() {
    public void m3() {
        m1();
        m2();
    }
}
