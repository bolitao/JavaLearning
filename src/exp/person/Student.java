package exp.person;

/**
 * Student 类
 *
 * @author Boli Tao
 * @date 2018/4/17
 */

public class Student extends Person {
    private String speciality;
    private String number;

    public Student() {
        number = "";
        speciality = "";
    }

    public Student(String name, MyDate birthday, String speciality, String number) {
        super(name, birthday);
        this.speciality = speciality;
        this.number = number;
    }

    public Student(Student student) {
        this(student.getName(), student.getBirthday(), student.getSpeciality(), student.getNumber());
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }


    @Override
    public String toString() {
        return super.toString() + ", " + this.speciality + ", " + this.number;
    }

    /*
    public boolean equals(Student student) {
        return (this == student) || (student != null && this.getName() == student.getName() && this.getBirthday() == student.getBirthday() &&
                this.getSpeciality() == student.getSpeciality() && this.number == student.getNumber());
    }
    */

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (o instanceof Student) {
            Student st = (Student) o;
            if (!st.getName().equals(this.getName()) && !st.getBirthday().equals(this.getBirthday())
                    && !st.getSpeciality().equals(this.getSpeciality()) && !st.getNumber().equals(this.getNumber())) {
                return false;
            }
            return true;
        }
        return false;
    }
}
