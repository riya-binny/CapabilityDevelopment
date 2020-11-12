package LinkedList;

import java.util.NoSuchElementException;

public class LinkedList {
    private Node first;
    private Node last;

    private Boolean isEmpty() {
        return first==null;
    }

    public void addFirst(int value) {
        Node newNode = new Node(value);
        if(isEmpty())
            first = last = newNode;
        else {
            newNode.setNext(first);
            first = newNode;
        }
    }

    public void addLast(int value) {
        Node newNode = new Node(value);
        if(isEmpty()) {
            first=last=newNode;
        }
        else {
            last.setNext(newNode);
            last = newNode;
        }
    }

    public int indexOf(int value) {
        int count = 1;
        Node node = first;
        while (node != null) {
            if(node.getValue() == value)
                return count;
            count++;
            node = node.getNext();
        }
        return -1;
    }

    public Boolean contains(int value) {
        if(indexOf(value) == -1)
            return false;
        return true;
    }

    public void removeFirst() {
        if(isEmpty())
            throw new NoSuchElementException();
        if(first == last){
            first = last = null;
            return;}
        var second = first.getNext();
        first.setNext(null);
        first = second;
    }

    public void removeLast() {
        if(isEmpty())
            throw new NoSuchElementException();
        else if(first==last){
            first=last=null;
            return;
        }
        else{
            Node node = first;
            while (node.getNext() != last){
                node = node.getNext();
            }
            last = node;
            last.setNext(null);
        }
    }

    public void printLinkedList() {
        Node node = first;
        while (node != null) {
            System.out.println(node.getValue());
            node = node.getNext();
        }
    }
}
