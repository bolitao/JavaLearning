package exp.Complex;

public class Test {
    public static void main(String args[]) {
        Complex a = new Complex("4+2i");
        Complex b = new Complex("4+-6i");
        Complex c = new Complex("0+-1i");
        Complex d = new Complex("1");
//        Complex[] numbers = {new Complex("4+2i"), new Complex("4+-6i"),
//                new Complex("0+2i"), new Complex("2+0i"), new Complex("2+9i")};
        ComplexCamparator cc = new ComplexCamparator();
        System.out.println(cc.compare(a, b));
        //Comparator 测试
        System.out.println(Complex.plus(a, b));
        //加法测试
        System.out.println(Complex.pub(a, b));
        //减法测试
        System.out.println(a.toString());
        //实部和虚部都为正数的 toString 测试
        System.out.println(b.toString());
        //实部为正虚部为负的 toString 测试
        System.out.println(c.toString());
        //只有虚部的 toString 测试
        System.out.println(d.toString());
        //只有实部的 toString 测试
        System.out.println(a.equals(b));
        //equals 方法测试
        System.out.println(Complex.compareTo(a, b));
        //静态 compareTo 方法测试
        System.out.println(a.compareTo(b));
        //重写 Comparable 接口的 compareTo 方法测试
    }
}