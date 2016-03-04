import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by INV-6179 on 03.03.2016.
 */
public class ListTest {
    @Test
    public void testGetSizeForTwoElements() throws Exception {
        List<Integer> list=new List();
        list.addElement(1);
        list.addElement(2);
        assertEquals("Incorrect size after adding element to List",2,list.getSize());
    }
    @Test
    public void testGetSizeFor10000Elements() throws Exception {
        List<Integer> list = new List();
        for (int i = 0; i < 10000; i++) {
            list.addElement(i);
        }
        assertEquals("Incorrect list size after adding 100 elements in loop", 100, list.getSize());
    }
    @Test
    public void testGetSizeForSameElements() throws Exception {
        List<Integer> list = new List();
        Integer value = new Integer(2);
        list.addElement(value);
        list.addElement(value);
        assertEquals("incorrect list size after adding 2 same elements", 2, list.getSize());
    }
    @Test
    public void testAddOneElement() throws Exception {
        List<Integer> list=new List<>();
        list.addElement(1);
        assertEquals("incorrect size after adding one element",1,list.getSize());
    }
    @Test
    public void testAddTwoSame() throws Exception {
        List<Integer> list=new List<>();
        list.addElement(1);
        list.addElement(1);
        assertEquals("incorrect size after adding one element",2,list.getSize());
    }


    @Test
    public void testRemoveElement() throws Exception {

    }

    @Test
    public void testRemoveFirst() throws Exception {

    }

    @Test
    public void testClear() throws Exception {

    }

    @Test
    public void testIsEmpty() throws Exception {

    }

    @Test
    public void testContains() throws Exception {

    }

    @Test
    public void testGet() throws Exception {

    }

    @Test
    public void testSet() throws Exception {

    }



    }