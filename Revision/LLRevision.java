public class LLRevision {
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
        
        newNode.next = head;
        head = newNode;
    }
    public void print() {
        if(head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+ "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
        
        tail.next = newNode;
        tail = newNode;
    }

    public void addInMiddle(int idx, int data) {
        Node newNode = new Node(data);
        if(idx == 0) {
            addFirst(data);
            return;
        }
        size++;
        Node temp = head;
        int i=0;
        while(i < idx-1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if(size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int itrKey(int key) {
        Node temp = head;
        int i = 0;

        while(temp != null) {
            if(temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    public static void main(String[] args) {
        LLRevision ll = new LLRevision();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addLast(5);
        ll.addInMiddle(2, 10);
        ll.print();
        ll.removeFirst();
        ll.print();
        System.out.println(ll.size);
        System.out.println(ll.itrKey(10));
    }
}
