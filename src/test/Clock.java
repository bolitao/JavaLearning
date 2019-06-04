package test;

import java.util.Date;

public class Clock {
    public static void main(String[] args) {
        int minute = 0;
        int second = 0;
        while (true) {
            while (second < 60) {
                System.out.println("minute " + minute + ", second: " + second);
                second++;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            second = 0;
            minute++;
        }
    }
}
