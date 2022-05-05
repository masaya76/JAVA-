package Chapter15;

import java.io.*;

public class File_Input { 
    public static void main(String[] agrs) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("text_15.txt"));

            String str1 = br.readLine();
            String str2 = br.readLine();

            System.out.println("The two strings written in the file");
            System.out.println("Is " + str1);
            System.out.println("Is " + str2);

            br.close();
        } catch(IOException e) {
            System.out.println("I/O error");
        } 
    }
}
