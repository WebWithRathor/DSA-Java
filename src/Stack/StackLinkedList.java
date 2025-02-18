package Stack;

import LinkedList.Node;

import java.util.EmptyStackException;

public class StackLinkedList {
    private Node head;
    private int size;

    public StackLinkedList() {
        head = null;
        size = 0;
    }

    public void push(int val) {
        Node newNode = new Node();
        newNode.val = val;
        Node temp = head;
        size++;
        if (temp == null) {
            head = newNode;
            return;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public Integer pop() {
        if (head == null)
            throw new EmptyStackException();

        size--;
        int val;
        if (head.next == null) {
            val = head.val;
            head = null;
        } else {
            Node prev = null, curr = head;
            while (curr.next != null) {
                prev = curr;
                curr = curr.next;
            }
            val = curr.val;
            prev.next = null;
        }
        return val;
    }

    @Override
    public String toString() {
        Node temp = head;
        StringBuilder sb = new StringBuilder();
        while (temp != null) {
            sb.append(temp.val + " -> ");
            temp = temp.next;
        }
        sb.append("null");
        return sb.toString();
    }

}
