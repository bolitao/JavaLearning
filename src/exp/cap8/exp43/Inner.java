package exp.cap8.exp43;

public class Inner {
    public static void main(String[] args) {
        System.out.println("----通过外部类成员访问内部成员----");
        School a = new School();
        a.output();
        System.out.println("----直接访问内部成员----");
        School.Student b = a.new Student("金融学院", "John", 23);
        b.output();
    }
}