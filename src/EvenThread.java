public class EvenThread extends Thread{
    @Override
    public void run() {
        for (int i = 2; i <=10 ; i+=2) {
            System.out.println("Các số chắn " + i);
            try {
                Thread.sleep(15);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
