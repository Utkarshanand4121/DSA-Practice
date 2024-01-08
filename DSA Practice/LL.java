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

    public static int getCount(Node head) {

        // Code here
        int sz = 0;
        while (head != null) {
            sz++;
            head = head.next;
        }
        return sz;
    }

    public boolean isIdentical(Node head1, Node head2) {
        // write your code here
        Node temp1 = head1;
        Node temp2 = head2;
        while (temp1 != null && temp2 != null) {
            if (temp1.data != temp2.data) {
                return false;
            } else {
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
        }
        while (temp1 != null) {
            return false;
        }
        while (temp2 != null) {
            return false;
        }
        return true;
    }

    Node reverseList(Node head) {
        // code here
        Node prev = null;
        Node curr = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }

    int getMiddle(Node head) {
        // Your code here.
        Node temp = head;
        int sz = 0;
        while (temp != null) {
            sz++;
            temp = temp.next;

        }
        temp = head;
        int sz1 = 0;
        while (temp != null) {
            sz1++;
            temp = temp.next;
            if (sz1 == sz / 2) {
                return temp.data;
            }
        }
        return head.data;
    }

    public static void main(String[] args) {

    }
}
