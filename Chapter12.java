public class Chapter12 {
    public static void main(String[] agrs) {
        CapsuleMan human01 = new CapsuleMan("kobayasi", 32);
        System.out.println("Name is " + human01.getName() + "Age is " + human01.getAge() );
        human01.setAge(33);
        System.out.println("Now that I have a birthday, I am " + human01.getAge() + "years old.");
    }
}
