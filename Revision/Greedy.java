import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import java.util.Comparator;

public class Greedy {
    public static void activity1() {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };

        int maxCount = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        // 1st activity
        maxCount = 1;
        arr.add(0);
        int lastEnd = end[0];

        for (int i = 1; i < end.length; i++) {
            if (start[i] >= lastEnd) {
                maxCount++;
                arr.add(i);
                lastEnd = end[i];
            }
        }
        System.out.println("Max Count = " + maxCount);
        for (int i = 0; i < arr.size(); i++) {
            System.out.print("A" + arr.get(i) + " ");
        }
        System.out.println();
    }

    public static void activity2() {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };

        int activities[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i; // index
            activities[i][1] = start[i]; // start
            activities[i][2] = end[i]; // end
        }
        // sorting
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        ArrayList<Integer> ans = new ArrayList<>();

        // first activity
        int maxCount = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][1];
        for (int i = 1; i < start.length; i++) {
            if (activities[i][1] >= lastEnd) {
                maxCount++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }
        System.out.println("Max Count is : " + maxCount);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();
    }

    public static void greedy3() {
        int val[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        int W = 50;

        double ratio[][] = new double[val.length][2];
        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i] / (double) weight[i];
        }

        // ascending sorting
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = W;
        int finalAns = 0;
        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (capacity >= weight[idx]) {
                finalAns += val[idx];
                capacity -= weight[idx];
            } else {
                finalAns += ratio[i][1] * capacity;
                capacity = 0;
                break;
            }
        }
        System.out.println("final ans = " + finalAns);
    }

    public static void minSumDiff() {
        int A[] = { 1, 2, 3 };
        int B[] = { 2, 1, 3 };

        Arrays.sort(A);
        Arrays.sort(B);

        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += (int) Math.abs(A[i] - B[i]);
        }
        System.out.print("Min Sum absolute diff pairs = " + sum);
    }

    public static void maxLenChain() {
        int pairs[][] = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };

        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int chainLen = 1;
        int chainEnd = pairs[0][1];

        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > chainEnd) {
                chainLen++;
                chainEnd = pairs[i][1];
            }
        }

        System.out.println("Maximum len of chain = " + chainLen);
    }

    public static void indianCoins() {
        Integer coins[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };

        Arrays.sort(coins, Comparator.reverseOrder());

        int countOfCoins = 0;
        int amt = 590;
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= amt) {
                while (coins[i] <= amt) {
                    res.add(coins[i]);
                    amt -= coins[i];
                    countOfCoins++;
                }
            }
        }

        System.out.println("Number of coins = " + countOfCoins);
        System.out.println(res);
    }

    static class Job{
        int id;
        int profit;
        int deadline;
        public Job(int i, int d, int p) {
            id = i;
            deadline = d;
            profit = p;
        }
    }
    public static void jobSeq() {
        int jobsInfo[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };
        
        ArrayList<Job> arr = new ArrayList<>();
        for(int i=0; i<jobsInfo.length; i++) {
            arr.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }

        Collections.sort(arr, (obj1, obj2) -> obj2.profit - obj1.profit);

        ArrayList<Integer> res = new ArrayList<>(); 
        int time = 0;
        for(int i=0; i<arr.size(); i++) {
            Job curr = arr.get(i);
            if(curr.deadline > time) {
                res.add(curr.id);
                time++;
            }
        }

        System.out.println("Max jobs = " + res.size());
        for(int i=0; i<res.size(); i++) {
            System.out.print(res.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        jobSeq();
    }
}
