package exp.cap5.Exp22;

public class Student {
    public String name;
    public int age;
    public int math;
    public int chinese;
    public int english;

    public int total() {
        return math + chinese + english;
    }

    public int average() {
        return this.total() / 3;
    }

    public void setStudent(String n, int a, int c, int m, int e) {
        this.name = n;
        this.age = a;
        this.chinese = c;
        this.math = m;
        this.english = e;
    }
}