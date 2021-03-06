package Chapter09;

public class Car {
    private double fuelCost;
    private double fuelAmount;

    public Car(double fuelCost, double fuelAmount) {
        this.fuelCost = fuelCost;
        this.fuelAmount = fuelAmount;
    }

    public void move(int km) {
        System.out.println(km + "km run");
        this.fuelAmount -= (km / fuelCost);
    }

    public double getFuelAmount() {
        return this.fuelAmount;
    }

}
