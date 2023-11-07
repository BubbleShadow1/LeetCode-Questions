public class stringtointeger{
public static int myAtoi(String s) {
    String str="";
    int i=0;
    while(i<s.length())
    {
        if(s.charAt(i)=='-' || s.charAt(i)=='+')
        {
str=""+str;
continue;
        }
        if(s.charAt(i)==' ')
        {
i++;
continue;
        }
        if(s.charAt(i)>0)
        {
            str=""+str;
            i++;
            continue;
        }
        else
        {
            i++;
            continue;
        }
       
        
    }
    int x=Integer.valueOf(str);
    return x;
}
    public static void main(String args[])
{
    String str="42";
    int x=myAtoi(str);
    System.out.println(x);
}
}
