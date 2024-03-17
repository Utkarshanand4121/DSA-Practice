import java.util.ArrayList;
import java.util.Stack;

public class StackRevision2 {
    public static class StackB {
        static ArrayList<Integer> arr = new ArrayList<>();
        public static boolean isEmpty() {
            return arr.size() == 0;
        }

        public static void push(int data) {
            arr.add(data);
        }

        public static int pop() {
            int top = arr.get(arr.size() - 1);
            arr.remove(arr.get(arr.size() - 1));
            return top;
        }

        public static int peek() {
            return arr.get(arr.size() - 1);
        }
    }

    public static void print(Stack<Integer> s) {
        while(!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    public static class StackLL {
        static class Node {
            int data;
            Node next;
            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }
        static Node head = null;

        public static boolean isEmpty() {
            return head == null;
        }

        public static void push(int data) {
            Node newNode = new Node(data);
            if(isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public static int pop() {
            if(isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek() {
            if(isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }

    public static void pushAtBottom(Stack<Integer> s, int data) {
        if(s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void reverse(Stack<Integer> s) {
        if(s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverse(s);
        pushAtBottom(s, top);
    }

    public static boolean duplicate(String str) {
        Stack<Character> s = new Stack<>();
        
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if(ch == ')') {
                int cnt = 0;
                while(s.peek() != '(') {
                    s.pop();
                    cnt++;
                }
                if(cnt < 1) {
                    return true;
                } else {
                    s.pop();
                }
            } else {
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // StackB s = new StackB();
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // System.out.println(s.pop());

        // StackLL s2 = new StackLL();
        // s2.push(1);
        // s2.push(2);
        // System.out.println(s2.pop());
        // Stack<Integer> s = new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // pushAtBottom(s, 4);
        // // print(s);
        // reverse(s);
        // print(s);

        System.out.println(duplicate("((a+b))"));
    }
}
