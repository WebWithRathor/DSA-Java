package LinkedList;

public class MyLinkedList {

     Node head;
    private int size = 0;

//    Traversal / Printing, Recursive traversal
//			 insert / delete at index

    public MyLinkedList(int val) {
        Node newNode = new Node();
        newNode.val = val;
        size++;
        head = newNode;
    }

    public int search(int val) {
        int count = 0;
        Node temp = head;
        while (temp != null && temp.val != val) {
            count++;
            temp = temp.next;
        }
        if (temp == null) return -1;
        return count;
    }

    public int size() {
        return size;
    }

    public Node add(int val, int index) {
        if (size < index)
            throw new IndexOutOfBoundsException("for index : " + index);
        Node newNode = new Node();
        newNode.val = val;
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            head = head.next;
        }
        newNode.next=head.next;
        head.next=newNode;
        head = temp;
        return head;
    }

    public Node addFirst(int val) {
        Node newNode = new Node();
        newNode.val = val;
        newNode.next = head;
        head = newNode;
        size++;
        return head;
    }

    public Node addLast(int val) {
        Node newNode = new Node();
        newNode.val = val;
        size++;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    public void deleteFirst() {
        if (head == null) return;
        if (head.next != null) {
            head = head.next;
        } else head = null;
        size--;
    }

    public void deleteLast() {
        Node temp = head;
        if (temp == null) return;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        size--;
        temp.next = null;
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
