import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueRevision {
    static class QueueB {
        static int arr[];
        static int size;
        static int rear;

        QueueB(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        public static void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }
            rear += 1;
            arr[rear] = data;
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear = rear - 1;
            return front;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            return arr[0];
        }
    }

    static class CirculQueue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        CirculQueue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        public static void add(int data) {
            if (isFull()) {
                System.out.println("Circular queue is empty");
                return;
            }

            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Cir Queue is empty");
                return -1;
            }

            int res = arr[front];
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return front;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            return arr[front];
        }
    }

    // Queue reversal
    public static void reverse(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();
        while(!q.isEmpty()) {
            s.push(q.remove());
        }
        while(!s.isEmpty()) {
            q.add(s.pop());
        }
    }

    // Interleave 
    public static void interleave(Queue<Integer> q) {
        Queue<Integer> firstLeave = new LinkedList<>();
        int size = q.size();

        for(int i=0; i<size/2; i++) {
            firstLeave.add(q.remove());
        }

        while(!firstLeave.isEmpty()) {
            q.add(firstLeave.remove());
            q.add(q.remove());
        }
    }

    // implementing stack using deque
    static class Stacks {
        Deque<Integer> d = new LinkedList<>();

        public void push(int data) {
            d.addLast(data);
        }

        public int pop() {
            return d.removeLast();
        }

        public int peek() {
            return d.getLast();
        }
    }

    // implementing queue using deque
    static class Queuee {
        Deque<Integer> d = new LinkedList<>();

        public void add(int data) {
            d.addLast(data);
        }

        public int remove() {
            return d.removeFirst();
        }

        public int peek() {
            return d.getFirst();
        } 
    }
    public static void main(String[] args) {
        // CirculQueue q = new CirculQueue(5);
        // q.add(1);
        // q.add(2);
        // q.add(3);

        
        // while (!q.isEmpty()) {
        //     System.out.println(q.peek());
        //     q.remove();
        // }

        // Queue<Integer> q = new LinkedList<>();
        // q.add(1);
        // q.add(2);
        // q.add(3);
        // q.add(4);
        // q.add(5);
        // q.add(6);
        // q.add(7);
        // q.add(8);
        // q.add(9);
        // q.add(10);

        // reverse(q);

        // print q

        // interleave(q);
        // while(!q.isEmpty()) {
        //     System.out.print(q.peek() +" ");
        //     q.remove();
        // }

        // Implementing stack using deque

        // Stacks s = new Stacks();
        // s.push(1);
        // s.push(2);
        // s.push(3);

        // System.out.println(s.peek());
        // System.out.println(s.pop());
        // System.out.println(s.pop());

        // Implementing queue using deque

        Queuee q = new Queuee();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}
