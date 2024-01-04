import java.util.HashMap;

public class Jan4 {
    static int singleElement(int[] arr , int N) {
        // code here
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<N; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for(Integer key : map.keySet()) {
            if(map.get(key) == 1) {
                res = key;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        
    }
}
