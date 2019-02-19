package exp.cap7.Exp33;

class StudentB extends PersonB {
    public StudentB() {
        System.out.println("StudentB() 被调用");
    }

    public StudentB(String newName, int newAge) {
        super(newName);
        this.age = newAge;
    }
}