package main.java.uaslp.objetos.list.arraylist;


import main.java.uaslp.objetos.list.BadIndexException;
import main.java.uaslp.objetos.list.Iterator;
import main.java.uaslp.objetos.list.List;
import main.java.uaslp.objetos.list.NotNullAllowedException;

public class ArrayList<T> implements List<T> {
    public static final int INITIAL_SIZE = 2;
    private T []array;
    private int size;

    public ArrayList(){
        array = (T[])(new Object[INITIAL_SIZE]);
    }
    public void addAtTail(T data) throws NotNullAllowedException {
        if(data == null){
            throw new NotNullAllowedException();
        }
        if(size == array.length){
            increaseSize();
        }
        array[size] = data;
        size++;
    }
    public void addAtHead(T data) throws NotNullAllowedException{
        if(data == null){
            throw new NotNullAllowedException();
        }
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
    public void remove(int index) throws BadIndexException {
        if(index < 1){
            throw new BadIndexException();
        }
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
    public void setAt(int index, T data) throws NotNullAllowedException, BadIndexException{
        if(data == null){
            throw new NotNullAllowedException();
        }
        if(index < 1){
            throw new BadIndexException();
        }
        if(index > size){
            return;
        }
        array[index - 1] = data;
    }
    public T getAt(int index) throws BadIndexException{
        if(index < 1){
            throw new BadIndexException();
        }
        return (T)array[index - 1];
    }
    public void removeAllWithValue(T data){
        int tam = size;
        for(int i = 0; i < tam; i++){
            if(array[i] == null){
                return;
            }
            if(array[i].equals(data)){
                try {
                    remove(i+1);
                }catch (BadIndexException ex){

                }

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
