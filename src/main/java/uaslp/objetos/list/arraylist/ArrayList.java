package uaslp.objetos.list.arraylist;

import uaslp.objetos.list.Iterator;
import uaslp.objetos.list.List;

public class ArrayList<T> implements List<T> {
    public static final int INITIAL_SIZE = 2;
    private T []array;
    private int size;
    @SuppressWarnings("unchecked")
    public ArrayList(){
        array = (T[])(new Object[INITIAL_SIZE]);
    }
    public void addAtTail(T data){
        if(size == array.length){
            increaseSize();
        }
        array[size] = data;
        size++;
    }
    public void addAtHead(T data){
        if(size == array.length){
            increaseSize();
        }
        for(int i = size; i > 0; i--){
            array[i] = array[i-1];
        }
        array[0] = data;
        size++;
    }
    public void increaseSize(){
        T []newArray = (T[]) (new Object[array.length * 2]);

        for(int i = 0; i < array.length; i++){
            newArray[i] = array[i];
        }

        array = newArray;
    }
    public void remove(int index){
        for(int i = index; i < size; i++){
            array[i - 1] = array[i];
        }
        array[size - 1] = null;
        size--;
    }
    public void removeAll(){
        for(int i = 0; i < size; i++){
            array[i] = null;
        }
        size = 0;
    }
    public void setAt(int index, T data){
        if(index > size){
            return;
        }
        array[index - 1] = data;
    }
    public T getAt(int index){
        return (T)array[index - 1];
    }
    public void removeAllWithValue(T data){
        int tam = size;
        for(int i = 0; i < tam; i++){
            if(array[i] == null){
                return;
            }
            if(array[i].equals(data)){
                remove(i+1);
                i--;
            }
        }
    }
    public int getSize(){
        return size;
    }
    public Iterator<T> getIterator(){
        return (Iterator<T>) new ArrayListIterator<>(array);
    }
}
