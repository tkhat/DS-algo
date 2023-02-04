package myLinkedList;

import java.util.LinkedList;

public class Test {

    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.addAtTail(1);
        System.out.println(myLinkedList.get(0));

/*        for (int i = 0; i < myLinkedList.length; i++) {
            System.out.println(myLinkedList.get(i));
        }*/
    }
}
