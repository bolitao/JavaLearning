package exp.person;

public class test {
    public static void main(String args[]) {
        MyDate d = new MyDate();
        Person p = new Person("name", d);
        Student s = new Student(p.getName(), p.getBirthday(), "CS", "20166666");
        d.setDate(2012, 3, 21);
        System.out.println(d.toString());
        System.out.println(p.toString());
        System.out.println(s.toString());
        System.out.println(s.equals(p));
        System.out.println(p.equals(s));
    }
}
