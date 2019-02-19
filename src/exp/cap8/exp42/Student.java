package exp.cap8.exp42;

public class Student extends Person implements Achievement {
    int chinese;
    int math;
    int english;

    public Student(String name, int age) {
        super(name, age);
    }

    public void setScore(int c, int m, int e) {
        this.chinese = c;
        this.math = m;
        this.english = e;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    @Override
    public float average() {
        return (chinese + math + english) / 3;
    }
}