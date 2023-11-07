public class jumpgame {
    static boolean bl=false;
    public static boolean canJump(int[] nums,int idx) {
        if(idx>=nums.length-1){bl=true; return true;}

        for(int i=idx;i<nums.length;i++)
        {
            for(int j=nums[i];j>=1;j--)
            {
            if(j+i<=nums.length-1 )
            {
               bl= canJump(nums,j+i);
               if(bl==true) {
                return true;
               }
            }
            else {
                bl=false;
                return bl;
            }
        }
        
        }
        return bl;
      
    }
    public static void main(String args[])
    {
        int nums[]={3,2,1,0,4};
        boolean y=canJump(nums,0);
        System.out.println(y);
    }
  
}
