//LeetCode 250 – Count Univalue Subtrees
// Problem
// Given the root of a binary tree, count the number of univalue subtrees.

// A univalue subtree is a subtree where all nodes have the same value.


class Solution{
    int count = 0;
    public int countUnivalSubtrees(TreeNode root){
        isUnival(root);
        return count;
    }
    private boolean isUnival(TreeNode node){
        if(node == null){
            return true;
        }
        boolean left = isUnival(node.left);
        boolean right = isUnival(node.right);

        if(!left || !right){
            return false;
        }
        if(node.left != null && node.left.val != node.val){
            return false;
        }
        if(node.right != null && node.right.val != node.val){
            return false;
        }
        count++;
        return true;

    }
}