import java.util.Scanner;
public class permutationinstring {
    public boolean checkInclusion(String s1, String s2) {
        int arr[]=new int[s2.length()];
        int loc=0;
        int p=0;
        for(int i=0;i<s1.length();i++)
        {
            for(int j=0;j<s2.length();j++)
            {
                if(s1.charAt(i)==s2.charAt(j))
                {
                    arr[j]++;
                    loc=j;
                    if(loc+1==j)
                    {
                        p++;

                    }

                }
            }
        }
        for(int k=0;k<s2.length();k++)
        {
            if()
        }
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        String s2=s.nextLine();

        
    }
    
}
