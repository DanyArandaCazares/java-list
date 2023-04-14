package main.java.uaslp.objetos.list;

public interface List <T>{
    void addAtTail(T data) throws NotNullAllowedException;
    void addAtHead(T data) throws NotNullAllowedException;
    void increaseSize();
    void remove(int index) throws BadIndexException;
    void removeAll();
    void setAt(int index, T data) throws BadIndexException, NotNullAllowedException;
    Object getAt(int index) throws BadIndexException;
    void removeAllWithValue(T data);
    int getSize();
    Iterator<T> getIterator();
}
