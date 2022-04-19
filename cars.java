class CarException extends Exception {
}

class cars {
    private int num;
    private double gas;

    public cars() {
        num = 0;
        gas = 0.0;
        System.out.println("Created a car");
    }
    public void setcar(int n, double g) throws CarException {
        if(g < 0) {
            CarException e = new CarException();
            throw e;
        } else { 
            num = n;
            gas = g;
            System.out.println("I changed the number to" + num + "and the amount of gasoline to" + gas);
        }
    }
    public void show() {
        System.out.println("The car number is" + num);
        System.out.println("The amount of gasoline is" + gas);
    }
}

class carsample {
    public static void main(String[] agrs) {
        cars car1 = new cars();
        try {
            car1.setcar(1234, -1.0);
        } catch(CarException e) {
            System.out.println(e + "Was released");
        }
        car1.show();
    }
}
