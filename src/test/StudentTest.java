package test;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student(80, 89);
        Student student2 = new Student(66, 79);
        Student student3 = new Student(90, 69);
        student1.getscore();
        student1.display();
        student2.getscore();
        student2.display();
        student3.getscore();
        student3.display();
        Student.sort(student1, student2, student3);
    }
}
