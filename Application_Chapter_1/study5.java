package Application_Chapter_1;

import javax.print.attribute.standard.PrinterMessageFromOperator;

public enum study5 {
    APPLE(100) {
        @Override
        void advertise() {
            System.out.println("The bright apple is " + getPrice() + " yen");
        }
    },
    ORANGE(200) {
        @Override
        void advertise() {
            System.out.println("Orange orange is " + getPrice() + "yen");
        }
    },
    ;

    private int price;
    private study5(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }

    abstract void advertise();

    public static void main(String[] args) {
        study5.APPLE.advertise();
        study5.ORANGE.advertise();
    }
}



