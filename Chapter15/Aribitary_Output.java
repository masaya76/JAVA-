package Chapter15;

import java.io.*;

public class Aribitary_Output {
    public static void main(String[] args) {
        if(args.length !=1) {
            System.out.println("Estimate the file correctly");
            System.exit(0);
        } try {
          BufferedReader br = new BufferedReader(new FileReader(args[0]));

          String str;
          while((str = br.readLine())!=null) {
              System.out.println(str);
          }
          br.close();
        } catch(IOException e) {
            System.out.println("I/O error");
        }
    }
}