import java.io.FileNotFoundException;
import java.io.FileReader;

public class exception10 {
    public static void main(String[] args) {
        try {
            exception10.readFile("exception.txt");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException exception occurd");
        }
        System.out.println("The end of the program");
    }

    public static void readFile(String fileName) throws FileNotFoundException {
        System.out.println("Start reading the file");
        FileReader hoge = new FileReader(fileName);
        System.out.println(fileName + "reading comple");
    }
}