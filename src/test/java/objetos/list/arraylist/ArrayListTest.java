package objetos.list.arraylist;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import uaslp.objetos.list.BadIndexException;
import uaslp.objetos.list.Iterator;
import uaslp.objetos.list.NotNullAllowedException;
import uaslp.objetos.list.arraylist.ArrayList;

public class ArrayListTest {
    @Test
    public void whenListIsCreated_thenIsEmpty(){
        //Iniciualiación
        ArrayList<String> list = new ArrayList<>();
        //Ejecución
        boolean isEmpty = (list.getSize() == 0);
        int size = list.getSize();
        //Validación
        Assertions.assertTrue(isEmpty);
        Assertions.assertEquals(0, size);
    }

    @Test
    public void whenAddAtTail_verifyCorrectValue() throws NotNullAllowedException, BadIndexException {
        ArrayList<String> list = new ArrayList<>();

        list.addAtTail("1");
        list.addAtTail("1");
        list.addAtTail("1");
        list.addAtTail("1");
        list.addAtTail("1");
        String value = list.getAt(1);

        Assertions.assertEquals("1", value);
    }

    @Test
    public void whenAddAtHead_verifyCorrectValue() throws NotNullAllowedException, BadIndexException {
        ArrayList<String> list = new ArrayList<>();

        list.addAtHead("1");
        String value = list.getAt(1);

        Assertions.assertEquals("1", value);
    }

    @Test
    public void whenUsingIncreaseSize_verifySizeDoesntIncrease(){
        ArrayList<String> list = new ArrayList<>();

        list.increaseSize();
        int size = list.getSize();

        Assertions.assertEquals(0, size);
    }

    @Test
    public void whenGetAt_verifyValueEquals() throws NotNullAllowedException, BadIndexException {
        ArrayList<String> list = new ArrayList<>();
        list.addAtHead("1");
        list.addAtHead("2");
        list.addAtHead("3");

        String value = list.getAt(2);

        Assertions.assertEquals("2", value);
    }

    @Test
    public void whenRemove_verifyValueIsRemoved_SizeDecreases() throws NotNullAllowedException, BadIndexException {
        ArrayList<String> list = new ArrayList<>();
        list.addAtHead("1");
        list.addAtHead("2");
        list.addAtHead("3");

        int size = list.getSize();
        Assertions.assertEquals(3, size);
        list.remove(1);
        String value = list.getAt(1);
        size= list.getSize();

        Assertions.assertEquals(2, size);
        Assertions.assertEquals("2", value);
    }

    @Test
    public void whenSetAt_verifyValueChanges() throws NotNullAllowedException, BadIndexException {
        ArrayList<String> list = new ArrayList<>();
        list.addAtHead("1");
        list.addAtHead("2");
        list.addAtHead("3");
        String value = list.getAt(2);

        Assertions.assertEquals("2", value);
        list.setAt(2, "5");
        value = list.getAt(2);

        Assertions.assertEquals("5", value);
    }

    @Test
    public void whenRemoveAllWithValue_verifySizeDecreases() throws NotNullAllowedException {
        ArrayList<String> list = new ArrayList<>();
        list.addAtHead("1");
        for(int i = 0; i < 5; i++){
            list.addAtHead("Repetido");
        }
        int size = list.getSize();
        Assertions.assertEquals(6, size);

        list.removeAllWithValue("Repetido");
        size = list.getSize();

        Assertions.assertEquals(1,size);
    }

    @Test
    public void whenRemoveAll_verifySizeDecreases() throws NotNullAllowedException {
        ArrayList<String> list = new ArrayList<>();
        list.addAtHead("1");
        for(int i = 0; i < 5; i++){
            list.addAtHead("Repetido");
        }
        int size = list.getSize();
        Assertions.assertEquals(6, size);

        list.removeAll();
        size = list.getSize();

        Assertions.assertEquals(0,size);
    }

    @Test
    public void givenAList_IteratorWorks() throws NotNullAllowedException {
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            list.addAtHead("Repetido");
        }

        Iterator<String> it = list.getIterator();
        String value = it.next();
        Assertions.assertEquals("Repetido", value);

        while(it.hasNext()){
            value = it.next();
            if(value == null){
                break;
            }
            Assertions.assertEquals("Repetido", value);
        }
    }

    @Test
    public void whenGivenNullInAddAtTail_throwException() throws NotNullAllowedException, BadIndexException {
        ArrayList<String> list = new ArrayList<>();

        Assertions.assertThrows(NotNullAllowedException.class, ()->list.addAtTail(null));
        int size = list.getSize();

        Assertions.assertEquals(0, size);
    }

    @Test
    public void whenGivenNullInAddAtHead_throwException() throws NotNullAllowedException, BadIndexException {
        ArrayList<String> list = new ArrayList<>();

        Assertions.assertThrows(NotNullAllowedException.class, ()->list.addAtHead(null));
        int size = list.getSize();

        Assertions.assertEquals(0, size);
    }

    @Test
    public void whenGivenBadIndexInRemove_throwException() throws NotNullAllowedException, BadIndexException {
        ArrayList<String> list = new ArrayList<>();
        list.addAtHead("1");
        list.addAtHead("2");
        list.addAtHead("3");

        int size = list.getSize();
        Assertions.assertEquals(3, size);
        Assertions.assertThrows(BadIndexException.class, ()-> list.remove(0));
        String value = list.getAt(1);
        size= list.getSize();

        Assertions.assertEquals(3, size);
        Assertions.assertEquals("3", value);
    }

    @Test
    public void whenGivenBadIndexInGetAt_throwException() throws NotNullAllowedException, BadIndexException {
        ArrayList<String> list = new ArrayList<>();
        list.addAtHead("1");
        list.addAtHead("2");
        list.addAtHead("3");

        Assertions.assertThrows(BadIndexException.class, ()-> list.getAt(0));
        String value = list.getAt(1);

        Assertions.assertEquals("3", value);
    }

    @Test
    public void whenGivenBadIndexInSetAt_throwException() throws NotNullAllowedException, BadIndexException {
        ArrayList<String> list = new ArrayList<>();
        list.addAtHead("1");
        list.addAtHead("2");
        list.addAtHead("3");

        Assertions.assertThrows(BadIndexException.class, ()-> list.setAt(0, "Hola"));
        String value = list.getAt(1);

        Assertions.assertEquals("3", value);
    }
    @Test
    public void whenNullInSetAt_throwException() throws NotNullAllowedException, BadIndexException {
        ArrayList<String> list = new ArrayList<>();
        list.addAtHead("1");
        list.addAtHead("2");
        list.addAtHead("3");

        Assertions.assertThrows(NotNullAllowedException.class, ()-> list.setAt(1, null));
        String value = list.getAt(1);

        Assertions.assertEquals("3", value);
    }
}