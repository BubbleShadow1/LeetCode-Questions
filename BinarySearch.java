import java.util.Scanner;
public class BinarySearch{
    public static int search(int[] nums,int s,int l,int target){
           int mid=(s+l)/2;
           if(target==nums[mid])
           {
   return mid;
           }
           else if(target<nums[mid])
           {
   return search(nums,0,mid-1,target);
           }
       else if(target>nums[mid])
       {
   return search(nums,mid+1,l,target);
   }
       return -1;
   }
public static void main(String args[])
{
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int arr[]=new int[232];
    for(int i=0;i<n;i++)
    {
        arr[i]=s.nextInt();
    }
    int search=s.nextInt();
int x=search(arr,0,arr.length-1,search);
System.out.println(x);

}


}