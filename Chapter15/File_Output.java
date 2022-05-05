package Chapter15;

import java.io.*;

class File_Output {
    public static void main(String[] agrs) {
        try {
          PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("text_15.txt")));

          pw.println("Hello");
          pw.println("GoodBye");
          System.out.println("Written to file");

          pw.close();
        } catch(IOException e) {
            System.out.println("I/O error");
        }
    }
}