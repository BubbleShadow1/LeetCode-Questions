public class jumpgame2 {

    public static int jump(int[] nums) {
       int curr=0;
       int far=0,jump=0;
       for(int i=0;i<nums.length-1;i++)
       {
        far=Math.max(far,nums[i]+i);
        if(curr==i)
        {
            jump++;
            System.out.println(i);
            System.out.println(jump+",");
            curr=far;
            System.out.println(curr+":curr");
        }

       }
       return jump;
     }
    public static void main(String args[])
    {
        int nums[]={2,3,1,1,4};
        System.out.println(jump(nums));
        

    }
    
}
