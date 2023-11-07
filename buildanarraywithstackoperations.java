import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class buildanarraywithstackoperations {
    public List<String> buildArray(int[] target, int n) {
      int k=0;
      List<String> list=new ArrayList<String>();
      Arrays.sort(target);
        for(int i=1;i<=n;i++)
      {
list.add("push");
 System.out.println("push");
        if(i!=target[k])
        {
            list.add("pop");
            System.out.println("pop");
        }
        if(target.length>i)
        {
break;
        }
        k++;
      }
      return list;
   }
    
}
