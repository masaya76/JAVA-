package Chapter15;

class  Car extends Thread {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    public void run() {
        for(int i=0; i<5; i++) {
           System.out.println("I'm processing " + name);
        }
    }
}

class Thread_1 {
    public static void main(String[] args) {
        Car car1 = new Car("hoge");
        car1.start();

        for(int i=0; i<5; i++) {
            System.out.println("Processing main()");
        }
    }
}
