package Geeksforgeeks.Trees.TreeNodeTest;

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



class TreeBuilder {
    public static void main(String[] args) {
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(3);
//        root.left.left = new TreeNode(4);
//        root.left.right = new TreeNode(5);
//
//        TreeNode rootForSameTree1 = new TreeNode(1,new TreeNode(2),new TreeNode(3));
//        TreeNode rootForSameTree2 = new TreeNode(1,new TreeNode(2),new TreeNode(3));
//        boolean resultSameTree =  isSameTree(rootForSameTree1,rootForSameTree2);
//        System.out.println("Result same tree:  " + resultSameTree);
//
//        int result = countNodes(root);
//
//        List<Integer> result2 = inorderTraversal(root);
//        System.out.println(result);
//        for (int num: result2){
//            System.out.println(num);
//        }


        Integer[] valuesForInorder = {1, 2, 3, 4, 5, null, 8, null, null, 6, 7, 9};
        Integer[] valuesForSymetricTree = {1,2,2,3,4,4,3};
        Integer[] valuesForHeightBalancedTree = {1,null,2,null,3,null,4};
        Integer[] valuesForHeightBalancedTree2 = {3,9,20,null,null,15,7};
        Integer[] valuesForHeightBalancedTree3 = {1,2,2,3,3,null,null,4,4};
//        TreeNode root = populateTreeQueue(valuesForSymetricTree);
//        System.out.println(symmetricTree(root));
        TreeNode root2 = populateTreeQueue(valuesForHeightBalancedTree3);
        boolean isBalanced = isBalanced(root2);
        System.out.println(isBalanced);


//        printLevelOrder(root);
//        List<Integer> res = inorderTraversal(root);
//        for (int n : res) {
//            System.out.println(n);
//        }
//
    }

    public static TreeNode populateTreeQueue(Integer[] values) {
        if (values == null || values.length == 0) return null;

        TreeNode root = new TreeNode(values[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;
        while (i < values.length) {
            TreeNode current = queue.poll();
            if (current != null) {
                // Left child
                if (values[i] != null) {
                    current.left = new TreeNode(values[i]);
                    queue.add(current.left);
                }
                i++;

                // Right child
                if (i < values.length && values[i] != null) {
                    current.right = new TreeNode(values[i]);
                    queue.add(current.right);
                }
                i++;
            }
        }
        return root;
    }

    // Helper to print tree level-order for testing
    public static void printLevelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node == null) {
                System.out.print("null ");
                continue;
            }
            System.out.print(node.val + " ");
            queue.add(node.left);
            queue.add(node.right);
        }
    }


    private static int countNodes(TreeNode root) {
        if (root == null) return 0;
        int leftHeight = countHeight(root.left);
        int rightHeight = countHeight(root.right);


        if (leftHeight == rightHeight) {
            return (1 << leftHeight) + countNodes(root.right);
        } else {
            return (1 << rightHeight) + countNodes(root.left);
        }
    }

    private static int countHeight(TreeNode node) {
        int height = 0;
        while (node != null) {
            height++;
            node = node.left;
        }
        return height;
    }


    //Is same tree check val approach
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        // If both are null, they are the same
        if (p == null && q == null) return true;

        // If only one is null, not the same
        if (p == null || q == null) return false;

        // If values differ, not the same
        if (p.val != q.val) return false;

        // Check left and right subtrees
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    //Is same tree list approach( brute force)
    private void buildList(TreeNode node, List<Integer> list) {
        if (node == null) {
            list.add(null);
            return;
        }
        list.add(node.val);
        buildList(node.left, list);
        buildList(node.right, list);
    }

//    public boolean isSameTree(TreeNode p, TreeNode q) {
//        List<Integer> pList = new ArrayList<>();
//        List<Integer> qList = new ArrayList<>();
//        buildList(p, pList);
//        buildList(q, qList);
//        return pList.equals(qList);
//    }


