import org.w3c.dom.Node;

public class LL {

    public class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    void display(Node head) {
        // add code here.
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static int getCount(Node head)
    {
        
        //Code here
        int sz = 0;
        while(head != null) {
            sz++;
            head = head.next;
        }
        return sz;
    }
    public static void main(String[] args) {

    }
}
