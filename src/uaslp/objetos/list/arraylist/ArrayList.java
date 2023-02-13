package uaslp.objetos.list.arraylist;

public class ArrayList {
    public static final int INITIAL_SIZE = 2;
    private String []array;
    private int size;

    public ArrayList(){
        array = new String[INITIAL_SIZE];
    }

    public void addAtTail(String data){
        if(size == array.length){
            increaseSize();
        }
        array[size] = data;
        size++;
    }

    public void addAtHead(String data){
        if(size == array.length){
            increaseSize();
        }
        for(int i = size; i > 0; i--){
            array[i] = array[i-1];
        }
        array[0] = data;
        size++;
    }

    private void increaseSize(){
        String []newArray = new String[array.length * 2];

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

    public void setAt(int index, String data){
        if(index > size){
            return;
        }
        array[index - 1] = data;
    }

    public String getAt(int index){
        if(index > size){
            return "Error";
        }
        return array[index - 1];
    }

    public void removeAllWithValue(String data){
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

    public ArrayListIterator getIterator(){
        return  new ArrayListIterator(array);
    }

}
