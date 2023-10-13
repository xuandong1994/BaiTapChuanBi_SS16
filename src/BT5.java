import java.util.Random;

public class BT5 extends Thread {
    /**
     * Viết một chương trình Java sử dụng thread để tạo một số ngẫu nhiên và in ra màn hình.
     * hướng dẫn:
     * <p>
     * <p>
     * Bước 1: Kế thừa lớp Thread
     * Trong lớp chính, kế thừa lớp Thread bằng cách sử dụng từ khóa extends.
     * Điều này sẽ cho phép bạn sử dụng luồng (thread) để thực hiện công việc mong muốn.
     * Bước 2: Override phương thức run()
     * Trong lớp con của bạn (lớp kế thừa từ Thread), hãy override phương thức run().
     * Phương thức run() này sẽ chứa mã để tạo số ngẫu nhiên và in ra màn hình.
     * Bước 3: Tạo và khởi chạy thread
     * Trong phần main của lớp chính, tạo một đối tượng của lớp con bạn đã tạo và gọi phương thức start() để bắt đầu thực thi thread.
     **/
    @Override

    public void run() {
        Random random = new Random();
        int randomNumber = random.nextInt();

        for (int i = 0; i <= randomNumber; i++) {
            System.out.println("Số ngẫu nhiên là: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        BT5 thread = new BT5();
        thread.start();
    }
}
