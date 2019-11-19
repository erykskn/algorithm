package com.ery;

public class Main {

    public static void main(String[] args) {
//        Fibonacci.writeFibonacci(10);
//        int result = Factorial.calculateFactorial(4);
//        System.out.println("\n" + result);
//        System.out.println();
//        BinarySearch.search(1);
//
//        System.out.println();
//        System.out.println();

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