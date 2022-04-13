public class exception10 {
    public static void main(String[] args) {
        try {
            System.out.println("100 / 0 ha?");
            int result = 100/0;
            System.out.println("Calculation result" + result);
        } catch (Exception e) {
            System.out.println("Exception occured");
        } finally {
            System.out.println("The end of the program");
        }
    }
}
