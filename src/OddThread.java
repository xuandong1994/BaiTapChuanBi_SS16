public class OddThread extends Thread{
    /**
     * Luyện tập sử dụng lớp Threard hoặc interface Runnable để tạo Thread
     * Sử dụng một số phương thức cơ bản của lớp Thread
     * Mô tả bài toán
     * Tạo lớp OddThread và EvenThread kế thừa từ Thread và thực hiện theo yêu cầu:
     * Viết run() của OddThread sao cho xuất các số lẻ từ 1 đến 10, các số được xuất ra cách nhau 10 mili giây.
     * Viết run() của EvenThread sao cho xuất các số lẻ từ 1 đến 10, các số được xuất ra cách nhau 15 mili giây.
     * Tạo lớp TestThread chứa phương thức main() sau đó tạo 2 đối tượng từ 2 lớp OddThread và EvenThread, start() các thread này.
     * Tìm cách sử dụng join() để cho phép xuất các số lẻ trước mới đến các số chẵn.
     * ***/
    @Override
    public void run() {
        for (int i = 1; i <= 10; i+=2) {
            System.out.println("Các số chẵn là : " + i);
            try {
                Thread.sleep(10);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}
