public class BT2 extends Thread {
    /**
     * Đề bài: Viết chương trình Java để tạo một thread đếm ngược từ 10 đến 1 và in ra màn hình sau mỗi giây.
     .***/
    @Override
    public void run() {
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        BT2 thread = new BT2();
        thread.start();
    }
}
