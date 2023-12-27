import java.util.HashMap;

public class HashMapRevision {
    public static void majorityElem() {
        HashMap<Integer, Integer> map = new HashMap<>();
        int arr[] = {1,1,1,1,1,2,4,5,5,7,8,9,10};
        int n = arr.length;

        for(int i=0; i<arr.length; i++) {
            if(map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i])+1);
            } else{
                map.put(arr[i], 1);
            }
        }

        for (Integer key : map.keySet()) {
            if(map.get(key) > (n / 3)) {
                System.out.println(key);
            }
        }
    }

    // Anagram
    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        for(int i=0; i<t.length(); i++) {
            char ch = t.charAt(i);
            if(map.get(ch) != null) {
                if(map.get(ch) == 1) {
                    map.remove(ch);
                } else {
                    map.put(ch, map.get(ch) - 1);
                }
            } else {
                return false;
            }
        }
        
        return map.isEmpty();
    }
    public static void main(String[] args) {
        majorityElem();
        // HashMap<String, Integer> maps = new HashMap<>();
        // maps.put("india", 140);
        // maps.put("china", 148);
        // System.out.println(maps.get("india"));
        // System.out.println(maps.get("china"));
        // System.out.println(maps.containsKey("india"));

        String s = "race";
        String t = "acer";
        System.out.println(isAnagram(s, t));
    }
}
