package uaslp.objetos.list.arraylist;
import uaslp.objetos.list.Iterator;
import uaslp.objetos.list.List;
import uaslp.objetos.list.linkedlist.LinkedList;
import uaslp.objetos.list.linkedlist.LinkedListIterator;

public class Main {
    public static void main(String[] args) {
        List lista1 = new LinkedList();
        List lista2 = new ArrayList();

        System.out.println();

        System.out.println("Prueba sobre la linked list:");
        TryList(lista1);

        System.out.println();

        System.out.println("Prueba sobre la array list:");
        TryList(lista2);
    }

    public static void TryList(List list){
        System.out.println("Inserta al inicio y al final");
        list.addAtHead("Hola");
        list. addAtTail("Adios");
        Iterator iterator = list.getIterator();
        System.out.println("Puede leer el tamaño de la lista");
        int tam = list.getSize();

        Object content;

        System.out.println(tam);
        System.out.println("Contenido de la lista");
        while (iterator.hasNext()){
            content = iterator.next();
            System.out.println(content);
        }
        System.out.println();

        System.out.println("Lee contenido en la primera posición");
        Object text = list.getAt(1);
        System.out.println(text);
        System.out.println();

        System.out.println("Agrega y lee contenido en la primera posición");
        list.setAt(1, "Hello");
        text = list.getAt(1);
        System.out.println(text);
        System.out.println();

        System.out.println("Elimina contenido en la primera posición, lee contenido actualizado de la primera posición e imprime el tamaño de la lista");
        list.remove(1);
        text = list.getAt(1);
        System.out.println(text);

        tam = list.getSize();
        System.out.println(tam);

        Iterator iterator2 = list.getIterator();

        for(int i = 0; i < 3; i++){
            list.addAtHead("Repetido");
        }

        System.out.println("Agrega contenido repetido(3) e imprime el tamaño");
        for(int i = 0; i < list.getSize(); i++){
            Object content2 = list.getAt(i+1);
            System.out.println(content2);
        }
        tam = list.getSize();
        System.out.println(tam);
        System.out.println();

        System.out.println("Elimina el contenido repetido e imprime su tamaño");
        list.removeAllWithValue("Repetido");

        for(int i = 0; i < list.getSize(); i++){
            Object content2 = list.getAt(i+1);
            System.out.println(content2);
        }
        tam = list.getSize();
        System.out.println(tam);
        System.out.println();

        System.out.println("Agrega más contenido al final e imprime el tamaño actualizado");
        for(int i = 0; i < 3; i++){
            list.addAtTail("Fin");
        }
        for(int i = 0; i < list.getSize(); i++){
            Object content2 = list.getAt(i+1);
            System.out.println(content2);
        }
        tam = list.getSize();
        System.out.println(tam);
        System.out.println();

        System.out.println("Elimina todo el contenido y regresa el tamaño actualizado");
        list.removeAll();
        for(int i = 0; i < list.getSize(); i++){
            Object content2 = list.getAt(i+1);
            System.out.println(content2);
        }
        tam = list.getSize();
        System.out.println(tam);
    }
}