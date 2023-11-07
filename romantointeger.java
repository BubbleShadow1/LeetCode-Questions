import java.util.Scanner;
public class romantointeger {
    public static int romanToInt(String s) {
        int size=s.length();        
      int arr[]=new int[2000];
      arr[73]=1;
      arr[86]=5;
      arr[88]=10;
      arr[75]=50;
      arr[67]=100;
      arr[68]=500;
      arr[77]=1000;
int sum=0;
int p=0;
      int i=1;
      while(i<size)
      {
        if(p!=1 && i==1){
        if(s.charAt(0)==s.charAt(1))
        {
           

            int a=s.charAt(i);
            int b=s.charAt(i-1);
            int sum2=arr[a]+arr[b];
            sum=sum+sum2;
            p++;
            continue;
}
        }
        else if(s.charAt(i-1)>=s.charAt(i))
        {
            System.out.println(s.charAt(i-1));
            int a=s.charAt(i-1);
            System.out.println(arr[a]+" arr[a] and value of a= "+a);
sum=sum+arr[a];
i++;
continue;
        }
        else if(s.charAt(i-1)<s.charAt(i))
        {
            int a=s.charAt(i);
            int b=s.charAt(i-1);
            int sub=arr[a]-arr[b];
            sum=sum+sub;
            i+=2;
            continue;
        }


      }
        
       return sum; 
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        int sy=romanToInt(str);
        System.out.println(sy);
    }
    
}
