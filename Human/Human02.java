package Human;

public class Human02 {
    public String name;
    public int age;
    public String profession;

    public Human02() {
        this.name = "yamada";
        this.age = 20;
        this.profession = "programer";
    }

    public String getProfile() {
        return "nennreiha" + this.age + "syokugyouyha" + this.profession;
    }

    public void greet(String friend) {
        if (friend == null) {
          System.out.println("aisatusurutomodatigawakarimasenn");
          return;
        }
        System.out.println(friend + "sankonnnitiwa");
    }
}
