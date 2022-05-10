package Chapter15;

public class Chapter15_4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 2; i++) {

            Thread_practice mt = new Thread_practice(i);
            
            Thread thread = new Thread(mt);

            thread.start();
        }

        for (int i = 1; i <= 3; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("Chapter15_4 thread : " + i + "Number of times");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
