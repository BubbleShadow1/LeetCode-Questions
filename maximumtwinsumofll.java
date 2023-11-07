import java.util.HashMap;
import java.util.List;
public class maximumtwinsumofll {
    public static int pairSum(ListNode head) {
       int u=0;
       HashMap <Integer,Integer> hm=new HashMap<>();
    ListNode t=head;
       while(t!=null)
       {
         hm.put(u,t.val);
         t=t.next;
        u++;
       }
       int max=Integer.MIN_VALUE;
for(int i=0;i<u;i++)
{
    int y=u-1-i;
    int s=hm.get(i);
    int sum=s+hm.get(y);
    if(max<sum) max=sum;
}
        return max;
    }
    public static void main(String args[])
    {
        ListNode p1=new ListNode(5);
            ListNode p2=new ListNode(4);
            ListNode p3=new ListNode(2);
            ListNode p4=new ListNode(1);
p1.next=p2;
p2.next=p3;
p3.next=p4;
     System.out.println(pairSum(p1));                                               

    }
}
