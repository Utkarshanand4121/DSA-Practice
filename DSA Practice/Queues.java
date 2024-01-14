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
    public static void main(String[] args) {
        
    }
}
