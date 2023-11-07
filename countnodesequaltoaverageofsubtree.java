
public class countnodesequaltoaverageofsubtree {
 int n=0;
 int k=0;
    public int averageOfSubtree(TreeNode root) {
      if(root==null){return 0;}
      averageOfSubtree(root.left);
      averageOfSubtree(root.right);
if((n+root.val)/k==(root.val))
{
    return root.val;
}
      n+=root.val;
      k++;
       return -1;
    }
   
}
