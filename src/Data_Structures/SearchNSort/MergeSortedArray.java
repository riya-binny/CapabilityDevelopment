package Data_Structures.SearchNSort;

import Data_Structures.LinkedList.ListNode;

public class MergeSortedArray {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }

        ListNode head = null;
        ListNode temp = null;

        if (l1.val <= l2.val) {
            temp = l1;
            l1 = l1.next;
        } else {
            temp = l2;
            l2 = l2.next;
        }

        head = temp;

        while (l1 != null && l2 != null) {

            if (l1.val <= l2.val) {
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
            }

            temp = temp.next;
        }

        if (l1 == null) {
            temp.next = l2;
        } else {
            temp.next = l1;
        }

        return head;

    }
}
