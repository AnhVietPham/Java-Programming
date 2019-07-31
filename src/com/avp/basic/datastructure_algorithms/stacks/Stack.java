package com.avp.basic.datastructure_algorithms.stacks;


/**
 * This is a Stack class. It differs from java.util.Stack. This class supports
 * inserted and removed according to First-Out Last-Out principle.
 * @author AnhVietPham
 */
public interface Stack<E> {

    /**
     * Returns the number of element in the Stack
     * @return number of element in the Stack
     */
    int size();

    /**
     * Check whether the Stack is empty
     * @return true if the Stack is empty
     */
    boolean isEmpty();

    /**
     * Insert an element at the top of the Stack
     * @param e element to be inserted
     */
    void push(E e);

    /**
     * Return an element at the top of the Stack
     * @return top element in the Stack (or null if empty)
     */
    E top();

    /**
     * Remove and return the top element which is removed from the Stack
     * @return element removed (or null if empty)
     */
    E pop();
}
