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
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void addInMiddle(int idx, int data) {
        Node newNode = new Node(data);
        if (idx == 0) {
            addFirst(data);
            return;
        }
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
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

        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    // search using recursion
    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int recSerach(int key) {
        return helper(head, key);
    }

    // reversing a LL
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // Delete from end
    public void deleteEnd(int n) {
        // size calculate karna hai
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        int i = 1;
        Node prev = head;
        int iToFind = sz - n;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }

    // LL is pallindrome
    public Node findMid(Node head) { // Slow - fast approach
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // moves 1 dist
            fast = fast.next.next; // moves 2 dist
        }
        return slow; // slow is the mid
    }

    public boolean checkPallindrome() {
        if (head == null || head.next == null) {
            return true;
        }

        // step 1 -- find mid
        Node mid = findMid(head);

        // strp 2 -- reverse half LL
        Node prev = null;
        Node curr = mid;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        // step 3 -- check for similarity

        Node right = prev;
        Node left = head;

        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static boolean isCycle() { // No need of object
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true; // cycle exists
            }
        }
        return false; // cycle not exists
    }

    // Remove a cycle
    public static void removeCycle() {
        Node slow = head;
        Node fast = head;
        boolean isCycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                isCycle = true;
                break;
            }
        }
        if (isCycle == false) {
            return;
        }

        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;
    }

    public static void main(String[] args) {
        LLRevision ll = new LLRevision();
        // ll.addFirst(1);
        // ll.addFirst(2);
        // ll.addFirst(3);
        // ll.addFirst(4);
        // ll.addLast(5);
        // ll.addInMiddle(2, 10);
        // ll.print();
        // // ll.removeFirst();
        // ll.print();
        // System.out.println(ll.size);
        // // System.out.println(ll.itrKey(10));
        // // ll.removeLast();
        // // ll.print();
        // // System.out.println(ll.recSerach(3));
        // ll.reverse();
        // ll.print();
        // ll.deleteEnd(2);
        // ll.print();

        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(1);
        // ll.print();
        // System.out.println(ll.checkPallindrome());

        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        // 1->2->3->2
        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
    }
}
