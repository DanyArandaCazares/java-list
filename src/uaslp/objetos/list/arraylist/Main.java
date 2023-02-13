package uaslp.objetos.list.arraylist;
import uaslp.objetos.list.linkedlist.LinkedList;
import uaslp.objetos.list.linkedlist.LinkedListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList newArray = new ArrayList();
        ArrayListIterator iterator = newArray.getIterator();
        newArray.addAtHead("Hola");
        newArray. addAtTail("Adios");

        int tam = newArray.getSize();

        String content;

        System.out.println(tam);
        while (iterator.hasNext()){
            content = iterator.next();
            System.out.println(content);
        }

        String text = newArray.getAt(1);
        System.out.println(text);
        newArray.setAt(1, "Hello");
        text = newArray.getAt(1);
        System.out.println(text);

        newArray.remove(1);
        text = newArray.getAt(1);
        System.out.println(text);

        tam = newArray.getSize();
        System.out.println(tam);
        System.out.println();

        ArrayListIterator iterator2 = newArray.getIterator();

        for(int i = 0; i < 3; i++){
            newArray.addAtHead("Repetido");
        }

        tam = newArray.getSize();
        System.out.println(tam);

        for(int i = 0; i < newArray.getSize(); i++){
            String content2 = newArray.getAt(i+1);
            System.out.println(content2);
        }
        System.out.println();
        newArray.removeAllWithValue("Repetido");

        for(int i = 0; i < newArray.getSize(); i++){
            String content2 = newArray.getAt(i+1);
            System.out.println(content2);
        }
        tam = newArray.getSize();
        System.out.println(tam);

        for(int i = 0; i < 3; i++){
            newArray.addAtTail("Fin");
        }
        for(int i = 0; i < newArray.getSize(); i++){
            String content2 = newArray.getAt(i+1);
            System.out.println(content2);
        }
        tam = newArray.getSize();
        System.out.println(tam);

        newArray.removeAll();
        for(int i = 0; i < newArray.getSize(); i++){
            String content2 = newArray.getAt(i+1);
            System.out.println(content2);
        }
        tam = newArray.getSize();
        System.out.println(tam);
    }
}