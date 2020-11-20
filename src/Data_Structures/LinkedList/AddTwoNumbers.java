package Data_Structures.LinkedList;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = new ListNode();
        ListNode temp = head;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int val1 = l1 != null ? l1.val : 0;
            int val2 = l2 != null ? l2.val : 0;
            int val = (val1 + val2 + carry) % 10;
            carry = (val1 + val2 + carry) / 10;
            ListNode result = new ListNode(val);
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
            temp.next = result;
            temp = temp.next;
        }
        if (carry > 0) {
            ListNode result = new ListNode(carry);
            temp.next = result;
            temp = temp.next;
        }

        return head.next;
    }
}
