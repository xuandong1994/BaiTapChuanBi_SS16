public class BT6 extends Thread {
    private int sum;

    @Override
    public void run() {
        sum = 0;
        for (int i = 1; i <= 1000; i++) {
            sum += i;
        }
    }

    public int getSum() {
        return sum;
    }

    public static void main(String[] args) {
        BT6 thread = new BT6();
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Tổng các số từ 1 đến 1000 là: " + thread.getSum());
    }
}