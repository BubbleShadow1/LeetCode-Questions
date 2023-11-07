import java.util.Scanner;
public class reversetheinteger {
public static int reverse(int x)
{
    int a=Math.abs(x);
    int limit=Integer.MAX_VALUE/10;
    int num=0;

    while(a>0)
    {
        if(num>limit)   return 0;
        int e=a%10;
        num=num*10+e;
        a=a/10;

    }
    if(x<0)
    {
        return num*-1;
    }
    else
    {
        return num;
    }
}
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=0;i<t;i++)
        {
int n=s.nextInt();
int x=reverse(n);
System.out.println(x);

        }
    }
    
}
