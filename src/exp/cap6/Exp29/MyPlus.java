package exp.cap6.Exp29;

class MyPlus {
    public int plus(int a, int b) {
        int s;
        s = a + b;
//        System.out.println(a + " + " + b + " = " + s);
        return s;
    }

    public int plus(int a, int b, int c) {
        int s;
        s = this.plus(a, b) + c;
//        System.out.println(a + " + " + b + " + " + c + " = " + s);
        return s;
    }

    public int plus(int a, int b, int c, int d) {
        int s = this.plus(a, b, c) + d;
//        System.out.println(a + " + " + b + " + " + c + " + " + d + " = " + s);
        return s;
    }

    public static void main(String args[]) {
        MyPlus p = new MyPlus();
        System.out.println("1 + 2 = " + p.plus(1, 2));
        System.out.println("1 + 2 + 3 = " + p.plus(1, 2, 3));
        System.out.println("1 + 2 + 3 + 4 = " + p.plus(1, 2, 3, 4));
    }
}