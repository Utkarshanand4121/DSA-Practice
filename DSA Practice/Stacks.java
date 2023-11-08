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
    
    //Function to push an integer into the stack.
    void push(int a) 
    {
        // Add your code here
        if(top == null) {
            top = new StackNode(a);
            return ;
        } else {
            StackNode newNode = new StackNode(a);
            newNode.next = top;
            top = newNode;
        }
        
    }
    
    //Function to remove an item from top of the stack.
    int pop() 
    {
        // Add your code here
        if(top == null) {
            return -1;
        }
        int top1 = top.data;
        top = top.next;
        return top1;
        
    }
    public static void main(String[] args) {
        
    }
}
