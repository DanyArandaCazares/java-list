package uaslp.objetos.list.linkedlist;

import uaslp.objetos.list.Iterator;
import uaslp.objetos.list.List;

public class LinkedList implements List {
    private Node head;
    private Node tail;
    private int size;

    public void increaseSize(){
        size++;
    }
    public void addAtTail(Object data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.previous = tail;
        if(head == null){
            head = newNode;
        }else{
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }
    public void addAtHead(Object data){
        Node node = new Node();
        node.data = data;
        if(head == null){
            head = node;
            tail = node;
            size++;
            return;
        }
        node.next = head;
        head.previous = node;
        head = node;
        size++;
    }
    public void remove(int index){
        Node iterator = head;
        if(head == null){
            return;
        }
        for(int i = 1; i<size && index > 0; i++){
            if(i == index && iterator.next == null){
                if(iterator.previous != null){
                    tail = iterator.previous;
                    iterator.previous.next = null;
                    size--;
                    return;
                }else{
                    head = null;
                    tail = null;
                    size--;
                    return;
                }
            }else if(i == index && iterator.previous == null){
                head = iterator.next;
                iterator.next.previous = null;
                size--;
                return;
            }else if(i == index){
                iterator.previous.next = iterator.next;
                iterator.next.previous = iterator.previous;
                size--;
            }
            iterator = iterator.next;
        }
    }
    public  void  removeAll(){
        tail = null;
        head = null;
        size = 0;
    }
    public void setAt(int index, Object data){
        Node iterator = head;
        if(index > size){
            return;
        }
        for(int i = 1; i < index; i++){
            iterator = iterator.next;
        }
        iterator.data = data;
    }
    public Object getAt(int index){
        Node iterator = head;
        if(index > size){
            return "Error";
        }
        for(int i = 1; i < index; i++){
            iterator = iterator.next;
        }
        return iterator.data;
    }
    public void removeAllWithValue(Object data){
        Node iterator = head;
        if(size == 0){
            return;
        }
        for(int i = 0; iterator != null; i++){
            //String comp = iterator.data;
            if(iterator.data.equals(data) && (iterator.next == null)){
                if(iterator.previous != null){
                    tail = iterator.previous;
                    iterator.previous.next = null;
                    size--;
                }else{
                    head = null;
                    tail = null;
                    size--;
                }
            }else if(iterator.data.equals(data) && (iterator.next != null)){
                if(iterator == head){
                    head = iterator.next;
                    iterator.next.previous = iterator.previous;
                    size--;
                }else{
                    iterator.next.previous = iterator.previous;
                    iterator.previous.next = iterator.next;
                    size--;
                }
            }else if(iterator.data.equals(data) && (iterator.previous == null)){
                head = iterator.next;
                iterator.next.previous = null;
                size--;
            }else if(iterator.data.equals(data)){
                iterator.previous.next = iterator.next;
                iterator.next.previous = iterator.previous;
                size--;
            }
            iterator = iterator.next;
        }
    }
    public int getSize(){
        return size;
    }
    public Iterator getIterator(){
        return new LinkedListIterator(head);
    }
}
