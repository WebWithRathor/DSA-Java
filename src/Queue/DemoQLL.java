package Queue;

public class DemoQLL {

    public static void main(String[] args) {
//        QueueLinkedList q = new QueueLinkedList();
//        q.offer(1);
//        q.offer(2);
//        q.offer(3);
//        q.poll();
//        q.poll();
//        System.out.println(q);

//        QueueArray qa = new QueueArray();
//        qa.offer(5);
//        qa.offer(1);
//        qa.offer(2);
//        qa.offer(3);
//        qa.offer(4);
//        System.out.println(qa.poll());
//        System.out.println(qa.poll());
//        System.out.println(qa.poll());
//        System.out.println(qa.poll());
//        System.out.println(qa.poll());
//        System.out.println(qa);

        QueueCircularArray q = new QueueCircularArray();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        System.out.println(q);
    }
}
