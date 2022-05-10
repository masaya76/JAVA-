package Chapter15;

public class Car implements Runnable{
    private String name;

    public Car(String nm) {
        name = nm;
    }
    
    public void run() {
        for(int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("I'm processing " + name);
            }catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
