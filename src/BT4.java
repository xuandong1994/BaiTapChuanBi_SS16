public class BT4 {
    /**
     * Luyện tập tạo thread
     * Mô tả bài toán
     * Tạo hai lớp triển khai Runnable khác nhau là LazyPrimeFactorization và OptimizedPrimeFactorization.
     * Cả hai runnable khi start() đều làm công việc liên tục tìm ra những số nguyên tố mới và thông báo.
     * Tuy vậy runnable LazyPrimeFactorization sử dụng thuật toán tìm số nguyên tố chưa tối ưu,
     * và OptimizedPrimeFactorization sử dụng một thuật toán tối ưu hơn (chẳng hạn chỉ tìm kiếm tới căn bậc hai của số đang tra xét).
     * <p>
     * Start đồng thời hai runnable và quan sát kết quả.
     ***/
    public static void main(String[] args) {

        Runnable lazyRunnable = new LazyPrimeFactorization();
        Runnable optimizedRunnable = new OptimizedPrimeFactorization();

        Thread lazyThread = new Thread(lazyRunnable);
        Thread optimizedThread = new Thread(optimizedRunnable);

        lazyThread.start();
        optimizedThread.start();


    }

}
