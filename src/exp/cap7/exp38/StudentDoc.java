package exp.cap7.exp38;

/**
 * Class Student
 */
public class StudentDoc {
    /**
     * 学校的名字,公共属性,字符串型
     */
    public String school;
    private String name;
    private int age;
    private String dept;

    /**
     * @return name 返回 name 属性
     */
    public String getName() {
        return name;
    }

    /**
     * @param name 设置 name 属性
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return age 返回 age 属性
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age 设置 age 属性
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return dept 返回 dept 属性
     */
    public String getDept() {
        return dept;
    }

    /**
     * @param dept 设置 dept 属性
     */
    public void setDept(String dept) {
        this.dept = dept;
    }

    /**
     * 公共方法，输出各属性的值
     */
    public void introduce() {
        System.out.println("My name is " + this.name);
        System.out.println("I'm " + this.age + " years old.");
        System.out.println("My speciality is " + this.dept);
    }
}
