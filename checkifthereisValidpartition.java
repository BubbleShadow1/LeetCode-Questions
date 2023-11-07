public class checkifthereisValidpartition {
    public boolean validPartition(int[] nums) {
        return validPartition1(nums, 0);
    }
    public boolean validPartition1(int[] nums,int idx) {
        int u=0,i=idx;
        boolean b1=false,b2=false,b3=false;
        if(idx>=nums.length) return true;
            if(i+1<nums.length && nums[i]==nums[i+1]) {b1=validPartition1(nums,i+2);}
            if(i+2<nums.length  && nums[i]==nums[i+1] && nums[i+1]==nums[i+2]){ b2=validPartition1(nums,i+3); }
            if(i+2<nums.length && nums[i+1]-nums[i]==1 && nums[i+2]-nums[i+1]==1){ b3=validPartition1(nums,i+3 );}
           
            if(b1==true || b2==true || b3==true)
            {
                return true;
            }
          
            return false;
    
        }
    
}
