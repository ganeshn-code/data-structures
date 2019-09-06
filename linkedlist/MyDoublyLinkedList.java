package com.ganesh.linkedlist;

public class MyDoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    public MyDoublyLinkedList (Object data) {
        Node head = getNewNode(data);
        this.head = head;
        this.tail = head;
        this.length = 1;
    }

    private Node getNewNode(Object data) {
        return new Node(data,null,null);
    }

    public void append (Object data) {
        if (data == null) {
            System.out.println("Can not add null data node");
            return;
        }
        Node newNode = getNewNode(data);
        newNode.setPrev(this.tail);
        this.tail.setNext(newNode);
        this.tail = newNode;
        this.length++;
    }

    public void iterate () {
        Node pointer = this.head;
        while (pointer != null) {
            System.out.println(pointer.getData());
            pointer = pointer.getNext();
        }
        System.out.println(this.length);
    }

    public void prepend (Object data) {
        if (data == null) {
            System.out.println("Can not add null data node");
            return;
        }
        Node first = getNewNode(data);
        this.head.setPrev(first);
        first.setNext(this.head);
        this.head = first;
        this.length++;
    }

    public void insert (int index, Object data) {
        if (index < 0 || index > this.length) {
            System.out.println("Please provide correct index : should be greater than 0 and less than "+this.length);
            return;
        }
        if (index == 0) {
            prepend(data);
            return;
        }
        if (index == this.length) {
            append(data);
            return;
        }
        Node elementAtPrevIndex = this.head;
        final Node newNode = getNewNode(data);
        for (int i = 1;i<index;i++) {
            elementAtPrevIndex = elementAtPrevIndex.getNext();
        }
        newNode.setNext(elementAtPrevIndex.getNext());
        newNode.setPrev(elementAtPrevIndex);
        elementAtPrevIndex.getNext().setPrev(newNode);
        elementAtPrevIndex.setNext(newNode);
        this.length++;
    }

    public void remove(int index) {
        if (index == 0) {
            this.head = this.head.getNext();
            this.head.setPrev(null);
            this.length--;
            return;
        }
        Node elementAtPrevIndex = this.head;
        int count = 1;
        while (count < (index)) {
            elementAtPrevIndex = elementAtPrevIndex.getNext();
            count++;
        }
        Node currentNode = elementAtPrevIndex.getNext();
        if (currentNode.getNext() != null) {
            elementAtPrevIndex.setNext(currentNode.getNext());
            currentNode.setPrev(elementAtPrevIndex);
        } else {
            elementAtPrevIndex.setNext(null);
            this.tail = elementAtPrevIndex;
        }
        this.length--;
    }
}
