package Chapter15;

class Thread_1 {
    public static void main(String[] args) {
        Car car1 = new Car("A");
        Thread th1 = new Thread(car1);
        th1.start();

        Car car2 = new Car("B");
        Thread th2 = new Thread(car2);
        th2.start();

        for(int i = 0; i < 5; i++) {
            try { 
                Thread.sleep(1000);
                System.out.println("Processing main()");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
