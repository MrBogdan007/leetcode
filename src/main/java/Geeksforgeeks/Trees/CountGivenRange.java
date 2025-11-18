package Geeksforgeeks.Trees;

public class CountGivenRange {
    //Given a Binary Search Tree (BST) and a range [l, h], the task is to count the number of nodes in the BST that lie in the given range.
//        10
//       /  \
//      5    50
//     /    /  \
//    1    40  100
//the O(log² N) approach) only works correctly for a complete binary tree.
}

class Node{
    int val  ;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(50);
        root.left.left = new Node(1);
        root.right.left = new Node(40);
        root.right.right = new Node(100);
        System.out.println(countNodes(root,5,45));  ;

    }

    private static int countNodes(Node root,int l, int h) {
        if(root==null) return 0;

        if(root.val >=5 && root.val <= 45) {
            return  1 + countNodes(root.left,l,h) + countNodes(root.right,l,h);
        }
        else if(root.val<l){
            return countNodes(root.right,l,h);
        }
        else return countNodes(root.left,l,h);
    }


}

