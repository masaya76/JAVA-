package Chapter;
public class Chapter07 {
    public static void main(String[] args) {
        int distance = 12;
        if (distance < 5) {
            System.out.println("very close");
        }else if (distance < 10) {
            System.out.println("is close");
        } else if (distance < 15) {
            System.out.println("far");
        } else {
            System.out.println("very far");
        }

        String color = "yellow";
        switch (color) {
            case "blue":
                System.out.println("blue");
                break;
            case "yellow":
                System.out.println("yellow");
                break;
            case "red":
                System.out.println("red");
                break;
            default :
                System.out.println("nocolor");
        }
    }
}
