import java.util.Scanner;

public class findpivotindex {
    static int sum(int number[],int first,int last)
    {
        int sum=0;
        for(int i=first;i<=last;i++)
        {
            sum=number[i]+sum;
}
        return sum;
    }
    public static int pivotIndex(int[] nums) {
        int i=0;
        while(i<nums.length)
        {
            if(i==0 || i==nums.length-1)
            {
continue;
            }
            int p1=sum(nums,0,i-1);
            int p2=sum(nums,i+1,nums.length-1);
            if(p1==p2)
            {
                return i;
            }
            
            
        }
        return -1;
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
      int ar=pivotIndex(arr);
       
            System.out.print(ar+" ");
      
        
    } 
}
