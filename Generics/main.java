package Generics;

import java.util.*;

public class main {
  public static void main(String[] args) {
    List<Number> doubles = new ArrayList<>();
    doubles.add(4.2);
    doubles.add(8.2);
    System.out.println(A(doubles));
  }

  private static int A(List<? extends Number> list) {
    Number num = list.get(0);
    return num.intValue();
  }
}
  

