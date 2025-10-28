package Geeksforgeeks.Trees;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val){this.val=val;}
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

}

class Solution {
    public int countNodes(TreeNode root) {
        if (root == null) return 0;
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        if(leftHeight== rightHeight){
            // same as 2^height        - 1 (root 0 is not counted , so no need for -1)
            return (1 << leftHeight) + countNodes(root.right);
        }else {
            return (1 << rightHeight) + countNodes(root.left);
        }
    }

    private int getHeight(TreeNode node) {
        int height = 0;
        // left.root =  Object B
        while (node != null ){
            height++;
//            Object A (root)
//            val = 1
//            left → Object B
//            right = null
//

//            Object B
//            val = 2
//            left → Object C
//            right -> Object D
//

//            Object C
//            val = 4
//            left = null
//            right = null

//            Object D
//            val = 5
//            left = null
//            right = null

            node = node.left; // same as Object C
        }
        return height;
    }
}
class Main {
    public static void main(String[] args) {
        // Build the tree [1,2,3,4,5,6]
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);

        // Use Solution class to count nodes
        Solution sol = new Solution();
        int result = sol.countNodes(root);

        System.out.println("Number of nodes = " + result);
    }
}