package uaslp.objetos.list.linkedlist;

import uaslp.objetos.list.Iterator;

public class LinkedListIterator<T> implements Iterator<T> {
    private Node<T> currentNode;

    public LinkedListIterator(Node<T> head){
        currentNode = head;
    }
    public boolean hasNext(){
        return currentNode.next != null;
    }

    public T next(){
        T data = currentNode.data;

        currentNode = currentNode.next;

        return data;
    }
}
