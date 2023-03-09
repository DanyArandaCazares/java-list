package uaslp.objetos.list.arraylist;

import uaslp.objetos.list.Iterator;
import uaslp.objetos.list.List;

public class ArrayList implements List {
    public static final int INITIAL_SIZE = 2;
    private Object []array;
    private int size;
    public ArrayList(){
        array = new Object[INITIAL_SIZE];
    }
    public void addAtTail(Object data){
        if(size == array.length){
            increaseSize();
        }
        array[size] = data;
        size++;
    }
    public void addAtHead(Object data){
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
        Object []newArray = new Object[array.length * 2];

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
    public void setAt(int index, Object data){
        if(index > size){
            return;
        }
        array[index - 1] = data;
    }
    public Object getAt(int index){
        if(index > size){
            return "Error";
        }
        return array[index - 1];
    }
    public void removeAllWithValue(Object data){
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
    public Iterator getIterator(){
        return  new ArrayListIterator(array);
    }
}
