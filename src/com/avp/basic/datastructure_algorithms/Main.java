package com.avp.basic.datastructure_algorithms;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<>(10);
        linkedList.preAppend(15);
        linkedList.append(5);
        linkedList.append(50);
        linkedList.append(56);
        linkedList.insertNode(23, 2);
        linkedList.removeNode(3);
        linkedList.printLinkedList();
    }
}
