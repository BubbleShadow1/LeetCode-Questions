import java.util.Scanner;
public class mismatch {

    public static int[] findErrorNums(int[] nums) {
        int arr[]=new int[2];
        int k=0;

    int y=nums.length;
    int x=nums.length;
       int j=0;
       int p=0;
       int arr1[]=new int[y];
       int arr2[]=new int[y];
            while(j<x)
            {
            if(y==nums[j])
            {
                arr1[y-1]++;
                arr2[y-1]=j;
y--;
j++;
p++;
continue;    
}
j++;
if(p!=x)
{
j=0;
}
else {
    break;
}
        }
        for(int i=0;i<x;i++)
        {
            if(arr1[i]==2)
            {
                arr[0]=i+1;
                arr[1]=arr2[i];
return arr;
            }
        }
        
        
       
        return arr;
        
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int nums[]={3,2,2};
        nums=findErrorNums(nums);
        for(int i=0;i<2;i++)
        {
            System.out.println(nums[i]);
        }



    }
    
}
