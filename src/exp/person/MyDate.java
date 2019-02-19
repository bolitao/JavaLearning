package exp.person;

/**
 * MyDate 类
 *
 * @author Boli Tao
 * @date 2018/4/17
 */
public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate() {
    }

    public MyDate(int y, int m, int d) {
        this.year = y;
        this.month = m;
        this.day = d;
    }

    public void setDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public boolean equals(MyDate mydate) {
        return (mydate == this) || (mydate != null && mydate.year == this.year && mydate.month == this.month && mydate.day == this.day);
    }

    @Override
    public String toString() {
        return this.year + "年" + this.month + "月" + this.day + "日";
    }
}
