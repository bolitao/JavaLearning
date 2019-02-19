package exp.cap8.exp42;

public class Test {
    public static void main(String args[]) {
        Student s = new Student("zhangsan", 16);
        s.introduce();
        s.setScore(90, 20, 30);
        System.out.println("My average score is " + s.average() + ".");
    }
}