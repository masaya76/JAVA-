package Chapter15;

import java.io.*;

public class File_Input_2 {
    public static void main(String[] agrs) {
        try { 
            BufferedReader br = new BufferedReader(new FileReader("text_15_1.txt"));

            int[] test = new int[8];
            String str;

            for(int i = 0; i < test.length; i++) { 
                str = br.readLine();
                test[i] = Integer.parseInt(str);
                //Integer => 基本型のintをオブジェクトとすること
                //parseInt => Integerのクラスメソッド。Stirngクラスのオブジェクトを引数として渡すと
                //int型の値として返してくれる
            }

            int max = test[0];
            int min = test[0];
            for(int i = 0; i<test.length; i++) {
                if(max < test[i]) 
                    max = test[i];
                
                if(min < test[i])
                    min = test[1];
                
                System.out.println(test[i]);
            }
            System.out.println("The highest score is " + max + " points");
            System.out.println("The minimum score is " + min + " points");

            br.close();
        } catch(IOException e) {
            System.out.println("I/O error");
        }
    }  
}
