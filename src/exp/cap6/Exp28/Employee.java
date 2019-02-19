package exp.cap6.Exp28;

class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String newName, int newAge, double newSalary) {
        this(newAge, newSalary);
        System.out.println("三个参数的构造函数被调用。");
        this.name = newName;
    }

    public Employee(int newAge, double newSalary) {
        this(newSalary);
        System.out.println("两个参数的构造方法被调用。");
        this.age = newAge;
    }

    public Employee(double newSalary) {
        this();
        System.out.println("一个参数的构造方法被调用。");
        this.salary = newSalary;
    }

    public Employee() {
        System.out.println("没有参数的构造方法被调用。");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        int age = 0;
        this.age = newAge;
    }

    public static void main(String args[]) {
        Employee s1 = new Employee("李四", 30, 8000);
        s1.setAge(31);
        System.out.println(s1.name + "的年龄是 " + s1.getAge());
    }
}
