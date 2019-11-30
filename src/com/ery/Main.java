package com.ery;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        bubbleSort();

        //TODO not ending
        expressionParsing();


    }


    public static void expressionParsing(){
        System.out.println(ExpressionParsing.parseExpressionToPrefix("a+b*c"));
    }


    public static void bubbleSort(){
        int[] arr = {1,4,5,2,6,8,5,3};
        System.out.println(Arrays.toString(BubbleSort.sort(arr)));
    }

    public static  void binaryTree(){
        TreeNode root = new TreeNode(5);
        TreeNode treeNode = new TreeNode(3);
        TreeNode treeNode1 = new TreeNode(4);
        TreeNode treeNode2 = new TreeNode(6);
        TreeNode treeNode3 = new TreeNode(9);
        TreeNode treeNode4 = new TreeNode(12);
        TreeNode treeNode5 = new TreeNode(1);
        BinarySearchTree.insert(null, root);
        BinarySearchTree.insert(root, treeNode);
        BinarySearchTree.insert(root, treeNode1);
        BinarySearchTree.insert(root, treeNode2);
        BinarySearchTree.insert(root, treeNode3);
        BinarySearchTree.insert(root, treeNode4);
        BinarySearchTree.insert(root, treeNode5);
        BinarySearchTree.order(root);
        System.out.println("Finded value: "  + BinarySearchTree.search(root, new TreeNode(12)).data);
    }
}