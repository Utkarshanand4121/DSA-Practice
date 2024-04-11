import java.util.*;

public class Array {
    public int maxNumberOfBalloons(String text) {
        String word = "balloon";
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map1 = new HashMap<>();
        for(int i=0; i<word.length(); i++) {
            char ch = word.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for(int i=0; i<text.length(); i++) {
            char ch = text.charAt(i);
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }
        int min = Integer.MAX_VALUE;
        for(int i=0; i<text.length(); i++) {
            char ch = text.charAt(i);
            if(map.containsKey(ch)) {
                int ans = map1.get(ch) / map.get(ch);
                if(min > ans) {
                    min = ans;
                }
                if(map.get(ch) != null) {
                    if(map.get(ch) == 1) {
                        map.remove(ch);
                    } else {
                        map.put(ch, map.get(ch) - 1);
                    }
                }
            }
        }
        if(map.isEmpty()) {
            return min;
        }
        return 0;
    }

    public int[] sortedSquares(int[] nums) {
        // int res[] = new int[nums.length];
        // for(int i=0; i<nums.length; i++) {
        //     res[i] = nums[i] * nums[i];
        // }
        // Arrays.sort(res);
        // return res;
        
        // Optimise
        int n = nums.length;
        int res[] = new int[n];
        int left = 0;
        int right = n - 1;
        int curr = n - 1;
        while(left <= right) {
            int leftData = (int)Math.abs(nums[left]);
            int rightData = (int)Math.abs(nums[right]);
            if(leftData >= rightData) {
                res[curr] = leftData * leftData;
                left++;
            } else {
                res[curr] = rightData * rightData;
                right--;
            }
            curr--;
        }
        return res;
    }

    // Next Greater Element 1 --- LeetCode (496) -- rocking Question
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int nextGreater2[] = new int[nums2.length];
        Stack<Integer> s = new Stack<>();
        for(int i=nums2.length - 1; i>=0; i--) {
            while(!s.isEmpty() && nums2[s.peek()] <= nums2[i]) {
                s.pop();
            } 
            if(s.isEmpty()) {
                nextGreater2[i] = -1;
            } else {
                nextGreater2[i] = nums2[s.peek()];
            }
            s.push(i);
        }
        int ans[] = new int[nums1.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums2.length; i++) {
            map.put(nums2[i], nextGreater2[i]);
        }
        for(int i=0; i<nums1.length; i++) {
            ans[i] = map.containsKey(nums1[i]) ? map.get(nums1[i]) : -1;
        }
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
