import java.util.*;

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
    public static void main(String[] args) {
        
    }
}
