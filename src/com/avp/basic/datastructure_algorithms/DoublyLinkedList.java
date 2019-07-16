package com.avp.basic.datastructure_algorithms;

import java.util.ArrayList;
import java.util.List;

public class DoublyLinkedList<E> {
    private static class Node<E> {
        private E element;
        private Node<E> next;
        private Node<E> prev;

        Node(E e, Node<E> next, Node<E> prev) {
            this.element = e;
            this.next = next;
            this.prev = prev;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }
    }

    private Node<E> head;
    private Node<E> tail;
    private int size = 0;

    DoublyLinkedList(E e) {
        head = new Node<>(e, null, null);
        this.tail = this.head;
    }

    void printDoublyLinkedList() {
        List<E> arrayValue = new ArrayList<>();
        Node<E> currentNode = this.head;
        while (currentNode != null) {
            arrayValue.add(currentNode.getElement());
            currentNode = currentNode.getNext();
        }

        for (E e : arrayValue) {
            System.out.print(e + ", ");
        }
    }

    void preAppend(E e) {
        Node<E> newNode = new Node<>(e, null, null);
        this.head.setPrev(newNode);
        newNode.setNext(this.head);
        this.head = newNode;
        size++;
    }

    void append(E e) {
        Node<E> newNode = new Node<>(e, null, null);
        this.tail.setNext(newNode);
        newNode.setPrev(this.tail);
        this.tail = newNode;
        size++;
    }

    void remove(int index) {
        Node<E> nodeAtIndex = traversalToIndex(index);
        Node<E> holdingPrePointer = nodeAtIndex.getPrev();
        Node<E> holdingAfterPointer = nodeAtIndex.getNext();
        holdingPrePointer.setNext(holdingAfterPointer);
        holdingAfterPointer.setPrev(holdingPrePointer);
        size--;
    }

    void insert(int index, E e) {
        Node<E> newNode = new Node<>(e, null, null);
        Node<E> nodeAtPreIndex = traversalToIndex(index - 1);
        Node<E> holdingPointer = nodeAtPreIndex.getNext();
        nodeAtPreIndex.setNext(newNode);
        newNode.setPrev(nodeAtPreIndex);
        newNode.setNext(holdingPointer);
        holdingPointer.setPrev(newNode);
        size++;
    }

    Node<E> traversalToIndex(int index) {
        int count = 0;
        Node<E> currentNode = this.head;
        while (count != index) {
            currentNode = currentNode.getNext();
            count++;
        }
        return currentNode;
    }
}
