package exp.cap6.Exp26;

class Person {
    String name;
    private int age;

    public boolean setAge(int newAge) {
        if (newAge <= 20 && newAge >= 5) {
            this.age = newAge;
            return true;
        } else {
            return false;
        }
    }

    public int getAge() {
        return this.age;
    }
}

public class App {
    public static void main(String args[]) {
        Person p1 = new Person();
        p1.name = "张三";
        if (p1.setAge(25)) {
            System.out.println(p1.name + " " + p1.getAge());
        } else {
            System.out.println("年龄错误");
        }
    }
}