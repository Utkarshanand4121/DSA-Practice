public class Bit {
    // leetcode -- 136
    public static int singleNumber(int[] nums) {
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int i=0; i<nums.length; i++) {
        //     map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        // }
        // for(Integer i : map.keySet()) {
        //     if(map.get(i) == 1) {
        //         return i;
        //     }
        // }
        // return -1;
        
        // Optimise
        // We can use xor operation as it cancel out itself 
        // (i.e. only when values are  different in binary representation then give output).

        int ans = nums[0];
        for(int i=1; i<nums.length; i++) {
            ans ^= nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
