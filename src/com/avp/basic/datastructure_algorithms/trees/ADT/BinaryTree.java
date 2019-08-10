package com.avp.basic.datastructure_algorithms.trees.ADT;


public interface BinaryTree<E> extends Tree<E> {
    Position<E> left(Position<E> p);

    Position<E> right(Position<E> p);

    Position<E> sibling(Position<E> p);
}
