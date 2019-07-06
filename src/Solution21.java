
class Solution21 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newnode = new ListNode(0);
        ListNode newnode1=newnode;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                newnode.next = l1;
                l1 = l1.next;
                newnode=newnode.next;
            } else {
                newnode.next = l2;
                l2 = l2.next;
                newnode=newnode.next;
            }
        }
        if (l1 == null) {
            while (l2 != null) {
                newnode.next = l2;
                l2 = l2.next;
                newnode=newnode.next;
            }
        }
        if (l2 == null) {
            while (l1 != null) {
                newnode.next = l1;
                l1 = l1.next;
                newnode=newnode.next;
            }
        }
        return newnode1.next;

    }


    }
