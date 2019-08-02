package com.avp.basic.datastructure_algorithms.queue;

public class MainQueue {
    public static void main(String[] args){
        QueueSinglyLinkedList myQueue = new QueueSinglyLinkedList();
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        myQueue.enqueue(5);
        myQueue.enqueue(6);
        myQueue.enqueue(7);
        myQueue.enqueue(8);
        myQueue.enqueue(9);
        myQueue.printValueQueue();
    }
}
