package Chapter13;

public class FlyingPhone implements Phone, Flying {
    private int minutes;

    public FlyingPhone(int minutes) {
        this.minutes = minutes;
    }

    public void fly() {
        System.out.println("Fly for " + this.minutes + " minutes");
    }

    public void call(String number) {
        System.out.print("call " + number + ". You can talk only while you are flying.");
    }

    public void poweroff() {
        Flying.super.powerOff();
    }
}
