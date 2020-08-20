package Util;

public class ListElementMaker {
    public static ListElement<Integer> ArrayToLinkedList(Integer[] array) {
        ListElement<Integer> current = new ListElement<>(array[0]);
        ListElement<Integer> head = current;


        for (int i = 1; i < array.length; i++) {
            ListElement<Integer> elem = new ListElement<>(array[i]);
            current.setNext(elem);
            current = elem;
        }

        return head;
    }
}
