package Data_Structures.LinkedList;

public class Main {
    public static void main(String[] args) {
        ListNode l3 = new ListNode(1,null);
        ListNode l2 = new ListNode(2,l3);
        ListNode l1 = new ListNode(1,l2);

        ListNode k3 = new ListNode(3,null);
        ListNode k2 = new ListNode(2,k3);
        ListNode k1 = new ListNode(1,k2);

        ListNode d3 = new ListNode(1,null);
        ListNode d2 = new ListNode(0,d3);
        ListNode d1 = new ListNode(1,d2);

        ListNode p4 = new ListNode(4,null);
        ListNode p3 = new ListNode(1,p4);
        ListNode p2 = new ListNode(3,p3);
        ListNode p1 = new ListNode(1,p2);

        // Add 2 linked list
        ListNode result = new AddTwoNumbers().addTwoNumbers(l1,k1);
        System.out.print("Sum : ");
        while(result!=null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        System.out.println();

        // DecimalValue
        System.out.println("Decimal value : " + " " + new DecimalValue().getDecimalValue(d1));

        // Delete Node
        new DeleteNode().deleteNode(k2);
        System.out.print("Deleted List : ");
        while(k1!=null) {
            System.out.print(k1.val + " ");
            k1 = k1.next;
        }
        System.out.println();

        // Next Larger Node
        int[] resultArray = new NextLargerNode().nextLargerNodes(l1);
        System.out.print("Next larger List : ");
        for(int r : resultArray) {
            System.out.print(r + " ");
        }
        System.out.println();

        // Partition List
        ListNode partitionNode = new PartitionList().partition(p1, 3);
        System.out.print("Partition List : ");
        while(partitionNode!=null) {
            System.out.print(partitionNode.val + " ");
            partitionNode = partitionNode.next;
        }
        System.out.println();

        // Reverse List
        ListNode reverse = new ReverseList().reverseList(p1);
        System.out.print("Reversed List : ");
        while(reverse!=null) {
            System.out.print(reverse.val + " ");
            reverse = reverse.next;
        }
        System.out.println();
    }
}
