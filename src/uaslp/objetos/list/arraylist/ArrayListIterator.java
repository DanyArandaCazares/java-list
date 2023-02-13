package uaslp.objetos.list.arraylist;

public class ArrayListIterator {
    private String []array;
    private int position;

    ArrayListIterator(String []currentArray){
        array = currentArray;
    }

    public boolean hasNext(){
        return position < array.length;
    }

    public String next(){
        int i = position;
        position = i + 1;
        return array[i];
    }
}
