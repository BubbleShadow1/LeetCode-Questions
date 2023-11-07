import java.util.ArrayList;
import java.util.List;
public class maxlengthwithuniquechar {
    public static int maxLength(List<String> arr) {
        int size=arr.size();
        if(size==1)
        {
            String str=arr.get(0);
            int len=str.length();
            return len;
        }
        int prev=0;
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                String str=arr.get(i)+arr.get(j);
if(str.length()>prev)
{
    prev=str.length();


}
            
}
        }
     return prev;   
    }
    public static void main(String args[])
    {

        List<String> arr=new ArrayList<String>();
        arr.add("abcdefghijklmnopqrstuvwxyz");
        

        int maxlength=maxLength(arr);
        System.out.println(maxlength);
    }
}
