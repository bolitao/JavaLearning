package study.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss SSS");
        Date date = new Date();
        System.out.println(simpleDateFormat.format(date));
        String string = "2016:03:30 212:23:12 323";
        try {
            System.out.println(simpleDateFormat.parse(string));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
