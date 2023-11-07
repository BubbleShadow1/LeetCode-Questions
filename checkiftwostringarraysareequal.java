import java.util.Scanner;
public class checkiftwostringarraysareequal {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1="";
        String str2="";
        int i=0;
        int j=0;
        while(word1.length>i)
        {
            str1=str1+word1[i];
            i++;
        }
        while(word2.length>j)
        {
            str2=str2+word2[j];
            j++;
        }
        System.out.println(str1+":word1");
        System.out.println(str2+":word2");

    if(str1.length()==str2.length())
    {
        int k=0;
        while(str1.length()>k)
        {
            if(str1.charAt(k)==str2.charAt(k))
            {
                k++;
            }
            else
            {
                return false;
            }
        
            
        }
        return true;
    }
    return false;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String word1[]={"ab", "c"};
        String word2[]={"a", "bc"};
boolean u=arrayStringsAreEqual(word1,word2);
System.out.println(u);

    }
    
}
