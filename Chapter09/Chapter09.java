package Chapter09;

public class Chapter09 {
    public static void main(String[] args) {
        double fueCost = 12.5;
        double fueAmount = 55.0;

        Car car = new Car(fueCost, fueAmount);

        car.move(20);
        System.out.println("Remaining amount" + car.getFuelAmount() + "desu");
    }
 }
