package Geeksforgeeks.Trees.TreeTraversals;

import Geeksforgeeks.Trees.TreeNodeMain.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import static Geeksforgeeks.Trees.TreeNodeMain.TreeBuilder.populateTreeQueue;

public class CountNodesMain {
    public static void main(String[] args) {
        Integer[] valuesForPreorderTraversal = {1,2,3,4,5,null,8,null,null,6,7,9};
        runPreorderRecursion(valuesForPreorderTraversal);
        System.out.println();
        runPreorderStack(valuesForPreorderTraversal);


    }

    private static void runPreorderStack(Integer[] valuesForPreorderTraversal) {
        TreeNode root = populateTreeQueue(valuesForPreorderTraversal);
        List<Integer> result = preorderTraversalStack(root);
        for (int i : result){
            System.out.print(i+ " ");
        }

    }

    private static List<Integer> preorderTraversalStack(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode>  stack = new Stack<>();

        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()){

            while (cur != null){
                res.add(cur.val);
                stack.push(cur);
                cur = cur.left;
            }
            cur= stack.pop();
            cur = cur.right;
        }


        return res;
    }


    private static void runPreorderRecursion(Integer[] valuesForPreorderTraversal) {
        TreeNode root = populateTreeQueue(valuesForPreorderTraversal);
        List<Integer> res = preorderTraversalRecursion(root);
        for (int i : res){
            System.out.print(i+ " ");
        }
    }

    private static List<Integer> preorderTraversalRecursion(TreeNode valuesForPreorderTraversal) {
        List<Integer> resultList = new ArrayList<>();
        populatePreorderTree(valuesForPreorderTraversal,resultList);
        return resultList;

    }

    private static void populatePreorderTree(TreeNode root, List<Integer> resultList) {
        if(root!=null){
            resultList.add(root.val);
            if(root.left!=null){
                populatePreorderTree(root.left,resultList);
            }
            if(root.right!=null){
                populatePreorderTree(root.right,resultList);
            }

        }
    }
}
