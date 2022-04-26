package Chapter13;

public interface Phone {
    final int MAX_NUMBER_DIGITS = 11;
    
    void call(String number);
    
    default void poweroff() {
        System.out.println("The off the power");
    }
}
