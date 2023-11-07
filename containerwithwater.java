import java.util.Scanner; //notcompleted
public class containerwithwater
{
    public static int maxArea(int[] height) {
        int prev=0;
        int loc=-1;
        int p=0;
        int loc2=-1;
        int dist2=0;
        for(int i=0;i<height.length;i++)
        {
            
            if(height[i]>prev)
            {
                prev=height[i];
                loc=i;
            }
            else if(height[i]==prev)
            {
                loc2=i;
            }
           
           
        }
        int prev2=0;
        int j=0;
        int dist=0;
        for(j=0;j<height.length;j++)
        {
            
            if(height[j]>prev2  && height[j]<prev )
            {
                prev2=height[j];
                dist=j;

            }
            else if(height[j]==prev2 && height[j]<prev)
            {
dist2=j;
            }
           
        }
   if((loc-dist)*prev>(loc2-dist2)*prev2)
   {
    int y=(loc-dist)*prev;
System.out.println(y);
   }   
   else
   { int y=(loc2-dist2)*prev2;
    System.out.println(y);
   }

System.out.println(prev2);
System.out.println(loc2);
System.out.println(dist);
return prev;
    }

   public static void main(String args[])
    {
   Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=0;i<t;i++)
        {
            int x=s.nextInt();
            int arr[]=new int[x];
            for(int j=0;j<x;j++)
            {
                arr[j]=s.nextInt();
            }
            int v=maxArea(arr);
            
            
        }
        

    }
    
}

