import java.util.ArrayList;
import java.util.Stack;

public class Stacks {
    // Implementing Stack using linkedList
    class StackNode {
        int data;
        StackNode next;

        StackNode(int a) {
            data = a;
            next = null;
        }
    }

    StackNode top;

    // Function to push an integer into the stack.
    void push(int a) {
        // Add your code here
        if (top == null) {
            top = new StackNode(a);
            return;
        } else {
            StackNode newNode = new StackNode(a);
            newNode.next = top;
            top = newNode;
        }

    }

    // Function to remove an item from top of the stack.
    int pop() {
        // Add your code here
        if (top == null) {
            return -1;
        }
        int top1 = top.data;
        top = top.next;
        return top1;

    }

    public String reverse(String S) {
        // code here
        Stack<Character> s = new Stack<>();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            s.push(ch);
        }

        while (!s.isEmpty()) {
            char ch = s.pop();
            res.append(ch);
        }
        return res.toString();
    }

    // parenthesis checker ---> important logic
    static boolean ispar(String x) {
        // add your code here
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < x.length(); i++) {
            char ch = x.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } else if (!s.isEmpty() && ((s.peek() == '(' && ch == ')') || (s.peek() == '{' && ch == '}')
                    || (s.peek() == '[' && ch == ']'))) {
                s.pop();
            } else if (ch == ')' || ch == '}' || ch == ']') {
                s.push(ch);
            }
        }
        if (s.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    // NextGreater Element
    public static long[] nextLargerElement(long[] arr, int n) {
        // Your code here
        Stack<Long> s = new Stack<>();
        long nextGreater[] = new long[n];
        for (int i = n - 1; i >= 0; i--) {
            while ((!s.isEmpty()) && (arr[s.peek().intValue()] <= arr[i])) {
                s.pop();
            }
            if (s.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = arr[s.peek().intValue()];
            }
            s.push((long) i);
        }
        return nextGreater;
    }

    public void deleteMid(Stack<Integer> s, int sizeOfStack) {
        // code here
        Stack<Integer> hs = new Stack<>();
        int count = 0;
        while (!s.isEmpty()) {
            int top = s.pop();
            count++;
            if (count == sizeOfStack / 2 + 1) {
                continue;
            } else {
                hs.push(top);
            }
        }
        while (!hs.isEmpty()) {
            int top1 = hs.pop();
            s.push(top1);
        }
    }

    public int min(Stack<Integer> s) {
        // add code here.
        int min = Integer.MAX_VALUE;
        while (!s.isEmpty()) {
            int top = s.pop();
            if (min > top) {
                min = top;
            }
        }
        return min;
    }

    public Stack<Integer> insertAtBottom(Stack<Integer> St, int X) {
        Stack<Integer> s = new Stack<>();
        while (!St.isEmpty()) {
            s.push(St.pop());
        }
        St.push(X);
        while (!s.isEmpty()) {
            St.push(s.pop());
        }
        return St;
    }

    public static Stack<Integer> _push(ArrayList<Integer> arr, int n) {
        // Your code here
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < arr.size(); i++) {
            s.push(arr.get(i));
        }
        return s;
    }

    public static void _pop(Stack<Integer> s) {
        // Your code here
        if (s.size() == 0) {
            return;
        }
        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
    }

    public static void main(String[] args) {

    }
}
