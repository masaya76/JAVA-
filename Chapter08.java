public class Chapter08 {
    public static void main(String[] args) {
        int number = 2;
        while (number < 50) { 
            number *= 2;
            System.out.println("while01 = " + number);
        }
        
        int num = 1;
        while (num < 5) {
            System.out.println(num * num);
            num++;
        }

        int array[] = {1, 4, 14, 25};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        for (int val : array) {
            if (val % 2 == 0) {
                continue;
            }
            System.out.println(val);
        }

    }
}
