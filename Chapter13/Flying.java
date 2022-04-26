package Chapter13;

public interface Flying {
    void fly();

    default void powerOff() {
        System.out.println("If it is flying, it will fall.");
    }

    public void poweroff();
}
