package exp.cap11.exp60;

public class SaleTickets implements Runnable {
    private int tickets = 1;

    @Override
    public void run() {
        while (true) {
            if (tickets <= 100) {
                System.out.println(Thread.currentThread().getName() + "销售第 " + tickets++ + " 张票");
            } else {
                break;
            }
        }
    }
}
