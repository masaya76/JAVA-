package Other;

abstract class Vehicle {
  protected int speed;

  public void setSpeed(int s) {
    speed = s;
    System.out.println("I set the " + speed + " to");
  }

  abstract void show();
}

class Car extends Vehicle {
  private int num;
  private double gas;

  public Car(int n, double g) {
    this.num = n;
    this.gas = g;
    System.out.println("Created a car with number " + num + " and" + gas + " petrol");
  }
  
  public void show() {
    System.out.println("The car " + num);
    System.out.println("The amount of gasoline is " + gas);
    System.out.println("The speed is " + speed);
  }
}

class Plane extends Vehicle {
  private int flight;

  public Plane(int f) {
    this.flight = f;
    System.out.println("Flight " + 21 + " created an airplane");
  }

  public void show() {
    System.out.println("The flight is " + flight);
    System.out.println("The speed is " + speed);
  }
}

class objectClass {
  public static void main(String[] args) {
    Vehicle[] hoge;
    hoge = new Vehicle[2];

    hoge[0] = new Car(1234, 12.3);
    hoge[0].setSpeed(60);

    hoge[1] = new Plane(212);
    hoge[1].setSpeed(500);

    for (int i = 0; i < hoge.length; i++) {
      hoge[i].show();
    }
  }
}