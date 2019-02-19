package exp.cap11.exp60;

public class Sale {
    public static void main(String[] args) {
        SaleTickets t = new SaleTickets();
        Thread thread1 = new Thread(t);
        thread1.start();
        Thread thread2 = new Thread(t);
        thread2.start();
        Thread thread3 = new Thread(t);
        thread3.start();
        Thread thread4 = new Thread(t);
        thread4.start();
    }
}
