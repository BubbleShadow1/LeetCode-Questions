public class ListNode {
    int val;
    ListNode next;
    public ListNode(){ };
    public ListNode(int val)
    {
        this.val=val;
        next=null;
    }
    public ListNode(int data,ListNode n)
    {
        this.val=data;
        this.next=n;
    }
}
