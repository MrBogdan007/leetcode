package Geeksforgeeks.Trees.TreeNodeMain;



import java.util.*;


class DFS {
    int index = 0;

    public TreeNode buildTreeDFS(Integer[] arr) {
        if (index >= arr.length || arr[index] == null) {
            index++;
            return null;
        }

        TreeNode node = new TreeNode(arr[index++]);
        node.left = buildTreeDFS(arr);   // build left subtree
        node.right = buildTreeDFS(arr);  // build right subtree
        return node;
    }

    public static void main(String[] args) {
        Integer[] values = {
                1, 2, 4, null, null, 5, 6, null, null,
                7, null, 9, null, null, 3, null, 8, null, null
        };

        DFS s = new DFS();
        TreeNode root = s.buildTreeDFS(values);

        // Print inorder to verify
        printInorder(root);
    }

    static void printInorder(TreeNode root) {
        if (root == null) return;
        printInorder(root.left);
        System.out.print(root.val + " ");
        printInorder(root.right);
    }

}

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode(){}
    TreeNode(int val){
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;

    }
}





