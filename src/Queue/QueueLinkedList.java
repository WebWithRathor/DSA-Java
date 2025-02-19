package Queue;

import LinkedList.Node;

public class QueueLinkedList {
    private Node head;
    private int size;

    public QueueLinkedList() {
        head = null;
        size = 0;
    }

    public Node offer(int val) {
        Node newNode = new Node();
        newNode.val = val;
        size++;
        Node temp = head;
        if (temp == null) {
            head = newNode;
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        return head;
    }

    public void poll() {
        if (head == null) return;
        if (head.next != null) {
            head = head.next;
        } else head = null;
        size--;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node temp = head;
        for(int  i =0 ; i< size;i++){
            sb.append(temp.val +" -> ");
            temp = temp.next;
        }
        sb.append("null");
        return sb.toString();
    }
}
