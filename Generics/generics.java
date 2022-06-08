package Generics;

import java.util.ArrayList;
import java.util.List;

class generics<T> {
    private T value;
 
    public generics(T val){
        this.value = val;
    }
 
    public T getValue(){
        return value;
    }

    public class generics {
        public static void main(String[] args) {
            // String型のジェネリクス
            generics<String> cstr = new generics<String>("Hello ポテパン！");
            String str = cstr.getValue();
            System.out.println(str);
    
            // Integer型のジェネリクス
            generics<Integer> cint = new generics<Integer>(100);
            Integer inum = cint.getValue();
            System.out.println(inum);
        }
    }
}