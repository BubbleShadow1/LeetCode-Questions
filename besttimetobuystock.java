//not completed yet
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class besttimetobuystock {
    public static int maxProfit(int[] prices) {
        int maxProfit=Integer.MIN_VALUE;
       int minsofar=Integer.MAX_VALUE;
       for(int i=0;i<prices.length;i++)
       {
         if(prices[i]<minsofar)
         {
            minsofar=prices[i];
         }
         if(maxProfit<prices[i]-minsofar)
         {
maxProfit=prices[i]-minsofar;
         }
       }
 return maxProfit;
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
int y=maxProfit(arr);
System.out.println(y);
    }
}