// In order recursion approach:
//    public static List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> allElements = new ArrayList<>();
//        populateTreeList(root,allElements);
//        return  allElements;
//    }

    private static void populateTreeList(TreeNode root, List<Integer> allElements) {
        if (root != null) {
            if (root.left != null) {
                populateTreeList(root.left, allElements);
            }
            allElements.add(root.val);
            if (root.right != null) {
                populateTreeList(root.right, allElements);
            }
        }

    }

    // In order  iteration approach
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        // method 2: iteration
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            // populate left part only if current is not null
            // leftmost always be null , then next to it usually will have value, first i pop it and than access right element for next iteration
            // in next iteration it will go inner while as it's not null and will access leftmost again
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            res.add(cur.val);
            cur = cur.right;
        }
        return res;
    }

    // Symmetric tre  iteration approach
    public static boolean symmetricTree(TreeNode root) {
        if (root == null) return true;
    Stack<TreeNode> stack = new Stack<>();
        stack.push(root.left);
        stack.push(root.right);
        while (!stack.empty()) {
            // n1 = right subtree , n2 = left subtree
            TreeNode n1 = stack.pop(), n2 = stack.pop();

            // mirror null check — same logic as recursive version
//            if (n1 == null || n2 == null) {
//                if (n1 != n2) return false;
//                continue;
//            }
            if (n1 == null && n2 == null) continue;
            if (n1 == null || n2 == null || n1.val != n2.val) return false;
            stack.push(n1.left);
            stack.push(n2.right);
            stack.push(n1.right);
            stack.push(n2.left);

}
        return true;
    }

    //recursive
    public boolean isSymmetricRecursive(TreeNode root) {
        return root==null || isSymmetricHelp(root.left, root.right);
    }

    private boolean isSymmetricHelp(TreeNode left, TreeNode right){
        //If both are null → left == right → true
        //(null mirrors null → OK)
        //
        //If one is null and the other is not → left == right → false
        //(structures differ → NOT symmetric)
        if(left==null || right==null)
            return left==right;
        if(left.val!=right.val)
            return false;
        return isSymmetricHelp(left.left, right.right) && isSymmetricHelp(left.right, right.left);
    }

    //Given a binary tree, determine if it is height-balanced.
//    This only measures:
//
//    the height of the left subtree of the root
//
//    the height of the right subtree of the root
//
//    But an unbalanced condition may happen deep inside the left or right subtree.
//    public static boolean isBalanced(TreeNode root) {
//        if(root == null) return true;
//        int heightLeft =  countHeightBalanced(root.left);
//        int heightRight = countHeightBalanced(root.right);
//
//        if(heightLeft!=heightRight ){
//            if(heightLeft-1 == heightRight||  heightRight - 1 == heightLeft ){
//                return true;
//            }
//            return false;
//        }
//        if(heightLeft==heightRight) return true;
//        else{return true;}
//
//
//    }
//
//    public static int countHeightBalanced(TreeNode node){
//        int height = 0;
//        while(node != null){
//            height++;
//            node = node.left;
//        }
//
//        return height;
//
//    }

    public static boolean isBalanced(TreeNode root) {
        // If the tree is empty, we can say it’s balanced...
        if (root == null)  return true;
        // Height Function will return -1, when it’s an unbalanced tree...
        if (Height(root) == -1)  return false;
        return true;
    }
    // Create a function to return the “height” of a current subtree using recursion...
    public static int Height(TreeNode root) {
        // Base case...
        if (root == null)  return 0;
        // Height of left subtree...
        int leftHeight = Height(root.left);
        // Height of height subtree...
        // stacking recursion calls to the right and only if it's null it will start unwind
        //for root 1,null,2,null,3,null,4.    starts counting only at node 4 when both left and right returned null
        //And it unwinds upwards
        //CASE A — A child subtree was already unbalanced:
        // so it can find unbalance in right side nodes( return -1 in math.abs in right subtree)
        //CASE B — This node itself becomes unbalanced up to root Height(1 node)
        // and can find unbalance with root at Height(1) after right and left was counted.
        int rightHight = Height(root.right);
        // In case of left subtree or right subtree unbalanced, return -1...
        if (leftHeight == -1 || rightHight == -1)  return -1;
        // If their heights differ by more than ‘1’, return -1...
        if (Math.abs(leftHeight - rightHight) > 1)  return -1;
        // Otherwise, return the height of this subtree as max(leftHeight, rightHight) + 1...
        return Math.max(leftHeight, rightHight) + 1;
    }
}





