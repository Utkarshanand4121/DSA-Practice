import java.util.HashMap;
import java.util.HashSet;

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

    public static void distinct() {
        HashSet<Integer> set = new HashSet<>();

        int num[] = {4,3,2,5,5,7,6,7,6,8,9,8};

        for(int i=0; i<num.length; i++) {
            set.add(num[i]);
        }

        for (Integer key : set) {
            System.out.print(key+ " ");
        }
    }

    public static void union() {
        HashSet<Integer> set = new HashSet<>();

        int num1[] = {1,2,3,4,5};
        int num2[] = {1,2,6,5};

        for(int i=0; i<num1.length; i++) {
            set.add(num1[i]);
        }
        for(int i=0; i<num2.length; i++) {
            set.add(num2[i]);
        }

        for (Integer key : set) {
            System.out.print(key +" ");
        }
    }

    public static void intersection() {
        HashSet<Integer> set = new HashSet<>();

        int num1[] = {1,2,3,4,5};
        int num2[] = {1,2,6,5};

        for(int i=0; i<num1.length; i++) {
            set.add(num1[i]);
        }

        for(int i=0; i<num2.length; i++) {
            if(set.contains(num2[i])) {
                System.out.print(num2[i] +" ");
            }
        }

    }
    
    public static void main(String[] args) {
        majorityElem();
        // HashMap<String, Integer> maps = new HashMap<>();
        // maps.put("india", 140);
        // maps.put("china", 148);
        // System.out.println(maps.get("india"));
        // System.out.println(maps.get("china"));
        // System.out.println(maps.containsKey("india"));

        // String s = "race";
        // String t = "acer";
        // System.out.println(isAnagram(s, t));

        distinct();
        System.out.println();
        System.out.println("Union of two array ----> ");
        union();
        System.out.println();
        System.out.println("Intersection of two array ----> ");
        intersection();
    }
}
