public class BT3 {
    public static void main(String[] args) {
        OddThread oddThread =new OddThread();
        EvenThread evenThread = new EvenThread();
        oddThread.start();
        evenThread.start();
    }

}
