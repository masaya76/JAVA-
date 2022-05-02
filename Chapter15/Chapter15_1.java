package Chapter15;

public class Chapter15_1 {
    public static void main(String[] main) {
        int a = 976;
        int b = 427;
        System.out.println(a + b + "Greatest common divisor = " + gcd(a, b));

    }

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        System.out.println(a);
        return gcd(b, a % b);
    }
}
