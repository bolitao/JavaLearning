package exp.person;

/**
 * Person 类
 *
 * @author Boli Tao
 * @date 2018/4/17
 */
public class Person {
    private String name;
    private MyDate birthday;

    public Person() {
    }

    public Person(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public Person(Person p) {
        this(p.name, p.birthday);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    /*
    public boolean equals(Person p) {
        return (this == p) || (p != null && p.name == this.name && p.birthday == this.birthday);
    }
    */

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof Person) {
            Person p = (Person) obj;
            if (!p.getName().equals(this.getName())
                    || !p.getBirthday().equals(this.getBirthday())) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.birthday.toString();
    }
}