public class Solution2 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
      public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
          ListNode l3 = new ListNode(0);
          int carry = 0;
          ListNode curr = l3;
          int sum = 0;
          while (l1 != null || l2 != null) {
              int x = (l1 != null) ? l1.val : 0;
              int y = (l2 != null) ? l2.val : 0;
              sum = x + y + carry;
              carry = sum / 10;
              if (l1!=null){
              l1 = l1.next;}
              if (l2!=null){
              l2 = l2.next;}
              curr.next = new ListNode(sum % 10);
              curr = curr.next;
          }
          if (carry > 0) {
              curr.next = new ListNode(carry);
              curr = curr.next;
          }
          return l3.next;
      }
}


