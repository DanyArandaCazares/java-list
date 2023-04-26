package uaslp.objetos.list.linkedlist;

public class Node<T> {
    T data;
    Node<T> next;
    Node<T> previous;

    Node(){
        next = null;
        previous = null;
    }
}

