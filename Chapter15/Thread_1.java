package Chapter15;


class Thread_1 {
    public static void main(String[] args) {
        Car car1 = new Car("A");
        car1.start();

        for(int i = 0; i < 5; i++) {
            System.out.println("Processing main()");
        }
    }
}
