import java.util.*;

import org.w3c.dom.Node;

public class ArrayLists {
    static List<Integer> get(int a,int b)
    {
        // Swapping without third variable
        List<Integer> result = new ArrayList<>();
        a = a^b;
        b = a^b;
        a = a^b;
        result.add(a);
        result.add(b);
        return result;
    }
    static ArrayList<Integer> getTable(int N){
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
        int table;
        for(int i=1; i<=10; i++) {
            table = N*i;
            arr.add(table);
        }
        return arr;
    }

    ArrayList<Long> alternateSort(long arr[] ,int N)
    {
        
        // Your code goes here
        Arrays.sort(arr);
        ArrayList<Long> a = new ArrayList<>();
        int start = 0;
        int end = N-1; 
        while(start<=end) {
            a.add(arr[end]);
            a.add(arr[start]);
            end--;
            start++;
        }
        return a;
    }

    static ArrayList<Integer> preorder(Node root)
    {
        // Code here
        ArrayList<Integer> arr = new ArrayList<>();
        if(root == null) {
            return arr; 
        }
        arr.add(root.data);
        arr.addAll(preorder(root.left));
        arr.addAll(preorder(root.right));
        
        return arr;
    }

    ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList<Integer> arr = new ArrayList<>();
        if(root == null) {
            return arr;
        }
        arr.addAll(inOrder(root.left));
        arr.add(root.data);
        arr.addAll(inOrder(root.right));
        return arr;
    }

    ArrayList<Integer> postOrder(Node root)
    {
       // Your code goes here
       ArrayList<Integer> arr = new ArrayList<>();
       if(root == null) {
           return arr;
       }
       arr.addAll(postOrder(root.left));
       arr.addAll(postOrder(root.right));
       arr.add(root.data);
       return arr;
    }

    ArrayList <Integer> acceptedProposals (int arr[], int n)
    {
        // your code here
        ArrayList<Integer> a = new ArrayList<>();
        Arrays.sort(arr);
        a.add(arr[n-2]);
        a.add(arr[1]);
        return a;
    }
    public static void main(String[] args) {
        
    }
}
