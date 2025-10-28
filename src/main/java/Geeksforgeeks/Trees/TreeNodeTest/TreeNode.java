package Geeksforgeeks.Trees.TreeNodeTest;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

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



class TreeBuilder{
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        int result = countNodes(root);
        System.out.println(result);
    }

    private static int countNodes(TreeNode root) {
        if(root==null) return 0;
        int leftHeight = countHeight(root.left);
        int rightHeight = countHeight(root.right);


        if(leftHeight==rightHeight){
            return  (1<<leftHeight) + countNodes(root.right);
        }else{
            return  (1<<rightHeight) + countNodes(root.left);
        }
    }

    private static int countHeight(TreeNode node) {
        int height = 0;
        while (node != null){
            height++;
            node = node.left;
        }
        return height;
    }


}
