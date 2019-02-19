package exam.exp2;

import java.io.Serializable;

public class Student implements Serializable {
    String name;
    int id;

    Student() {
    }

    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
