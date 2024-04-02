package ImportantQuestion;
import java.util.*;
public class Frequency {
    // Find the top k elements which have the highest frequency in the array.
    static class Pair{
        int ele;
        int cnt;
        Pair(int ele, int cnt) {
            this.ele = ele;
            this.cnt = cnt;
        }
    }
    public int[] topK(int[] nums, int k) {
        // Code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        LinkedList<Pair> lst = new LinkedList<>();
        for(Integer i : map.keySet()) {
                lst.add(new Pair(i, map.get(i)));
            
        }
        Collections.sort(lst, new Comparator<Pair>() {
            public int compare(Pair a, Pair b) {
                if(a.cnt != b.cnt) {
                    return b.cnt - a.cnt;
                } else {
                    return b.ele - a.ele;
                }
            }
        });
        int arr[] = new int[k];
        int j = 0;
        for(Pair i : lst) {
            arr[j] = i.ele;
            k--;
            if(k == 0) {
                break;
            }
            j++;
        }
        return arr;
    }

    // Sorting Elements of an Array by Frequency
    
    static ArrayList<Integer> sortByFreq(int arr[], int n)
    {
        // add your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        LinkedList<Pair> lst = new LinkedList<>();
        for(Integer i : map.keySet()) {
            lst.add(new Pair(i, map.get(i)));
        }
        Collections.sort(lst, new Comparator<Pair>() {
            public int compare(Pair a, Pair b) {
                if(a.cnt != b.cnt) {
                    return b.cnt - a.cnt;
                } else {
                    return a.ele - b.ele;
                }
                
            }
        });
        ArrayList<Integer> res = new ArrayList<>();
        for(Pair p : lst) {
            int count = p.cnt;
            while(count != 0) {
                res.add(p.ele);
                count--;
            }
        }
        return res;
    }

    // Sort Characters By Frequency
    static class Pair1{
        char ch;
        int count;
        Pair1(char ch, int count) {
            this.ch = ch;
            this.count = count;
        }
    }
    public String frequencySort(String s) {
        int ch[] = new int[125];
        for(char ch1 : s.toCharArray()) {
            ch[ch1]++;
        }
        LinkedList<Pair1> freq = new LinkedList<>();
        for(int i =40; i<ch.length; i++) {
            if(ch[i] > 0) {
                freq.add(new Pair1((char)i, ch[i]));
            }
        }
        Collections.sort(freq, new Comparator<Pair1>() {
            public int compare(Pair1 a, Pair1 b) {
                return b.count - a.count;
            }
        });
        StringBuilder str = new StringBuilder();
        for(Pair1 p : freq) {
            int cnt = p.count;
            while(cnt != 0) {
                str.append(p.ch);
                cnt--;
            }
        }
        return str.toString();
    }
    public static void main(String[] args) {
        
    }
}
