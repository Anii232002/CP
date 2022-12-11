package CP;

class BinaryTreeMaximumPathSum {
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if(root==null)
        {
            return 0;
        }
        recurse(root);

        return max;
    }
    public int recurse(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int left = Math.max(recurse(root.left), 0);
        int right = Math.max(recurse(root.right), 0);

        max = Math.max(max, root.val + left + right);

        return root.val + Math.max(left, right);
    }
}