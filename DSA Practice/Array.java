import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class Array {

    public static int sumElement(int arr[], int n) {
        // Your code here
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public int sum(int arr[], int n) {
        // code here
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    void printArray(int arr[], int n) {
        // code here
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    void swapKth(int arr[], int n, int k) {
        // code here
        int temp = arr[k - 1];
        arr[k - 1] = arr[n - k];
        arr[n - k] = temp;
    }

    public static void print(int arr[], int n) {
        // your code here
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i += 2;
        }
    }

    public long getSum(long a[], long n) {
        // Your code goes here
        long sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        return sum;
    }

    int binarysearch(int arr[], int n, int k) {
        // code here
        int start = 0, end = n - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == k) {
                return mid;
            } else if (arr[mid] < k) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static boolean isPowerofTwo(long n) {

        // Your code here
        long n1 = (n - 1);
        return n > 0 && (n & n1) == 0;

    }

    public int largest(int arr[], int n) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public int search(int arr[], int n, int k) {

        // code here
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                return i + 1;
            }
        }
        return -1;
    }

    int count(int[] arr, int n, int x) {
        // code here
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == x) {
                count++;
            }

        }
        return count;
    }

    public void printNos(int N) {
        // Print Number from 1 to N without loop
        if (N == 0) {
            return;
        }
        printNos(N - 1);
        System.out.print(N + " ");

    }

    public static Long product(Long arr[], Long mod, int n) {
        // Your task is to return the product of array elements under a given modulo.
        long product = 1;
        for (int i = 0; i < arr.length; i++) {
            product = (product * arr[i]) % mod;
        }
        return product;
    }

    public long long int factorial(int N){
        //code here
        
        if(N==0 || N==1) {
            return 1;
        } else{
            long long int N1 = factorial(N-1);
            long long int N2 = N*N1;
            return N2;
        }
        
    }

    public static int product(int arr[], int n) {
        int pro = 1;
        for (int i = 0; i < arr.length; i++) {
            pro = pro * arr[i];
        }
        return pro;
    }

    // Print N to 1 number without loop
    void printNoss(int N) {
        // code here
        if (N == 0) {
            return;
        } else {
            System.out.print(N + " ");
        }
        printNos(N - 1);

    }

    public boolean IsPerfect(int a[], int n) {
        // Complete the function
        for (int i = 0; i < n / 2; i++) {
            int last = n - 1 - i;
            if (a[i] != a[last]) {
                return false;
            }
        }
        return true;
    }

    float[] streamAvg(int[] arr, int n) {
        // code here
        int sum = 0;
        float[] avge = new float[n];
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            avge[i] = (float) sum / (i + 1);
        }
        return avge;
    }

    static int mean(int N, int[] A) {
        // code here
        int sum = 0;
        int mean = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            mean = sum / A.length;
        }
        return mean;
    }

    int countZeroes(int[] arr, int n) {
        // code here
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }
        return count;
    }

    int transitionPoint(int arr[], int n) {
        // code here
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                return i;
            }
        }
        return -1;
    }

    public void countOddEven(int[] arr, int n) {
        // Code here
        int count = 0;
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            } else {
                oddCount++;
            }
        }
        System.out.print(oddCount + " " + count);
        System.out.println();
    }

    static void countOddEven2(int a[], int n) {

        // Your code here
        int count = 0;
        int oddCount = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                count++;
            } else {
                oddCount++;
            }
        }
        System.out.print(oddCount + " " + count);
    }

    static int searchInSorted(int arr[], int N, int K) {

        // Your code here
        for (int i = 0; i < N; i++) {
            if (arr[i] == K) {
                return 1;
            }
        }
        return -1;
    }

    public int find_median(int[] v) {
        // Code here
        int start = 0;
        int last = v.length;
        int mid = 0;
        Arrays.sort(v);
        mid = (start + last) / 2;
        if (v.length % 2 == 0) {
            return (v[mid - 1] + v[mid]) / 2;
        }
        return v[mid];
    }

    public int[] find_sum(int n) {
        // Code here
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }
        int sum[] = new int[2];
        sum[0] = oddSum;
        sum[1] = evenSum;
        return sum;
    }

    public long countOfElements(long arr[], long n, long x) {
        long count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= x) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    public static boolean check(long A[], long B[], int N) {
        // Your code here
        Arrays.sort(A);
        Arrays.sort(B);
        for (int i = 0; i < N; i++) {
            if (A[i] != B[i]) {
                return false;
            }

        }
        return true;
    }

    int[] getMoreAndLess(int[] arr, int n, int x) {
        // code here
        int a[] = new int[n];
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= x) {
                count1++;
            }
            if (arr[i] >= x) {
                count2++;
            }
        }
        a[0] = count1;
        a[1] = count2;
        return a;

    }

    int thirdLargest(int a[], int n) {
        // Your code here

        Arrays.sort(a);
        int result = 0;
        return a[n - 3];
    }

    int Maximize(int arr[], int n) {
        // Complete the function
        Arrays.sort(arr);
        long sum = 0;
        long mod = 1000000007;
        for (int i = 0; i < n; i++) {
            sum = (sum + (long) arr[i] * i) % mod;
        }
        return (int) sum;
    }

    int maxProduct(int arr[], int n) {
        // code here
        Arrays.sort(arr);
        int prod = 1;
        prod = arr[n - 1] * arr[n - 2];
        return prod;
    }

    void immediateSmaller(int arr[], int n) {
        // code here
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                arr[i] = arr[i + 1];
            } else {
                arr[i] = -1;
            }
        }

        arr[n - 1] = -1;
    }

    // Function for finding maximum and value pair
    public static int[] game_with_number(int arr[], int n) {
        // Complete the function
        int a[] = new int[n];
        for (int i = 0; i < n - 1; i++) {
            a[i] = arr[i] ^ arr[i + 1];
        }
        a[n - 1] = arr[n - 1];
        return a;
    }

    static Pair getMinMax(long a[], long n) {
        // Write your code here
        Arrays.sort(a);
        a[0] = a[0];
        a[1] = a[(int) n - 1];
        return new Pair(a[0], a[1]);

    }

    public static long[] printFibb(int n) {
        long arr[] = new long[n];
        long n2 = (n - 1);
        long n3 = (n - 2);
        arr[0] = 1;
        if (n > 1) {
            arr[1] = 1;
        }
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr;
    }

    static void binSort(int A[], int N) {
        // add your code here
        Arrays.sort(A);

        /**************
         * No need to print the array
         ************/
    }

    public void rotate(int arr[], int n) {
        int x = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];

        }
        arr[0] = x;
    }

    public static long find_multiplication(int arr[], int brr[], int n, int m) {
        // Complete the Function
        Arrays.sort(arr);
        Arrays.sort(brr);
        long pr = arr[n - 1] * brr[0];
        return pr;
    }

    public long printMinimumProduct(long arr[], long n) {
        Arrays.sort(arr);
        long pr = arr[0] * arr[1];
        return pr;
    }

    int[] sortArr(int[] arr, int n) {
        // code here
        Arrays.sort(arr);
        return arr;
    }

    public static int multiply(int arr[], int n) {
        // Complete the function
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < n / 2; i++) {
            sum1 += arr[i];
        }
        for (int i = n - 1; i >= n / 2; i--) {
            sum2 += arr[i];
        }
        return sum1 * sum2;
    }

    int isDigitSumPalindrome(int N) {
        // code here
        int sum = 0;
        while (N > 0) {
            int last = N % 10;
            sum = sum + last;
            N = N / 10;
        }
        int rev = 0;
        int originalSum = sum;
        while (sum > 0) {
            int last1 = sum % 10;
            rev = (rev * 10) + last1;
            sum = sum / 10;
        }

        if (rev == originalSum) {
            return 1;
        }
        return 0;
    }

    public String is_AutomorphicNumber(int n) {
        // Code here
        int last = n % 10;
        int sq = (int) Math.pow(n, 2);
        int last1 = sq % 10;
        if (last == last1) {
            return "Automorphic";
        }
        return "Not Automorphic";
    }

    public static int[] gamewithnumber(int arr[], int n) {
        // Complete the function
        int a[] = new int[n];
        a[n - 1] = arr[n - 1];
        for (int i = 0; i < n - 1; i++) {
            a[i] = arr[i] | arr[i + 1];

        }
        return a;
    }

    public long leftElement(long arr[], long n) {
        // Your code goes here
        Arrays.sort(arr);
        long n1 = 0;
        if (n % 2 == 0) {
            n1 = arr[(int) (n / 2) - 1];
        } else {
            n1 = arr[(int) n / 2];
        }
        return n1;
    }

    static int[] findIndex(int a[], int N, int key) {
        // code here.
        int start = -1;
        int end = -1;
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            if (a[i] == key) {
                start = i;
            }
        }
        for (int i = N - 1; i >= 0; i--) {
            if (a[i] == key) {
                end = i;
            }
        }
        arr[0] = end;
        arr[1] = start;
        return arr;
    }

    int maxTripletSum(int a[], int n) {
        // Complete the function
        Arrays.sort(a);
        int sum = 0;
        for (int i = n - 1; i >= n - 3; i--) {
            sum += a[i];
        }
        return sum;
    }

    static int dataTypeSize(String str) {
        // code here
        int count = 0;
        if (str.equals("Character")) {
            count = 1;
        } else if (str.equals("Integer")) {
            count = 4;
        } else if (str.equals("Long")) {
            count = 8;
        } else if (str.equals("Float")) {
            count = 4;
        } else if (str.equals("Double")) {
            count = 8;
        }
        return count;
    }

    long maxDays(long arr[], int n) {
        // code here
        Arrays.sort(arr);
        return arr[n - 1];
    }

    public long totalFine(long n, long date, long car[], long fine[]) {
        long evenSum = 0;
        long oddSum = 0;
        for (int i = 0; i < n; i++) {
            if (car[i] % 2 == 0) {
                evenSum += fine[i];
            } else {
                oddSum += fine[i];
            }
        }
        if (date % 2 == 0) {
            return oddSum;
        }
        return evenSum;
    }

    // Important
    public long firstIndex(long arr[], long n) {
        // Your code goes here
        long key = 1;
        long start = 0;
        long end = n - 1;
        long result = -1;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            if (arr[(int) mid] > 0 && arr[(int) mid] == key) {
                result = mid;
                end = mid - 1;
            } else if (arr[(int) mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }

    public static void sort012(int a[], int n) {
        // code here
        Arrays.sort(a);
    }

    int search(int arr[], int n, int x, int k) {
        // Complete the function
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static int findSum(int A[], int N) {
        // code here
        Arrays.sort(A);
        int sum = A[0] + A[N - 1];
        return sum;
    }

    int findMin(int arr[], int n) {
        // complete the function here
        Arrays.sort(arr);
        return arr[0];
    }

    static int minNumber(int arr[], int low, int high) {
        // Your code here
        Arrays.sort(arr);
        return arr[0];
    }

    public static int num(int a[], int n, int k) {
        // Your code here
        int last = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            while (a[i] > 0) {
                last = a[i] % 10;
                if (last == k) {
                    count++;
                }
                a[i] = a[i] / 10;
            }

        }
        return count;
    }

    public static void bubbleSort(int arr[], int n) {
        // code here
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    int[] select(int arr[], int i) {
        // code here such that selectionSort() sorts arr[]
        selectionSort(arr, i);
        return arr;
    }

    void selectionSort(int arr[], int n) {
        // code here
        for (int i = 0; i < n - 1; i++) {
            int minpos = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[minpos] > arr[j]) {
                    minpos = j;
                }
            }
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
    }

    public long minValue(long a[], long b[], long n) {
        // Your code goes here
        Arrays.sort(a);
        Arrays.sort(b);
        long prod = 0;
        for (int i = 0; i < (int) n; i++) {
            prod += a[i] * b[(int) n - 1 - i];
        }
        return prod;
    }

    static void insert(int arr[], int i) {
        // Your code here
        insert(arr, i);
    }

    // Function to sort the array using insertion sort algorithm.
    public void insertionSort(int arr[], int n) {
        // code here
        for (int i = 1; i < n; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }

    boolean arraySortedOrNot(int[] arr, int n) {
        // code here
        boolean res = true;
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                res = false;
            }
        }
        return res;
    }

    int print2largest(int arr[], int n) {
        // code here
        Arrays.sort(arr);
        int res = -1;
        for (int i = n - 1; i >= 1; i--) {
            if (arr[i - 1] != arr[i]) {
                res = arr[i - 1];
                break;
            }
        }
        return res;
    }

    int findMaximum(int[] arr, int n) {
        // code here
        Arrays.sort(arr);
        int res = arr[n - 1];
        return res;
    }

    public int peakElement(int[] arr, int n) {
        // add code here.
        int res = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                res = i;
            }
        }
        return res;
    }

    int findSum(int arr[], int n) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }
        int sum = 0;
        for (Integer i : set) {
            sum += i;
        }
        return sum;
    }

    long sumOfDistinct(long arr[], int N) {
        HashSet<Long> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(arr[i]);
        }
        int sum = 0;
        for (Long i : set) {
            sum += i;
        }
        return sum;
    }

    public static ArrayList<Integer> countArray(int arr[], int n, int x) {
        // Complete the function
        ArrayList<Integer> res = new ArrayList<>();
        int avg = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            avg = (arr[i] + x) / 2;
            for (int j = 0; j < n; j++) {
                if (arr[j] == avg) {
                    count++;
                }
            }
            res.add(count);
        }
        return res;
    }

    public long[] minAnd2ndMin(long a[], long n) {
        long res[] = new long[(int) n];
        Arrays.sort(a);
        res[0] = -1;
        for (int i = 1; i < (int) n; i++) {
            if (a[i] != a[i - 1]) {
                res[1] = a[i];
                res[0] = a[0];
                break;
            }
        }
        return res;
    }

    public long findMissing(long a[], long b[], int n) {
        Arrays.sort(a);
        Arrays.sort(b);
        long res = 0;
        int minLen = Math.min(a.length, b.length);
        for (int i = 0; i < minLen; i++) {
            if (a[i] != b[i]) {
                res = a[i];
            }
        }
        return res;
    }

    long minValueToBalance(long a[], int n) {
        long sum = 0;
        long sum2 = 0;
        long res = 0;
        for (int i = 0; i < n / 2; i++) {
            sum += a[i];
        }
        for (int i = n / 2; i < n; i++) {
            sum2 += a[i];
        }
        if (sum > sum2) {
            res = (sum - sum2);
        } else {
            res = (sum2 - sum);
        }
        return res;
    }

    static long trappingWater(int arr[], int n) {
        // Your code here
        int leftMax[] = new int[n];
        leftMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(arr[i], leftMax[i - 1]);
        }

        int rightMax[] = new int[n];
        rightMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(arr[i], rightMax[i + 1]);
        }

        long trappedWater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - arr[i];
        }
        return trappedWater;
    }

    static int isFactorial(int N) {
        // code here
        int res = 0;
        int fact = 1;
        for (int i = 1; i <= N; i++) {
            fact = fact * i;
            if (fact == N) {
                res = 1;
                break;
            }
        }
        return res;
    }

    public long[] findElements(long a[], long n) {
        // Your code goes here
        Arrays.sort(a);
        long res[] = new long[(int) n - 2];
        for (int i = 0; i < n - 2; i++) {
            res[i] = a[i];
        }
        return res;
    }

    ArrayList<Integer> EvenOddSum(int N, int Arr[]) {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i < Arr.length; i++) {
            if (i % 2 == 0) {
                evenSum += Arr[i];
            } else {
                oddSum += Arr[i];
            }
        }
        arr.add(evenSum);
        arr.add(oddSum);
        return arr;
    }

    static ArrayList<Integer> getSum(int N) {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i <= N; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }
        arr.add(evenSum);
        arr.add(oddSum);
        return arr;
    }

    int missingNumber(int array[], int n) {
        // Your Code Here
        int sum = 0;
        int reqSum = (n * (n + 1)) / 2;
        for (int i = 0; i < n - 1; i++) {
            sum += array[i];
        }
        return reqSum - sum;
    }

    Boolean check(String s) {
        // your code here
        for (int i = 1; i < s.length(); i++) {
            char ch = s.charAt(i);
            char ch2 = s.charAt(i - 1);
            if (ch != ch2) {
                return false;
            }
        }
        return true;
    }

    int countCamelCase(String s) {
        // your code here
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                count++;
            }
        }
        return count;
    }

    public static int missingNumber(int A[], int N) {
        // Your code goes here
        int sum1 = (N * (N + 1)) / 2;
        int sum2 = 0;
        for (int i = 0; i < A.length; i++) {
            sum2 += A[i];
        }
        int res = sum1 - sum2;
        return res;
    }

    public boolean possible(long arr[], long n) {
        long sum = (n * (n + 1)) / 2;
        long sum1 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum1 += arr[i];
        }
        return sum == sum1;
    }

    static String winner(int x, int m, int n, long arr[]) {
        // code here
        String res = "";
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % m == 0) {
                count1++;
            } else if (arr[i] % n == 0) {
                count2++;
            }
        }
        if (count1 > count2) {
            res = "Ram";
        } else if (count1 == count2) {
            res = "Both";
        } else {
            res = "Rohan";
        }
        return res;
    }

    int getOddOccurrence(int[] arr, int n) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for (Integer key : map.keySet()) {
            if (map.get(key) % 2 != 0) {
                res = key;
            }
        }
        return res;
    }

    public static void frequencyCount(int arr[], int N, int P) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        Arrays.fill(arr, 0);
        for (Integer key : map.keySet()) {
            if (key < arr.length + 1) {
                arr[key - 1] = map.get(key);
            }

        }
    }

    public int findUnique(int a[], int n, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (int i = 0; i < a.length; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }
        for (Integer key : map.keySet()) {
            if (map.get(key) % k != 0) {
                res = key;
            }
        }
        return res;
    }

    public long findDiff(long arr[], long n) {
        HashMap<Long, Long> map = new HashMap<>();
        long res = 0;
        for (long i = 0; i < arr.length; i++) {
            map.put(arr[(int) i], map.getOrDefault(arr[(int) i], 0L) + 1);
        }
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
        for (Long key : map.keySet()) {
            max = (long) Math.max(max, map.get(key));
            min = (long) Math.min(min, map.get(key));
        }
        res = max - min;
        return res;
    }

    long minDiff(long a[], int N, int K) {
        Arrays.sort(a);
        long minDiff = Long.MAX_VALUE;
        for (int i = 0; i <= N - K; i++) {
            minDiff = (long) Math.min(minDiff, a[i + K - 1] - a[i]);
        }
        return minDiff;
    }

    public int minimum_difference(int[] nums) {
        // code here
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < nums.length; i++) {
            min = (int) Math.min(min, nums[i] - nums[i - 1]);
        }
        return min;
    }

    public static long minSum(int arr[], int n) {
        // Complete the function
        long sum = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] <= arr[i - 1]) {
                arr[i] = arr[i - 1] + 1;
            }
        }
        for (int i = 0; i < n; i++) {
            sum += (long) arr[i];
        }
        return sum;
    }

    public static int firstRepeated(int[] arr, int n) {
        // Your code here
        int res = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for (int i = 0; i < n; i++) {
            if (map.get(arr[i]) > 1) {
                res = i + 1;
                break;
            }
        }
        return res;
    }

    public int firstNonRepeating(int arr[], int n) {
        // Complete the function
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for (int i = 0; i < n; i++) {
            if (map.get(arr[i]) == 1) {
                res = arr[i];
                break;
            }
        }
        return res;
    }

    public static void convertToWave(int n, int[] a) {
        // code here
        for (int i = 0; i < n - 1; i += 2) {
            int temp = a[i];
            a[i] = a[i + 1];
            a[i + 1] = temp;
        }
    }

    public void threeWayPartition(int array[], int a, int b) {
        // code here
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= a) {
                array[i] = array[i];
            } else if (array[i] < a && array[i] > b) {
                array[i] = array[i];
            } else {
                array[i] = array[i];
            }
        }
    }

    public static int search(int A[], int N) {
        // your code here
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
        }

        for (Integer key : map.keySet()) {
            if (map.get(key) == 1) {
                res = key;
            }
        }
        return res;
    }

    static int majorityElement(int a[], int size) {
        // your code here
        int res = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }

        for (Integer key : map.keySet()) {
            if (map.get(key) > size / 2) {
                res = key;
            }
        }
        return res;
    }

    public static int kthSmallest(int[] arr, int l, int r, int k) {
        // Your code here
        Arrays.sort(arr);
        return arr[k - 1];
    }

    public void scores(long a[], long b[]) {
        // store the answer as
        // GFG.ca=3;
        // GFG.cb=5;
        // Your code goes here
        long A = 0;
        long B = 0;
        for (int i = 0; i < b.length; i++) {
            if (a[i] > b[i]) {
                A++;
            } else if (a[i] < b[i]) {
                B++;
            } else {
                continue;
            }
            GFG.ca = A;
            GFG.cb = B;
        }
    }

    int remove_duplicate(int A[], int N) {
        // code here
        if (N == 0 || N == 1) {
            return N;
        }
        int idx = 0;
        for (int i = 0; i < N - 1; i++) {
            if (A[i] != A[i + 1]) {
                A[idx] = A[i];
                idx++;
            }
        }
        A[idx++] = A[N - 1];
        return idx;
    }

    public static void Rearrange(int a[], int n, int answer[]) {
        Arrays.sort(a);
        int start = 0;
        int end = n - 1;
        int i = 0;
        while (start <= end) {
            answer[i] = a[start];
            i++;
            if (start != end) {
                answer[i] = a[end];
                i++;
            }
            start++;
            end--;
        }

    }

    public void segregateElements(int arr[], int n) {
        // Your code goes here
        int temp[] = new int[n];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                temp[idx] = arr[i];
                idx++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                temp[idx] = arr[i];
                idx++;
            }
        }
        int j = 0;
        for (int i = 0; i < n; i++) {
            arr[j] = temp[i];
            j++;
        }
    }

    public ArrayList<Integer> firstAndLast(int arr[], int n, int x) {
        // Code here
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                res.add(i);
                break;
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == x) {
                res.add(i);
                break;
            }
        }
        if (res.isEmpty()) {
            res.add(-1);
        }
        return res;
    }

    void reverseSubArray(int arr[], int n, int l, int r) {
        // code here
        int start = l - 1;
        int end = r - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public void transpose(int n, int a[][]) {
        int res[][] = new int[n][n];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                res[j][i] = a[i][j];
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = res[i][j];
            }
        }
    }

    static void rotateby90(int matrix[][], int n) {
        // code here
        int res[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                res[n - i - 1][j] = matrix[j][i];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = res[i][j];
            }
        }
    }

    public int[] mergeHeaps(int[] a, int[] b, int n, int m) {
        // your code here
        int res[] = new int[n + m];
        int i = 0;
        int j = 0;
        int k = 0;
        while ((i != a.length) && (j != b.length)) {
            if (a[i] > b[j]) {
                res[k] = a[i];
                i++;
                k++;
            } else {
                res[k] = b[j];
                j++;
                k++;
            }
        }
        while (i != a.length) {
            res[k] = a[i];
            k++;
            i++;
        }
        while (j != b.length) {
            res[k] = b[j];
            k++;
            j++;
        }
        return res;
    }

    public static int matSearch(int mat[][], int N, int M, int X) {
        // your code here
        int rows = 0;
        int col = mat[0].length - 1;
        while (rows < mat.length && col >= 0) {
            if (mat[rows][col] == X) {
                return 1;
            } else if (X < mat[rows][col]) {
                col--;
            } else {
                rows++;
            }
        }
        return 0;
    }

    int[] count(String s) {
        // your code here
        int res[] = new int[4];
        int low = 0;
        int upp = 0;
        int spe = 0;
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                low++;
            } else if (ch >= 'A' && ch <= 'Z') {
                upp++;
            } else if (ch >= '0' && ch <= '9') {
                num++;
            } else {
                spe++;
            }
        }
        res[0] = upp;
        res[1] = low;
        res[2] = num;
        res[3] = spe;
        return res;
    }

    long floorSqrt(long x) {
        // Your code here
        return (long) Math.sqrt(x);
    }

    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        // Your code here
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> countedSet = new HashSet<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            set.add(a[i]);
        }
        for (int i = 0; i < m; i++) {
            if (set.contains(b[i]) && !countedSet.contains(b[i])) {
                count++;
                countedSet.add(b[i]);
            }
        }
        return count;
    }

    void pushZerosToEnd(int[] arr, int n) {
        // code here
        int pos[] = new int[n];
        int zero[] = new int[n];
        int posInd = 0;
        int zeroInd = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                pos[posInd] = arr[i];
                posInd++;
            } else {
                zero[zeroInd] = arr[i];
                zeroInd++;
            }
        }
        int i = 0;
        int j = 0;
        int k = 0;
        while (posInd != 0) {
            arr[i] = pos[j];
            i++;
            j++;
            posInd--;
        }
        while (zeroInd != 0) {
            arr[i] = zero[k];
            k++;
            i++;
            zeroInd--;
        }
    }

    static int oppositeFaceOfDice(int N) {
        // code here
        return (7 - N);
    }

    static int evenFactors(int N) {
        // code here
        int sum = 0;
        for (int i = 2; i <= N; i += 2) {
            if (N % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public int[] uniqueId(long arr[], long n) {
        long res[] = new long[(int) n];
        LinkedHashSet<Long> lst = new LinkedHashSet<>();
        for (int i = 0; i < (int) n; i++) {
            lst.add(arr[i]);
        }
        int j = 0;
        for (Long key : lst) {
            res[j] = key;
            j++;
        }
        int result[] = new int[j];
        for (int i = 0; i < j; i++) {
            result[i] = (int) res[i];
        }
        return result;
    }

    public static int check(int arr[], int[] brr, int n) {
        // Complete the function
        int res = 1;
        Arrays.sort(arr);
        Arrays.sort(brr);
        for (int i = 0; i < n; i++) {
            if (arr[i] != brr[i]) {
                res = 0;
                break;
            }
        }
        return res;
    }

    // Important Question
    public int gcd(int A, int B) {
        // code here
        while ((A > 0) && (B > 0)) {
            if (A > B) {
                A = A % B;
            } else {
                B = B % A;
            }
        }
        if (A == 0) {
            return B;
        }
        return A;
    }

    void rearrange(int arr[], int n) {
        // code here
        int pos[] = new int[n];
        int neg[] = new int[n];
        int posInd = 0;
        int negInd = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                pos[posInd] = arr[i];
                posInd++;
            } else {
                neg[negInd] = arr[i];
                negInd++;
            }
        }
        int j = 0;
        int k = 0;
        int l = 0;
        while (j < posInd || k < negInd) {
            if (j < posInd) {
                arr[l] = pos[j];
                j++;
                l++;
            }

            if (k < negInd) {
                arr[l] = neg[k];
                k++;
                l++;
            }

        }
    }

    static long fact(long n1) {
        long fact = 1;
        for (long i = 1; i <= n1; i++) {
            fact *= i;
        }
        return fact;
    }

    static long nPr(long n, long r) {
        // code here
        long res = fact(n);
        long res1 = fact(n - r);
        return res / res1;
    }

    int isPerfect(int N) {
        // code here
        int last = 0;
        int sum = 0;
        int num = N;
        while (num > 0) {
            last = num % 10;
            sum += fact(last);
            num /= 10;
        }
        if (sum == N) {
            return 1;
        }
        return 0;
    }

    public void Rearrange(int a[], int n) {
        // Your code goes here
        int pos[] = new int[n];
        int neg[] = new int[n];
        int posInd = 0;
        int negInd = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] >= 0) {
                pos[posInd] = a[i];
                posInd++;
            } else {
                neg[negInd] = a[i];
                negInd++;
            }
        }
        int j = 0;
        int k = 0;
        int l = 0;
        while (j < negInd) {
            a[l] = neg[j];
            j++;
            l++;
        }
        while (k < posInd) {
            a[l] = pos[k];
            l++;
            k++;
        }
    }

    void leftRotate(int[] arr, int n, int d) {
        // code here
        int temp[] = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        int j = 0;
        for (int i = d; i < n; i++) {
            arr[j] = arr[i];
            j++;
        }
        int k = 0;
        for (int i = n - d; i < n; i++) {
            arr[i] = temp[k];
            k++;
        }
    }

    public String MaxNumber(long arr[], long n) {
        // code here.
        Arrays.sort(arr);
        StringBuilder str = new StringBuilder();
        for (int i = (int) n - 1; i >= 0; i--) {
            str.append(arr[i]);
        }
        return str.toString();
    }

    public void Addition(int[][] matrixA, int[][] matrixB) {
        // code here
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[0].length; j++) {
                matrixA[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
    }

    public static int[] moveZeros(int n, int[] a) {
        // Write your code here.
        int j = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                j = i;
                break;
            }
        }
        if (j == -1) {
            return a;
        }
        for (int i = j + 1; i < n; i++) {
            if (a[i] != 0) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }
        }
        return a;
    }

    long maxSubarraySum(int arr[], int n) {

        // Your code here
        long maxSum = Long.MIN_VALUE;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (sum > maxSum) {
                maxSum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }

    static int smallestSumSubarray(int a[], int size) {
        // your code here
        int minSum = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += a[i];

            if (sum < minSum) {
                minSum = sum;
            }
            if (sum > 0) {
                sum = 0;
            }
        }
        return minSum;
    }

    static int isPossible(int N, int arr[]) {
        // code here
        int sum = 0;
        int last = 0;
        for (int i = 0; i < N; i++) {
            int ele = arr[i];
            while (ele > 0) {
                last = ele % 10;
                sum += last;
                ele /= 10;
            }
        }
        if (sum % 3 == 0) {
            return 1;
        }
        return 0;
    }

    int findDuplicate(int arr[], int N, int K) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            if (map.get(arr[i]) == K) {
                min = (int) Math.min(min, arr[i]);
            }
        }
        return min;
    }

    public static int longestSuccessiveElements(int[] a) {
        // Write your code here.
        int longest = 1;
        if (a.length == 0) {
            return 0;
        }

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        for (int key : set) {
            if (!set.contains(key - 1)) {
                int count = 1;
                int x = key;
                while (set.contains(key + 1)) {
                    count++;
                    key++;
                }
                longest = (int) Math.max(longest, count);
            }
        }
        return longest;
    }

    static ArrayList<Integer> leaders(int arr[], int n) {
        // Your code here
        ArrayList<Integer> res = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = n - 1; i >= 0; i--) {

            if (arr[i] >= max) {
                max = arr[i];
                res.add(max);
            }
        }
        Collections.reverse(res);
        return res;
    }

    public static List<Integer> superiorElements(int[] a) {
        // Write your code here.
        List<Integer> res = new ArrayList<>();
        int max = a[a.length - 1];
        res.add(a[a.length - 1]);

        for (int i = a.length - 2; i >= 0; i--) {
            if (a[i] > max) {
                max = a[i];
                res.add(max);
            }
        }
        return res;
    }

    public int[] twoSum(int[] numbers, int target) {
        int res[] = new int[2];
        int start = 0;
        int end = numbers.length - 1;
        Arrays.fill(res, -1);
        while (start < end) {
            if ((numbers[start] + numbers[end]) == target) {
                res[0] = start + 1;
                res[1] = end + 1;
                return res;
            } else if (numbers[start] + numbers[end] > target) {
                end--;
            } else {
                start++;
            }
        }
        return res;
    }

    public int[] twoSum(int[] nums, int target) {
        int res[] = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int find = target - nums[i];
            if (map.containsKey(find)) {
                res[0] = map.get(find);
                res[1] = i;
            }
            map.put(nums[i], i);
        }
        return res;
    }

    public static void rotateMatrix(int[][] mat) {
        // Write your code here.
        int res[][] = new int[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                res[i][mat[0].length - j - 1] = mat[j][i];
            }
        }
        for (int i = mat.length - 1; i >= 0; i--) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = res[i][j];
            }
        }
    }

    int columnWithMaxZeros(int arr[][], int N) {
        // code here
        int max = 0;
        int res = -1;
        for (int i = 0; i < N; i++) {
            int count = 0;
            for (int j = 0; j < N; j++) {
                if (arr[j][i] == 0) {
                    count++;
                }
                if (max < count) {
                    max = count;
                    res = i;
                }
            }
        }
        return res;
    }

    static void interchange(int a[][], int r, int c) {
        // Your code here
        int row = 0;
        int col = 0;
        int col1 = c - 1;
        while (row < a.length) {
            int temp = a[row][col];
            a[row][col] = a[row][col1];
            a[row][col1] = temp;
            row++;
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int findAllSubarraysWithGivenSum(int arr[], int s) {
        // Write your code here.
        int n = arr.length;
        int preSum = 0;
        int cnt = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < n; i++) {
            preSum += arr[i];
            int remove = preSum - s;
            cnt += map.getOrDefault(remove, 0);
            map.put(preSum, map.getOrDefault(preSum, 0) + 1);
        }
        return cnt;
    }

    static int findFloor(long arr[], int n, long x) {
        int start = 0;
        int end = n - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }

    int maxRepeating2(int[] arr, int n, int k) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        Arrays.sort(arr);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (map.get(arr[i]) > max) {
                max = map.get(arr[i]);
            }
        }
        int min = 0;
        for (int i = 0; i < n; i++) {
            if (map.get(arr[i]) == max) {
                min = arr[i];
                return min;
            }
        }
        return -1;
    }

    public static List<List<Integer>> triplet(int n, int[] arr) {
        // Write your code here.
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    List<Integer> res = Arrays.asList(arr[i], arr[j], arr[k]);
                    ans.add(res);
                    j++;
                    k--;
                    while ((j < k) && (arr[j] == arr[j - 1])) {
                        j++;
                    }
                    while ((j < k) && (arr[k] == arr[k + 1])) {
                        k--;
                    }
                }
            }
        }
        return ans;
    }

    public static int LargButMinFreq(int arr[], int n) {
        // Your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int res = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer key : map.keySet()) {
            if (((min > map.get(key))) || (min == map.get(key) && (res < key))) {
                min = map.get(key);
                res = key;
            }
        }
        return res;
    }

    public static void SortedDuplicates(int arr[], int n) {
        // Your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        Arrays.sort(arr);
        if (map.get(arr[0]) > 1) {
            System.out.print(arr[0] + " ");
        }
        int count = 0;
        for (int i = 1; i < n; i++) {
            if ((map.get(arr[i]) > 1) && arr[i] != arr[i - 1]) {
                System.out.print(arr[i] + " ");
                count++;
            }
        }
        if (count == 0) {
            System.out.print(-1);
        }
    }

    public static int sumExists(int arr[], int n, int sum) {
        // your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int target = sum - arr[i];
            if (map.containsKey(target)) {
                return 1;
            }
            map.put(arr[i], i);
        }
        return 0;
    }
    // 4 sum Problem is great
    public static void main(String[] args) {

    }
}