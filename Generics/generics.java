package Generics;

import java.util.LinkedHashSet;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public class generics { 
    public static void main(String[] args) {
        Basket<Apple> appleBasket = new Basket<>(new Apple("fuji"));
        System.out.println(appleBasket.get().getNanme);
    }

    class Apple {
        private String name;

        Apple(String name) {
            this.name = name;
        }

        String getName() {
            return name;
        }
    }

    class Peach {
        private String name;

        Peach(String name) {
            this.name = name;
        }

        String getName() {
            return name;
        }

    }
}