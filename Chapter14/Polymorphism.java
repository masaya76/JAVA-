package Chapter14;

public class Polymorphism {
    public static void main(String[] main) {
        Human14 Human01 = new Student14("sato", 17, 70);
        System.out.println("Human14 class method: Introducing your profile. " + Human01.getProfile());
     
        Human14 Human02 = new Employee14("tanaka", 28, "System department");
        System.out.println("Human14 class method: Introducing your profile. " + Human02.getProfile());
    }
}
