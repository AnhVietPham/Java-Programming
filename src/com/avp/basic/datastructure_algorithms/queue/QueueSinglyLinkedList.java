package com.avp.basic.datastructure_algorithms.queue;

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
    public void enqueue(Integer integer) {

    }

    @Override
    public Integer first() {
        return null;
    }

    @Override
    public Integer dequeue() {
        return null;
    }
}
