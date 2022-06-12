package Generics;

import java.util.*;

public class main_2 {
  public static void main(String[] args) {
    List<Number> doubles = new ArrayList<>();
    doubles.add(4.2);
    doubles.add(8.2);

    B(doubles, 24);
    System.out.println(doubles);
  }

  private static void B(List<? super Integer> list, int value) { 
    list.add(value);
  }
}
 