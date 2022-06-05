package Generics;

import java.util.*;

public class generics { 
    public static void main(String[] args) {
        List<Apple> list = new ArrayList<Apple>() {
            {
                add("window");
                add("mac");
                add("linux");
            }
        }
    };

    class Apple {
        private String name;

        Apple(String name) {
            Apple appleBasket = new Apple("fuzi");
            System.out.println(appleBasket.getName());
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