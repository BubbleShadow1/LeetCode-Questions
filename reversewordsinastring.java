public class reversewordsinastring {
    public static String reverseWords(String s) {
        String str="";
        int p=0;
        int i=0;
        String ser=" ";
while(i<s.length())
{
    if(s.charAt(i)!=' ')
    {
        str=s.charAt(i)+str;
        i++;
        continue;
    }
    else{
        p++;
        System.out.println(p);
    str=str+" ";
    System.out.println(str);
    i++;

    }
}
return str;
    }
    public static void main(String args[])
    {
        String s="hello world i am unstoppable.";
        String ss=reverseWords(s);
        System.out.println(ss);

    }
    
}
