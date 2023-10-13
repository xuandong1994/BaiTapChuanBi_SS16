public class BT7 {
    /**
     * Viết chương trình Java để tạo hai thread, một thread in ra các số chẵn từ 1 đến 100,
     * một thread in ra các số lẻ từ 1 đến 100.***/
    public class thread extends Thread{
        @Override
        public void run() {
            for (int i = 1; i < 100; i++) {
                if (i%2 == 0){
                    System.out.println("Các số chắn là ");
                }

            }
        }
    }
    public class thread1 extends Thread{
        @Override
        public void run() {
            for (int i = 1; i <100 ; i++) {
                if (i%2 !=0) {
                    System.out.println("các số lẻ là ");
                }

            }
        }
    }

}
