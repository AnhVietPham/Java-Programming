package com.avp.basic.datastructure_algorithms;

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

    DoublyLinkedList(E e) {
        head = new Node<>(e, null, null);
        this.tail = this.head;
    }

    void printDoublyLinkedList(){

    }

    void preAppend(E e){}

    void append(E e){}

    void remove(int index){}

    void insert(int index, E e){}

    void addFirst(E e){}

    void addLast(E e){}
}
