public class removeelement {
    public static int removeElement(int[] nums, int val) {
        int i=0,k=0,p=0;
        while(i<nums.length)
        {
            if(nums[i]==val)
            {
                i++;
                
            }
            else
            {
                nums[k]=nums[i];
                p++;
                i++;
            }

        }
        return p;
    }
    public static void main(String args[])
    {
int arr[]={0,1,2,2,3,0,4,2};
int x=removeElement(arr,2);
System.out.println(x);
    }
    
}
