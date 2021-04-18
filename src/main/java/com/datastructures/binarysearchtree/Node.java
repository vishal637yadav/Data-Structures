package com.datastructures.binarysearchtree;

public class Node<E> {
    E data;
    Node<E> leftChild;
    Node<E> rightChild;

    public Node(E data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", leftChild=" + leftChild +
                ", rightChild=" + rightChild +
                '}';
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public Node<E> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node<E> leftChild) {
        this.leftChild = leftChild;
    }

    public Node<E> getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node<E> rightChild) {
        this.rightChild = rightChild;
    }
}
