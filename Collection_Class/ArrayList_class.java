package Collection_Class;

import java.util.*;

public class ArrayList_class {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>() {
            {
              add("window");
              add("mac");
              add("linux");
            }
        };

        for (String str : list) {
            System.out.println(str);  
        }

        System.out.println("The second elemet is " + list.get(1));
        System.out.println(list.contains("mac"));

        if(!list.isEmpty()) {
            System.out.println("The number of elements is " + list.size());
        }

        list.remove(0);
        System.out.println(list);

        list.clear();
        System.out.println(list);
    }
}
