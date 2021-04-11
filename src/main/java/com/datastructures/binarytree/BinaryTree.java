package com.datastructures.binarytree;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayDeque;
import java.util.Queue;


public class BinaryTree<E> {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    private Node<E> rootNode;
    private int size;
    private int level;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public BinaryTree() {
    }

    public Node<E> getRootNode() {
        return rootNode;
    }

    public void setRootNode(Node<E> rootNode) {
        this.rootNode = rootNode;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "BinaryTree{" +
                "rootNode=" + rootNode +
                ", size=" + size +
                '}';
    }

    public void add(E data) {

        if (rootNode == null) {
            logger.debug("rootNode is null");
            this.setRootNode(new Node<>(data));
            logger.debug("getRootNode data :{}", this.getRootNode());
            //this.size++;
            this.setSize(this.getSize() + 1);
            logger.debug("size :{}", this.getSize());
            this.setLevel(this.getLevel() + 1);
            logger.debug("level :{}", this.getLevel());

        } else {
            logger.debug("rootNode is not null");
            MyPair<Node<E>, String> myPair = traverseToFind_addPosition();
            addElement(myPair,data);
        }
    }

    public void preOrderTraversal(Node<E> root) {
        if (root == null) {
            logger.error("Root Node is Null");
        } else {
            logger.info("root :{}", "" + root.getData());
            //Printing the Data First
            System.out.println("Data ::" + root.getData());
            //traversing left sub-tree
            preOrderTraversal(root.getLeftNode());
            //traversing right sub-tree
            preOrderTraversal(root.getRightNode());
        }
    }

    public void inOrderTraversal(Node<E> root) {
        if (root == null) {
            logger.error("Root Node is Null");
        } else {
            //traversing left sub-tree
            inOrderTraversal(root.getLeftNode());
            //Printing the Data First
            logger.info("root :{}", "" + root.getData());
            System.out.println("Data ::" + root.getData());
            //traversing right sub-tree
            inOrderTraversal(root.getRightNode());
        }
    }

    public void postOrderTraversal(Node<E> root) {
        if (root == null) {
            logger.error("Root Node is Null");
        } else {
            //traversing left sub-tree
            postOrderTraversal(root.getLeftNode());
            //traversing right sub-tree
            postOrderTraversal(root.getRightNode());
            //Printing the Data First
            logger.info("root :{}", "" + root.getData());
            System.out.println("Data ::" + root.getData());
        }
    }

    public void levelOrderTraversal(Node<E> rootNode) {
        if(rootNode != null) {
            //Create a Queue :
            Queue<Node<E> > queue = new ArrayDeque<>();
            //add into the Queue
            queue.add(rootNode);
            logger.debug("queue ::{}", queue);

            while (!queue.isEmpty()) {
                Node<E> currentNode =  queue.remove();

                if (currentNode.getLeftNode() != null) {
                    queue.add(currentNode.getLeftNode());
                }

                if (currentNode.getRightNode() != null) {
                    queue.add(currentNode.getRightNode());
                }
                System.out.println("currentNode DAtra ------::"+currentNode.getData());
            }
        }else
        {
            logger.debug("rootNode is null ::{}", rootNode);
        }
    }

    public MyPair<Node<E>, String> traverseToFind_addPosition() {
        MyPair<Node<E>, String> myPair = null;

        Queue<E> queue = new ArrayDeque<>();
        //add into the Queue
        queue.add((E) this.rootNode);
        logger.debug("queue ::{}", queue);

        while (!queue.isEmpty()) {
            Node<E> currentNode = (Node<E>) queue.remove();

            if (currentNode.getLeftNode() != null) {
                queue.add((E) currentNode.getLeftNode());
            } else {
                myPair = new MyPair(currentNode, "L");
                break;
            }

            if (currentNode.getRightNode() != null) {
                queue.add((E) currentNode.getRightNode());
            } else {
                myPair = new MyPair(currentNode, "R");
                break;
            }

        }
        return myPair;
    }

    public void addElement(MyPair<Node<E>,String> myPair,E data)
    {
        Node<E> newNode = new Node<>(data);
        if(myPair.getValue().equals("L"))
        {
            myPair.getKey().setLeftNode(newNode);
        }else if(myPair.getValue().equals("R"))
        {
            myPair.getKey().setRightNode(newNode);
        }
        this.setSize(this.getSize() + 1);
    }

    public void searchUsinglevelOrderTraversal(E data) {
        if(rootNode != null) {
            //Create a Queue :
            Queue<Node<E> > queue = new ArrayDeque<>();
            //add into the Queue
            queue.add(rootNode);
            logger.debug("queue ::{}", queue);

            while (!queue.isEmpty()) {
                Node<E> currentNode =  queue.remove();
                System.out.println("currentNode DAtra ------::"+currentNode.getData());
                if(data.equals(currentNode.getData()))
                {
                    System.out.println("Element Found in Node "+currentNode);
                    break;
                }

                if (currentNode.getLeftNode() != null) {
                    queue.add(currentNode.getLeftNode());
                }
                if (currentNode.getRightNode() != null) {
                    queue.add(currentNode.getRightNode());
                }
            }
            System.out.println("Element not Exists in Tree !!");
        }else
        {
            logger.debug("rootNode is null ::{}", rootNode);
        }
    }

}