package exp.cap11.exp62;

public class ThreadSynchronized {
    public static void main(String[] args) {
        Common common = new Common();
        Producer producer = new Producer(common);
        Consumer consumer = new Consumer(common);
        producer.start();
        consumer.start();
    }
}
