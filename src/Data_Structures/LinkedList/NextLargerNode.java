package Data_Structures.LinkedList;

import java.util.ArrayList;

public class NextLargerNode {
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int c = 0;
        while(head.next!=null) {
            ListNode temp = new ListNode();
            temp = head;
            while(temp!=null) {
                if(head.val < temp.val){
                    arrayList.add(temp.val);
                    break;
                }
                if(temp.next==null)
                    arrayList.add(0);
                temp = temp.next;
            }
            head = head.next;
        }
        int[] result = new int[arrayList.size()+1];
        for(int a : arrayList){
            result[c] = a;
            c++;
        }
        result[c] = 0;
        return result;
    }
}
