package com.avp.basic.datastructure_algorithms;

public class Main {
    public static void main(String[] args) {
//        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<>(10);
//        linkedList.preAppend(15);
//        linkedList.append(5);
//        linkedList.append(50);
//        linkedList.append(56);
//        linkedList.insertNode(23, 2);
//        linkedList.removeNode(3);
//        linkedList.printLinkedList();

        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<>(1);
        doublyLinkedList.append(2);
        doublyLinkedList.append(3);
        doublyLinkedList.append(4);
        doublyLinkedList.insert(2,99);
//        doublyLinkedList.remove(2);
        doublyLinkedList.preAppend(1000);
        doublyLinkedList.printDoublyLinkedList();
    }
}
