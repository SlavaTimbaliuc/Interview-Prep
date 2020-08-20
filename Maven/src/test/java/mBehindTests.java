import Problems.LinkedLists;

import Util.ListElement;
import Util.ListElementMaker;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class mBehindTests {

    ListElementMaker maker;

    @Before
    public void setup() {
        maker = new ListElementMaker();
    }

    @Test
    public void simpleTest() {
        Integer[] a = {1, 2, 3};
        ListElement<Integer> elem = ListElementMaker.ArrayToLinkedList(a);

        ListElement<Integer> mBehind = LinkedLists.findMToLastElement(elem, 2);
        assertEquals((Integer)1, mBehind.value());


    }
}
