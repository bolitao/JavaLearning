package test;

public class Student {
    private int english;
    private int computer;
    private int total = 0;

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getComputer() {
        return computer;
    }

    public void setComputer(int computer) {
        this.computer = computer;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Student(int english, int computer) {
        this.english = english;
        this.computer = computer;
    }

    public void getscore() {
        total = english + computer;
    }

    public void display() {
        System.out.println(total);
    }

    // 从小到大排序
    public static void sort(Student student1, Student student2, Student student3) {
        int temp = 0;
        if (student1.total > student2.total) {
            temp = student1.total;
            student1.total = student2.total;
            student2.total = temp;
        }
        if (student2.total > student3.total) {
            temp = student2.total;
            student2.total = student3.total;
            student3.total = temp;
        }

        System.out.printf("从高到低排序的成绩：%d,%d,%d", student1.total, student2.total, student3.total);
    }
}
