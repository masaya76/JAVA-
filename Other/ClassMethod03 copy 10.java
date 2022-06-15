import Human.Human02;

public class ClassMethod03 {
    public static void main(String[] args) {
        Human02 yamada = new Human02();

        System.out.println("nameha" + yamada.name + "desu");
        String profile = yamada.getProfile();
        System.out.println(profile + "desu");

        yamada.greet("tanabe");
        yamada.greet(null);
    }
}


/*The declared package "ClassMethod03" does not match the expected package ""*/