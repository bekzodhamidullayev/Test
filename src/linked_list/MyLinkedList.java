package linked_list;

public class MyLinkedList {

    private Node head;
    private Node tail;
    private int size = 0;


    class Node {
        private Integer val;
        private Node next;

        public Node(Integer val) {
            this.val = val;
        }
        public Node(Integer val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public boolean add(Integer e) {
        if(size == 0) {
            head = new Node(e);
            tail = head;
        } else {
            tail.next = new Node(e);
            tail = tail.next;
        }
        size++;
        return true;
    }

}
