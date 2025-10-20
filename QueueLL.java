public class QueueLL {
    static class Node {
        int data;
        Node next;
        Node(int n) {
            this.data = n;
            this.next = null;
        }
    }
    static class Queue {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            return head == null && tail == null;
        }
        //add
        public static void add(int n) {
            Node newNode = new Node(n);
            if(tail == null) {
                tail = head = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }
        //
        public static int remove() {
            if(head == null) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int top = head.data;
            if(head == tail) {
                tail = null;
            }
            head = head.next;
            return top;
        }
        //peek
        public static int peek() {
            if(head == null) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String args[]) {
        Queue c = new Queue();
        c.add(1);
        System.out.println(c.remove());
        c.add(2);
        System.out.println(c.remove());
    }
}
