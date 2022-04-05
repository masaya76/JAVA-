public class ClassMethod01 {
    public static void main(String[] args) {
        Human01 Yamada = new Human01();
        System.out.println("namaeha" + Yamada.name + "de,nennreiha" + Yamada.age + "desu");

        Human01 sato = new Human01("satou", 25);
        System.out.println("namaha" + sato.name + "de,nennreha" + sato.age + "desu");
    }
}
