package uaslp.objetos.list;

public interface List <T>{
    void addAtTail(T data);
    void addAtHead(T data);
    void increaseSize();
    void remove(int index);
    void removeAll();
    void setAt(int index, T data);
    Object getAt(int index);
    void removeAllWithValue(T data);
    int getSize();
    Iterator<T> getIterator();
}
