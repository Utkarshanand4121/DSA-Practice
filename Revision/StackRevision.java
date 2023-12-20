import java.util.ArrayList;
import java.util.Stack;

public class StackRevision {
    static class StackB {
        static ArrayList<Integer> s = new ArrayList<>();

        public static boolean isEmpty() {
            return s.size() == 0;
        }

        public static void push(int data) {
            s.add(data);
        }

        public static int pop() {
            int top = s.get(s.size() - 1);
            s.remove(s.get(s.size() - 1));
            return top;
        }

        public static int peek() {
            return s.get(s.size() - 1);
        }
    }

    // push at bootom
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    // Reverse a string using stack
    public static String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        StringBuilder res = new StringBuilder();
        int idx = 0;
        while (idx != str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }
        while (!s.isEmpty()) {
            char ch = s.pop();
            res.append(ch);
        }
        return res.toString();
    }

    // Reverse a stack
    public static void reverse(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverse(s);
        pushAtBottom(s, top);
    }

    public static void printStack(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    // Next Greater element
    public static void nextGreater() {
        Stack<Integer> s = new Stack<>();
        int arr[] = {6,8,0,1,3};
        int nextGre[] = new int[arr.length];

        for(int i=arr.length-1; i>=0; i--) {
            // 1- while
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            // 2- next Greater element
            if(s.isEmpty()) {
                nextGre[i] = -1;
            } else {
                nextGre[i] = arr[s.peek()];
            }
            // 3- push in s
            s.push(i);
        }
        for(int i=0; i<nextGre.length; i++) {
            System.out.print(nextGre[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Stack<Integer> s = new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // // printStack(s);
        // reverse(s);
        // printStack(s);

        // System.out.println(reverseString("abc"));

        nextGreater();

    }
}