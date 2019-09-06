package com.ganesh.linkedlist;

public class LinkedListTest {
    public static void main (String args[]) {
        singleLinkedListRunner();
      //  doubliLinkedListRunner ();
    }

    private static void doubliLinkedListRunner() {
        MyDoublyLinkedList myLinkedList = new MyDoublyLinkedList("Vihaan");
        myLinkedList.append("Ganesh");
        myLinkedList.prepend("Tejal");
        myLinkedList.insert(1,"Sudha");
        myLinkedList.iterate();
     //   myLinkedList.remove(3);
        myLinkedList.remove(1);
        myLinkedList.remove(0);

        myLinkedList.iterate();
    }

    private static void singleLinkedListRunner() {
        MyLinkedList myLinkedList = new MyLinkedList("Vihaan");
        myLinkedList.append("Ganesh");
        myLinkedList.append("Tejal");
           myLinkedList.prepend("Sudha");
        //      myLinkedList.insert(2,"Sujata");

        myLinkedList.append("Suvarna");
            myLinkedList.iterate();
     //   myLinkedList.remove(3);
        myLinkedList.reverse();
        System.out.println("Reversed Linked list");
        myLinkedList.iterate();
    }
}
