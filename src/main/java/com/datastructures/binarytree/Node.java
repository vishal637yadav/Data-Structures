package com.datastructures.binarytree;

public class Node<E> {

    private E data;
    private Node<E> leftNode;
    private Node<E> rightNode;

    public Node(E data) {
        this.data = data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public void setLeftNode(Node<E> leftNode) {
        this.leftNode = leftNode;
    }

    public void setRightNode(Node<E> rightNode) {
        this.rightNode = rightNode;
    }

    public E getData() {
        return data;
    }

    public Node<E> getLeftNode() {
        return leftNode;
    }

    public Node<E> getRightNode() {
        return rightNode;
    }

    @Override
    public String toString() {
        String superToString=super.toString();
        return "Node{" +
                "superToString=" +superToString +
                "data=" + data +
                ", leftNode=" + leftNode +
                ", rightNode=" + rightNode +
                '}';
    }

}
