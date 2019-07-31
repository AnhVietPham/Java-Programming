package com.avp.basic.datastructure_algorithms.queue;

/**
 * This is Queue class. It differs from java.util.Queue. This class support
 * inserted and removed a element according to First-In First-Out principle.
 * @author AnhVietPham
 * */
public interface Queue<E> {
    /**
     *Return the number of element in the Queue.
     * @return the number of element in the Queue.
     * */
    int size();

    /**
     * Check whether the Queue is Empty.
     * @return true if the Queue is Empty (or null if empty).
     * */
    boolean isEmpty();

    /**
     * Insert an element at the rear of the Queue.
     * @param e element to be inserted
     * */
    void enqueue(E e);

    /**
     * Return the first element of the Queue.
     * @return the first element in the Queue (or null if empty).
     * */
    E first();

    /**
     * Remove and return the first element of the Queue.
     * @return element removed (or null if empty).
     * */
    E dequeue();
}
