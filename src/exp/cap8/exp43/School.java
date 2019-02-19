package exp.cap8.exp43;

class School {
    String name;

    public class Student {
        String name;
        int age;

        public Student(String schoolName, String studentName, int newAge) {
            School.this.name = schoolName;
            this.name = studentName;
            this.age = newAge;
        }

        public void output() {
            System.out.println("School: " + School.this.name);
            System.out.println("Name: " + this.name);
            System.out.println("Age: " + this.age);
        }
    }

    public void output() {
        Student stu = new Student("金融学院", "张三", 24);
        stu.output();
    }
}