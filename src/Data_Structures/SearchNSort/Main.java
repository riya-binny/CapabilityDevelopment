package Data_Structures.SearchNSort;

import Data_Structures.LinkedList.ListNode;

public class Main {
    public static void main(String[] args) {
        int[] input = {-1,0,3,5,9,12};

        ListNode p4 = new ListNode(3,null);
        ListNode p3 = new ListNode(1,p4);
        ListNode p2 = new ListNode(2,p3);
        ListNode p1 = new ListNode(4,p2);

        ListNode d5 = new ListNode(4,null);
        ListNode d4 = new ListNode(3,d5);
        ListNode d3 = new ListNode(3,d4);
        ListNode d2 = new ListNode(2,d3);
        ListNode d1 = new ListNode(1,d2);

        ListNode a4 = new ListNode(4,null);
        ListNode a3 = new ListNode(3,a4);
        ListNode a2 = new ListNode(2,a3);
        ListNode a1 = new ListNode(1,a2);

        ListNode b4 = new ListNode(8,null);
        ListNode b3 = new ListNode(6,b4);
        ListNode b2 = new ListNode(5,b3);
        ListNode b1 = new ListNode(2,b2);

        // Binary Search
        System.out.println(new BinarySearch().search(input, 9));

        // Insertion sort
        ListNode result = new InsertionSort().insertionSortList(p1);
        while(result!=null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        System.out.println();

        // Remove duplicates
        ListNode duplicate = new RemoveDuplicates().deleteDuplicates(d1);
        while(duplicate!=null) {
            System.out.print(duplicate.val + " ");
            duplicate = duplicate.next;
        }
        System.out.println();

        // Remove duplicates
        ListNode merge = new MergeSortedArray().mergeTwoLists(a1,b1);
        while(merge!=null) {
            System.out.print(merge.val + " ");
            merge = merge.next;
        }
        System.out.println();
    }
}
