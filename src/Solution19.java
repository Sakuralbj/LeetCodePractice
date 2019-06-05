public class Solution19 {
     class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public ListNode removeNthFromEnd(ListNode head, int n) {
         ListNode dummy=new ListNode(0);
         dummy.next=head;
         ListNode l1=head,l2=head,pre=dummy;
         for (int i=0;i<n;i++){
             l1=l1.next;

         }
         while (l1!=null){
             l1=l1.next;
             pre=l2;
             l2=l2.next;
         }
         pre.next=l2.next;


    return dummy.next;

    }

}
