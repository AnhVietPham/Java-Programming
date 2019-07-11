package com.avp.basic.datastructure_algorithms;

import java.util.ArrayList;
import java.util.List;

public class SinglyLinkedList<E> {
    private static class Node<E> {
        private E element;
        private Node<E> next;

        E getElement() {
            return element;
        }

        Node<E> getNext() {
            return next;
        }

        void setNext(Node<E> next) {
            this.next = next;
        }

        Node(E e, Node<E> n) {
            this.element = e;
            this.next = n;
        }
    }

    private Node<E> head;
    private Node<E> tail;
    private int size = 0;

    SinglyLinkedList(E e) {
        head = new Node<>(e, null);
        this.tail = head;
    }

    public int size() {
        return size;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    void preAppend(E e) {
        Node<E> newNode = new Node<>(e, null);
        newNode.setNext(this.head);
        this.head = newNode;
        size++;
    }

    void append(E e) {
        Node<E> newNode = new Node<>(e, null);
        this.tail.setNext(newNode);
        this.tail = newNode;
        size++;
    }

    void printLinkedList() {
        List<Object> array = new ArrayList<>();
        Node currentNode = this.head;
        while (currentNode != null) {
            array.add(currentNode.getElement());
            currentNode = currentNode.getNext();
        }
        for (Object o : array) {
            System.out.print(o + " ");
        }
    }

    void insertNode(E e, int index) {
        Node<E> newNode = new Node<>(e, null);
        Node<E> nodeAtIndex = traversalNode(index - 1);
        Node<E> holdingNode = nodeAtIndex.getNext();
        nodeAtIndex.setNext(newNode);
        newNode.setNext(holdingNode);
        size++;
    }

    void removeNode(int index) {
        Node<E> nodeAtIndex = traversalNode(index - 1);
        Node<E> holdingNode = nodeAtIndex.getNext();
        nodeAtIndex.setNext(holdingNode.getNext());
        size--;
    }

    private Node<E> traversalNode(int index) {
        int count = 0;
        Node<E> currentNode = this.head;
        while (count != index) {
            count++;
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

}
