package Data_Structures.SearchNSort;

import Data_Structures.LinkedList.ListNode;

public class RemoveDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode l = new ListNode();
        l.next = head;
        ListNode temp = l;
        while (head != null){
            if (head.next != null && head.next.val == head.val){
                head = head.next;
                while (head != null && head.val == temp.next.val)
                    head = head.next;
                temp.next = head;
            }else{
                head = head.next;
                temp = temp.next;
            }
        }
        return l.next;
    }
}
