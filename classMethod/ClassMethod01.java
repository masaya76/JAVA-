package classMethod;

import classMethod.human.Human01;

public class ClassMethod01 {
    public static void main(String[] args) {
        Human01 yamada = new Human01();
        System.out.println("namaeha" + yamada.name + "denennreiha" + yamada.age + "desu");

        Human01 sato = new Human01("佐藤", 25);
        System.out.println("namae" + sato.name + "denennreiha" + sato.age + "desu");
    }
}
