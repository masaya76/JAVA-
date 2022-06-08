package Generics;

public class main {
  public static void main(String[] args) {
     
      generics<String> cstr = new generics<String>("Hello ");
      String str = cstr.getValue();
      System.out.println(str);

      generics<Integer> cint = new generics<Integer>(100);
      Integer inum = cint.getValue();
      System.out.println(inum);
  }
}
  

