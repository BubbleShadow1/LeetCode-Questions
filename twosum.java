import java.util.Scanner;
public class twosum {
    public static int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int arr[]=new int[2];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                
                if(numbers[i]+numbers[j]==target)
                {
                    arr[0]=i+1;
                    arr[1]=j+1;
                        return arr;
                    
                }
                    
                
            }
        }
          return arr;           
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
      arr=twoSum(arr,k);
        for(int o=0;o<arr.length;o++)
        {
            System.out.print(arr[o]+" ");
        }
        
    } 
}
