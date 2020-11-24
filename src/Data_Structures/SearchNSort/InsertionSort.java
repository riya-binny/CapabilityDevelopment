package Data_Structures.SearchNSort;

import Data_Structures.LinkedList.ListNode;

public class InsertionSort {
    public ListNode insertionSortList(ListNode head) {
        if(head == null)
            return null;
        ListNode output = new ListNode(head.val);
        head = head.next;
        while(head != null) {
            ListNode prev = null, cur = output;
            while( cur != null && cur.val < head.val) {
                prev = cur;
                cur = cur.next;
            }
            ListNode temp = new ListNode(head.val);
            if(prev == null) {
                temp.next = cur;
                output = temp;
            }else{
                prev.next = temp;
                temp.next = cur;
            }
            head = head.next;
        }
        return output;
    }
}
