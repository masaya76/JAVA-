public class Capsule01 {
    public static void main(String[] agrs) {
        HumanNoCapsule human1 = new HumanNoCapsule("tanaka", 25);
        human1.name = "imada";
        human1.age = 52;
        System.out.println("The name is" + human1.name + "Age is" + human1.age);

        HumanCapsule human2 = new HumanCapsule("kobayasi", 28);
        System.out.println("Name id" + human2.getName() + "Age is" + human2.getAge() );
        human2.setName("sasaki");
        System.out.println("The changed name is" + human2.getName());
    }
}
