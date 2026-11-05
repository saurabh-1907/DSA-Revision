/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class NodeInfo{
    int val;
    NodeInfo left;
    NodeInfo right;
    int max;
    int min;
    int sum;
    int maxSum;
    boolean isBST;
    
    NodeInfo(int val, NodeInfo left, NodeInfo right, int max, int min, int sum, boolean isBST){
        this.val = val;
        this.left = left;
        this.right = right;
        this.max = max;
        this.min = min;
        this.sum = sum;
        this.isBST = isBST;
        
    }
    NodeInfo(int val, NodeInfo left, NodeInfo right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
    NodeInfo(int val, boolean isBST){
        this.val = val;
        this.isBST = isBST;
    }
    NodeInfo(){};
}

class Solution {
    public int maxSumBST(TreeNode root) {
        if(root == null) return 0;
        NodeInfo node = populate(root);
        return maxNode(node);


    }
    NodeInfo populate( TreeNode root){
        if(root == null) return null;
        NodeInfo newNode = new NodeInfo(root.val, true);


        if(root.left != null){
            newNode.left = populate(root.left);
        }

        if(root.right != null){
            newNode.right = populate(root.right);
        }
        newNode.sum = root.val;
        newNode.min = root.val;
        newNode.max = root.val;


        if(newNode.left != null){

            newNode.min = Math.min(newNode.left.min, newNode.val);
            newNode.max = Math.max(newNode.left.max, newNode.val);
            newNode.sum = newNode.sum + newNode.left.sum;
            newNode.isBST = newNode.isBST && newNode.left.isBST && (root.val > newNode.left.max);
        }

        if(newNode.right != null){

            newNode.min = Math.min(newNode.right.min, newNode.min);
            newNode.max = Math.max(newNode.right.max, newNode.max);
            newNode.sum = newNode.sum + newNode.right.sum;
            newNode.isBST = newNode.isBST && newNode.right.isBST && (root.val < newNode.right.min);
        }
        
        return newNode;

    }
    int maxNode(NodeInfo node){
        if(node == null){
            return 0;
        }
        int a = 0;
        int b = 0;
        int c = 0;
        if(node.isBST){
            a = node.sum;
        }
        b = maxNode(node.right);
        c = maxNode(node.left);

        return Math.max(a, Math.max(b, c));
    }
}
