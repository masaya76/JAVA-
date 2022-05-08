package Chapter15;

public class Thread_practice implements Runnable {
    int num;

    public Thread_practice(int num) {
        this.num = num;
    }

    public void run() {
        for(int i = 1; i <= 3; i++) {
            try{
                Thread.sleep(1000);
                System.out.println("Thread_practice " + num + " thread : " + i + " Number of times");
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        } 
    }

}
