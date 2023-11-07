public class firstindexfirstoccurence {
    public static int strStr(String haystack, String needle) {
       char r=needle.charAt(0);
       int len=needle.length();
       int i=0;
       while(i<haystack.length())
       {
          if(haystack.charAt(i)==r)
          {
            int j=r;
            j++;
            int k=i;
            k++;
            int p=0;
            while(j<len)
            {
                if(haystack.charAt(k)==needle.charAt(j))
                {
                    j++;
                    k++;
                }
                else
                {
                    p=1;
                    break;
                }
            }
           if(p!=1)
           {
            System.out.println(i);
            return i;
           }
          }
          i++;
       }
       return -1;
    }
    public static void main(String args[])
    {
        String haydstack="leetcode";
        String needle="leeto";
int x=strStr(haydstack, needle);
System.out.println(x);
    }
}
