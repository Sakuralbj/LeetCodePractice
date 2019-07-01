public class Solution206 {
    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public ListNode reverseList(ListNode head) {
        ListNode curr=head,pre=null;
        while (curr!=null){
            ListNode next1=curr.next;
            curr.next=pre;
            pre=curr;
            curr=next1;
        }
        return pre;

    }
}
