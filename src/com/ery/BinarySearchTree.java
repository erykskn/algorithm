package com.ery;

public class BinarySearchTree {

    public static TreeNode insert(TreeNode root, TreeNode node) {

        if (root == null) {
            root = node;
            return root;
        } else if (node.data < root.data) {
            if (root.leftNode == null) {
                root.leftNode = node;
            } else {
                root = root.leftNode;
                insert(root, node);
            }
        } else if (node.data > root.data) {
            if (root.rightNode == null) {
                root.rightNode = node;
            } else {
                root = root.rightNode;
                insert(root, node);
            }
        }

        return root;
    }

    public static void order(TreeNode root) {
        if (root == null) {
            return;
        }
        order(root.leftNode);
        System.out.print(root.data + " ");
        order(root.rightNode);

    }

    public static TreeNode search(TreeNode root, TreeNode node) {
        if (root == null) return null;

        if (node.data == root.data){
            root = node;
            return root;
        }

        if (node.data < root.data) {
           root = search(root.leftNode, node);
        } else {
           root = search(root.rightNode, node);
        }
        return root;
    }
}
