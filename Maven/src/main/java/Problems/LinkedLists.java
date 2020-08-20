package Problems;

import Util.ListElement;

public class LinkedLists {
    // Given a linked list, return the element that is M away from the last element
    // This solution uses one pass, and finite storage
    public static ListElement findMToLastElement(ListElement head, int m) {
        ListElement current, mBehind;

        // initialize two pointers, where current is M ahead of mBehind
        current = head;
        int count = 0;
        while (count < m) {
            if (current == null) { // list is shorted than M, so nothing to return
                return null;
            }
            current = current.next();
            count++;
        }

        mBehind = head;

        // traverse until end of list
        // when at end of list, mBehind should be M behind the end
        while (current.next() != null) {
            current = current.next();
            mBehind = mBehind.next();
        }

        return mBehind;
    }
}
