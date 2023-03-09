package uaslp.objetos.list.arraylist;

import uaslp.objetos.list.Iterator;

public class ArrayListIterator implements Iterator {
    private Object []array;
    private int position;

    ArrayListIterator(Object []currentArray){
        array = currentArray;
    }
    public boolean hasNext(){
        return position < array.length;
    }
    public Object next(){
        int i = position;
        position = i + 1;
        return array[i];
    }
}
