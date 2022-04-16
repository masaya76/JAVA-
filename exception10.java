public class exception10 {
    public static void main(String[] args) {
        try {
            exception10.division(100, 0);
        } catch (ArithmeticException e) {
            System.out.println("ArirhmeticException Exception occured");
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException Exception occured");
            throw e;
        }
        System.out.println("The end of the program");
    }

    public static void division(int a, int b) {
        System.out.println(a + "/" + b + "ha?");
        if (b == 0) {
            throw new IllegalArgumentException("The argument is invalid");
        } 
        int result = a / b;
        System.out.println("Calculation result" + result);
    }
}