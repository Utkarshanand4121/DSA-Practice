import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Queues {
    // reversing a queue
    public Queue<Integer> rev(Queue<Integer> q){
        //add code here.
        Stack<Integer> s = new Stack<>();
        while(!q.isEmpty()) {
            s.push(q.remove());
        }
        while(!s.isEmpty()) {
            q.add(s.pop());
        }
        return q;
    }


    int front, rear;
	int arr[] = new int[100005];

    Queues()
	{
		front=0;
		rear=-1;
	}
	
	//Function to push an element x in a queue.
	void push(int x)
	{
	    // Your code here
	    if(rear == 100004) {
	        return;
	    } else {
	        rear = rear + 1;
	        arr[rear] = x;
	    }
	    
	} 

    //Function to pop an element from queue and return that element.
	int pop()
	{
		// Your code here
		int x = arr[front];
		if(front>rear) {
		    return -1;
		}
		
		front = front + 1;
		return x;
	} 

	public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        // add code here.
        Stack<Integer> s = new Stack<>();
        for(int i=0; i<k; i++) {
            s.push(q.remove());
        }
        Queue<Integer> q1 = new LinkedList<>();
        while(!q.isEmpty()) {
            q1.add(q.remove());
        }
        while(!s.isEmpty()) {
            q.add(s.pop());
        }
        while(!q1.isEmpty()) {
            q.add(q1.remove());
        }
        return q;
    }
    // Queue Using Two Stack
    Stack<Integer> input = new Stack<Integer>(); 
    Stack<Integer> output = new Stack<Integer>(); 
    
    /*The method pop which return the element poped out of the stack*/
    int dequeue()
    {
	    // Your code here
	    if(input.isEmpty()) {
	        return -1;
	    }
	    int top = input.pop();
	    return top;
    }
	
    /* The method push to push element into the stack */
    void enqueue(int x)
    {
	    // Your code here	
	    while(!input.isEmpty()) {
	        output.push((input.pop()));
	    }
	    input.push(x);
	    while(!output.isEmpty()) {
	        input.push(output.pop());
	    }
    }

    // Stack Using Two Queue
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    
    //Function to push an element into stack using two queues.
    void push(int a)
    {
	    // Your code here	
	    while(!q1.isEmpty()) {
	        q2.add(q1.remove());
	    }
	    q1.add(a);
	    while(!q2.isEmpty()) {
	        q1.add(q2.remove());
	    }
    }
    
    //Function to pop an element from stack using two queues. 
    int pop()
    {
	    // Your code here
	    if(q1.isEmpty()) {
	        return -1;
	    }
	    int top = q1.remove();
	    return top;
    }
    public static void main(String[] args) {
        
    }
}
