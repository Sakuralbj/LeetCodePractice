
public class Solution98 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    TreeNode pre = null;

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (isValidBST(root.left) == false) {
            return false;
        }
        if (pre != null && pre.val >=root.val) {
            return false;
        }
        pre = root;
        return isValidBST(root.right);


    }
}


}
