public class partitionlist {
    public ListNode partition(ListNode head, int x) {
        ListNode pr=head;
        ListNode pr2=head;
        ListNode h1=new ListNode(-1);
        ListNode prev=null;
        while(pr!=null)
        {
            if(h1.val<=x)
            {
            h1.next=pr;
            }
            pr=pr.next;
        }
        while(pr2!=null)
        {
            if(h1.val>x)
            {
                h1.next=pr;
            }
            pr=pr.next;
        }

        
        return h1.next;
    }
    
}
