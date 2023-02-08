package uaslp.objetos.list.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList newList = new LinkedList();

        newList.addAtHead("Hola");
        int tam = newList.getSize();
        System.out.println(tam);
        String texto = newList.getAt(1);
        System.out.println(texto);

        newList.addAtHead("Adios");
        tam = newList.getSize();
        System.out.println(tam);
        texto = newList.getAt(1);
        System.out.println(texto);

        newList.addAtTail("Dany");
        tam = newList.getSize();
        System.out.println(tam);
        texto = newList.getAt(2);
        System.out.println(texto);

        newList.setAt(2, "Hello");
        tam = newList.getSize();
        System.out.println(tam);
        texto = newList.getAt(2);
        System.out.println(texto);

        newList.remove(2);
        tam = newList.getSize();
        System.out.println(tam);
        texto = newList.getAt(1);
        System.out.println(texto);

        System.out.println();
        for(int i = 0; i < 5; i++){
            newList.addAtTail("Repetido");
        }
        //newList.addAtTail("Repetido");
        //newList.addAtTail("Repetido");
        newList.addAtTail("Fin");

        tam = newList.getSize();
        System.out.println(tam);

        LinkedListIterator iterator = newList.getIterator();
        while(iterator.hasNext()){
            String viewData = iterator.next();
            System.out.println(viewData);
        }
        String viewData = iterator.next();
        System.out.println(viewData);
        System.out.println();

        newList.removeAllWithValue("Repetido");

        tam = newList.getSize();
        System.out.println(tam);
        LinkedListIterator iterator2 = newList.getIterator();
        while(iterator2.hasNext()){
            String viewData2 = iterator2.next();
            System.out.println(viewData2);
        }
        String viewData2 = iterator2.next();
        System.out.println(viewData2);

    }
}