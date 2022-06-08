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

    
}