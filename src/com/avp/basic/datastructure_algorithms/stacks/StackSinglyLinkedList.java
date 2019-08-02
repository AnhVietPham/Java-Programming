package com.avp.basic.datastructure_algorithms.stacks;

import java.util.ArrayList;
import java.util.List;

public class StackSinglyLinkedList implements Stack<Integer> {

    private static class Node<E> {
        private E element;
        private Node<E> next;

        Node(E e, Node<E> n) {
            this.element = e;
            this.next = n;
        }

        E getElement() {
            return element;
        }

        Node<E> getNext() {
            return next;
        }

        void setNext(Node<E> next) {
            this.next = next;
        }
    }

    private Node<Integer> top;
    private Node<Integer> bottom;
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
    public void push(Integer value) {
        Node<Integer> newNode = new Node<>(value, null);
        if (size == 0) {
            this.top = newNode;
            this.bottom = this.top;
        } else {
            newNode.setNext(this.top);
            this.top = newNode;
        }
        size++;
    }

    @Override
    public Integer top() {
        return this.top.getElement();
    }

    @Override
    public Integer pop() {
        int elementNodeRemoved = this.top.getElement();
        this.top = this.top.getNext();
        size--;
        return elementNodeRemoved;
    }

    void printElementStack() {
        List<Integer> elements = new ArrayList<>();
        Node<Integer> currentNode = this.top;
        while (currentNode != null) {
            elements.add(currentNode.getElement());
            currentNode = currentNode.getNext();
        }

        for (int e : elements) {
            System.out.print(e + " ");
        }
    }
}
