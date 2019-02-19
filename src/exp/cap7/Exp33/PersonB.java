package exp.cap7.Exp33;

class PersonB {
    String name;
    int age;

    public PersonB() {
        System.out.println("PersonB 被调用");
    }

    public PersonB(String newName) {
        this.name = newName;
        System.out.println("PersonB(String newName) 被调用");
    }

    public void introduce() {
        System.out.println("我是" + this.name + "，今年 " + this.age + " 岁");
    }
}