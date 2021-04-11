package com.datastructures.binarytree;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        /*
        logger.trace("Main Class :{}",logger);
        logger.debug("Main Class :{}",logger);
        logger.info("Main Class :{}",logger);
        logger.warn("Main Class :{}",logger);
        logger.error("Main Class :{}",logger);
        */

        BinaryTree<Integer> binaryTree = new BinaryTree<Integer>();
        logger.info("binaryTree :{}", binaryTree);
        binaryTree.add(20);
        logger.info("binaryTree :{}", binaryTree);
        binaryTree.preOrderTraversal(binaryTree.getRootNode());
        //binaryTree.levelOrderTraversal(binaryTree.getRootNode());
        System.out.println(binaryTree.traverseToFind_addPosition());
        binaryTree.add(100);
        binaryTree.add(3);
        binaryTree.add(50);
        binaryTree.add(15);
        binaryTree.add(250);
        binaryTree.add(35);
        binaryTree.add(222);

        binaryTree.postOrderTraversal(binaryTree.getRootNode());
        binaryTree.levelOrderTraversal(binaryTree.getRootNode());
        logger.info("binaryTree :{}", binaryTree);
        binaryTree.searchUsinglevelOrderTraversal(150);

    }

}
