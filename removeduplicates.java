import java.util.Scanner;
public class removeduplicates {
    public static int removeDuplicates(int[] nums) { 
        int i=0;
         int prev=nums[0],p=1,k=1;
         while(i<nums.length)
         {
            if(prev<nums[i])
            {
                prev=nums[i];
i++;
p++;
nums[k]=nums[i];
k++;
            }
            else
            {
                i++;
            }
         }
return p;
    
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        int arr[]=new int[t];
        for(int i=0;i<t;i++)
        {
arr[i]=s.nextInt();
        }
        int x=removeDuplicates(arr);
System.out.println(x);

    }
    
}
