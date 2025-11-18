package Geeksforgeeks.Trees.BST;

import java.util.ArrayList;
import java.util.List;

public class Node {
//    Given the root of a binary tree, determine whether it is a Binary Search Tree (BST).
//
//    A Binary Search Tree is a binary tree that satisfies the following conditions:
//
//    All nodes in the left subtree have values smaller than the root.
//    All nodes in the right subtree have values greater than the root.
//    Both left and right subtrees are themselves BSTs.
//    All node values are distinct.
int val;
    Node left, right;

    Node(int value) {
        val = value;
        left = right = null;
    }
    public static void main(String[] args) {

        // Create a sample binary tree
        //     10
        //    /  \
        //   5    20
        //        / \
        //       9   25
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(20);
        root.right.left = new Node(9);
        root.right.right = new Node(25);

        if (isBST(root)) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }

    private static boolean isBST(Node root) {
        return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean isBSTUtil(Node node, int min, int max) {// 5 , - infinity , 9
        if (node == null) return true;
        if (node.val < min || node.val > max) return false;
        return isBSTUtil(node.left, min, node.val - 1) &&
                isBSTUtil(node.right, node.val + 1, max);
    }

}

