package Chapter15;

import java.io.*;

public class Input_Output {
    public static void main(String[] ager) {
        System.out.println("Please enter a atring");
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine();
            System.out.println("Has been entered" + str);
        } catch(IOException e) {
            System.out.println("I / O error");
        }
    }
}
