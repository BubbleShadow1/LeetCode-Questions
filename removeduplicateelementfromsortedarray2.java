import java.util.HashMap;

public class removeduplicateelementfromsortedarray2{
    public int removeDuplicates(int[] nums) {
    int arr[]=new int[nums.length]; 
         int k=0,y=0,m=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
            {
                k=hm.get(nums[i]);
                hm.put(nums[i],++k);
k++;
                if(k==1)
                {
arr[y]=nums[i];
y++;
m++;
                }
            }
            else{
                hm.put(nums[i],0);
                arr[y]=nums[i];
                y++;
                m++;
            }

i++;
        }

return m;
    }

}