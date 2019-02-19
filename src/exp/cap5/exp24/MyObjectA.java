package exp.cap5.exp24;

import exp.cap5.Exp22.Student;

public class MyObjectA {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setStudent("张三", 13, 80, 90, 85);
        System.out.println("Hello, my name is " + s1.name + ", " + "I'm " + s1.age + " years old.");
        System.out.println("My total score is " + s1.total());
        System.out.println("My average score is " + s1.average());
    }
}
