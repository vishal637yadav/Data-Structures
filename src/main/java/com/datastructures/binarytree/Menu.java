package com.datastructures.binarytree;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {
    private static final Logger logger = LoggerFactory.getLogger(Menu.class);

    BinaryTree<Integer> binaryTree ;

    public void showMenu() {
        BufferedReader br;
        do {
            br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("------::  Displaying All Menus  ::------");
            System.out.println("Press 1 for create blank    binary tree");
            System.out.println("Press 2 for add new element binary tree");
            System.out.println("Press 3 for del element");
            System.out.println("Press 4 for search an element in binary tree");
            System.out.println("Press 5 for traverse the binary tree");
            System.out.println("Press 6 for del whole binary tree");
            int caseChosen = 0;
            try {
                System.out.print("You have Pressed :: ");
                caseChosen = Integer.parseInt(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("You have Pressed :" + caseChosen);
            switch (caseChosen) {
                case 1:
                    System.out.println(" case 1 is running !..!!");
                    if(binaryTree == null) {
                        binaryTree = new BinaryTree<>();
                        logger.info("binaryTree :{}", binaryTree);
                    }else{
                        logger.warn("binaryTree is Already Created(Not null) :{}", binaryTree);
                    }
                    break;
                case 2:
                    System.out.println(" case 2 is running !..!!");
                    int number = 0;
                    try {
                        System.out.print("Enter the Number you want to add :: ");
                        number = Integer.parseInt(br.readLine());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    binaryTree.add(number);
                    break;
                default:
                    System.out.println(" case default is running !..!!");
                    binaryTree.levelOrderTraversal(binaryTree.getRootNode());

            }
            System.out.print("Do you want to continue again(Y/y) : ");

            char tryAgain = 0;
            try {
                tryAgain = (char) br.read();
                System.out.println("Your chose is : " + tryAgain);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (tryAgain == 'Y' || tryAgain == 'y') {
                System.out.println("--------Continue Again--------");
            } else {
                System.out.println("--------Break Again--------");
                break;
            }
        } while (true);
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.showMenu();
    }

}
