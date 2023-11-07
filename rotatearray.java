import java.util.Scanner;
public class rotatearray {
    public static void rotate(int[] nums, int k){
        int arr1[]=new int[nums.length];
        int i=0;
        for(i=0;i<(nums.length-k-1);i++)
       {
        arr1[i]=nums[1+k+i];
       }
       int p=0;
       while(i<nums.length)
       {
           arr1[i]=nums[p];
           p++;
           i++;
       }
       
       for(int o=0;o<nums.length;o++)
       {
           nums[o]=arr1[o];
       }
    }
    public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=s.nextInt();
    }
    int k=s.nextInt();
    rotate(arr,k);
    for(int o=0;o<n;o++)
    {
        System.out.print(arr[o]+" ");
    }
    
} 
}
