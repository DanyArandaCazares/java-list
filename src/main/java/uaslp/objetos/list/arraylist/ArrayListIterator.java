package main.java.uaslp.objetos.list.arraylist;


import main.java.uaslp.objetos.list.Iterator;

public class ArrayListIterator<T> implements Iterator<Object> {
    private T []array;
    private int position;

    ArrayListIterator(T []currentArray){
        array = currentArray;
    }
    public boolean hasNext(){
        return position < array.length;
    }
    public T next(){
        int i = position;
        position = i + 1;
        return array[i];
    }
}
