package LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(2);
        linkedList.addFirst(1);
        linkedList.addLast(3);
        System.out.println(linkedList.contains(4));
    }
}
