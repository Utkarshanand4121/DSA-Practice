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
    public static void main(String[] args) {

    }
}
