package com.avp.basic.datastructure_algorithms.queue;

import java.util.ArrayList;
import java.util.List;

public class QueueSinglyLinkedList implements Queue<Integer> {
    private static class Node<E> {
        private Node<E> next;
        private E element;

        Node(E e, Node<E> next) {
            this.element = e;
            this.next = next;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }
    }

    private Node<Integer> first;
    private Node<Integer> last;
    private int size = 0;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void enqueue(Integer value) {
        Node<Integer> newNode = new Node<>(value, null);
        if (size == 0) {
            this.first = newNode;
            this.last = this.first;
        } else {
            this.last.setNext(newNode);
            this.last = newNode;
        }
        size++;
    }

    @Override
    public Integer first() {
        return this.first.getElement();
    }

    @Override
    public Integer dequeue() {
        int elementNodeRemoved = this.first.getElement();
        this.first = this.first.getNext();
        size--;
        return elementNodeRemoved;
    }

    void printValueQueue() {
        List<Integer> arrayValue = new ArrayList<>();
        while (this.first != null) {
            arrayValue.add(this.first());
            this.dequeue();
        }

        for (int e : arrayValue) {
            System.out.print(e + " ");
        }
    }
}
