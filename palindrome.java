import java.util.Scanner;
public class palindrome {
    public static boolean isPalindrome(int x) {
        int rr=x;
          
                int rev=0;
                while(x>0)
                {
                    rev=(rev*10)+(x%10);
                    x=x/10;
                }
                System.out.println(rev);
                if(rev==rr)
                {
        return true;
                }
                else
                {
        return false;
                }
                
            }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        boolean y=isPalindrome(n);
        System.out.println(y);
    }
}
