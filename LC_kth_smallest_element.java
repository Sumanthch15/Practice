class Solution {
    int res = -1;
    int count =0;
     public int kthSmallest(TreeNode root, int k) {
         helper(root, k);
 
         return res;
     }
 
     public void helper(TreeNode root, int k){
         if(root == null) return ;
         if(res!= -1)
         return;
         helper(root.left, k);
         count++;
         System.out.println(root.val+ " "+ k);
         if(k==count){
             res = root.val;
             return;
         }
         helper(root.right, k);
     }
 }