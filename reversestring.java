import java.util.Scanner;
public class reversestring {
    public static void reverseStrings(char[] s)
    {   int k=0;
       int i=s.length-1;
  
        char str[]=new char[s.length];
        while(i>=0)
        {
            str[k]=s[i];
            k++;
            i--;
        }       
        for(int j=0;j<=s.length-1;j++)
       {
s[j]=str[j];
       }
        
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=5;
        char arr[]={'h','e','l','l','o'};  
      reverseStrings(arr);
       for(int i=0;i<n;i++)
       {
System.out.print(arr[i]+" ");
       }
      
        
    }     
}
