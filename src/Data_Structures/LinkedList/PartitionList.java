package Data_Structures.LinkedList;

public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode output = new ListNode();
        output.next = head;
        ListNode current = output;
        ListNode prev = output;

        while (current != null && current.next != null) {

            if (current.next.val < x) {

                if (prev.next == current.next) {
                    current = current.next;
                    prev = prev.next;
                } else {
                    ListNode tmp = prev.next;
                    prev.next = current.next;
                    current.next = current.next.next;
                    prev.next.next = tmp;
                    prev = prev.next;
                }
            } else {
                current = current.next;
            }
        }
        return output.next;
    }
}
