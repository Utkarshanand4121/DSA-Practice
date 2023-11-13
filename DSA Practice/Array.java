import java.util.Arrays;

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
        for(int i=0; i<arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
    void printArray(int arr[], int n) {
        //   code here
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    void swapKth(int arr[], int n, int k) {
        // code here
        int temp = arr[k-1];
        arr[k-1] = arr[n-k];
        arr[n-k] = temp;
    }

    public static void print(int arr[], int n)
    {
        // your code here
        int i = 0;
        while(i<arr.length) {
            System.out.print(arr[i]+" ");
            i+=2;
        }
    }

    public long getSum(long a[], long n)
    {
        // Your code goes here
        long sum = 0;
        for(int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        return sum;
    }

    int binarysearch(int arr[], int n, int k) {
        // code here
        int start = 0, end = n-1;
        
        while(start<=end) {
            int mid = (start+end)/2;
            if(arr[mid]==k) {
                return mid;
            } else if(arr[mid]<k) {
                start = mid +1;
            } else {
                end = mid-1;
            }
        }
        return -1;
    }
    public static boolean isPowerofTwo(long n){
        
        // Your code here
        long n1 = (n-1);
        return n>0&&(n&n1)==0;
        
    }
    public int largest(int arr[], int n)
    {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(largest<arr[i]) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public int search(int arr[], int n, int k) {

        // code here
        for(int i=0; i<arr.length; i++) {
            if(arr[i]==k) {
                return i+1;
            }
        }
        return -1;
    }
    int count(int[] arr, int n, int x) {
        // code here
        int count =0;
        for(int i=0; i<arr.length; i++) {
            
            if(arr[i]==x){
                count++;
            }
            
        }
        return count;
    }

    public void printNos(int N)
    {
        // Print Number from 1 to N without loop
        if(N==0) {
            return;
        } 
        printNos(N-1);
        System.out.print(N+" ");
        
        
    }

    public static Long product(Long arr[], Long mod, int n)
    {
        // Your task is to return the product of array elements under a given modulo.
        long product = 1;
        for(int i=0; i<arr.length; i++) {
            product = (product*arr[i])%mod;
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
    
    public static int product(int arr[],int n)
    {
        int pro = 1;
        for(int i=0 ;i<arr.length; i++) {
            pro = pro * arr[i];
        }
        return pro;
    }

    // Print N to 1 number without loop
    void printNoss(int N) {
        // code here
        if(N==0) {
            return;
        } else{
            System.out.print(N+" ");
        }
        printNos(N-1);
        
    }
    public boolean IsPerfect(int a[], int n)
    {
        // Complete the function
        for(int i=0; i<n/2; i++) {
            int last = n-1-i;
            if(a[i]!=a[last]) {
                return false;
            }
        } 
        return true;
    }

    float[] streamAvg(int[] arr, int n) {
        // code here
        int sum = 0;
        float[] avge = new float[n];
        for(int i=0; i<arr.length; i++) {
            sum = sum + arr[i];
            avge[i] = (float) sum / (i+1);
        }
        return avge;
    }

    static int mean(int N , int[] A) {
        // code here
        int sum = 0;
        int mean = 0;
        for(int i=0; i<A.length; i++) {
            sum += A[i];
            mean = sum/A.length;
        }
        return mean;
    }
    
    int countZeroes(int[] arr, int n) {
        // code here
        int count = 0;
        for(int i=0; i<n; i++) {
            if(arr[i] == 0) {
                count++;
            }
        }
        return count;
    }

    int transitionPoint(int arr[], int n) {
        // code here
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 1) {
                return i;
            }
        }
        return -1;
    }

    public void countOddEven(int[] arr, int n)
    {
        // Code here
        int count = 0;
        int oddCount = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] % 2==0) {
                count++;
            } else {
                oddCount++;
            }
        }
        System.out.print(oddCount+" "+count);
        System.out.println();
    }

    static void countOddEven2(int a[], int n) {

        // Your code here
        int count = 0;
        int oddCount = 0;
        for(int i=0; i<n; i++) {
            if(a[i] % 2==0) {
                count++;
            } else {
                oddCount++;
            }
        }
        System.out.print(oddCount+" "+count);
    }

    static int searchInSorted(int arr[], int N, int K)
    {
        
        // Your code here
        for(int i=0; i<N; i++) {
            if(arr[i] == K) {
                return 1;
            }
        }
        return -1;
    }

    public int find_median(int[] v)
    {
        // Code here
        int start = 0;
        int last = v.length;
        int mid = 0;
        Arrays.sort(v);
        mid = (start+last)/2;
        if(v.length%2==0) {
            return (v[mid-1] + v[mid]) / 2;
        }
        return v[mid];
    }

    public int[] find_sum(int n)
    {
        // Code here
        int oddSum = 0;
        int evenSum = 0;
        for(int i=1; i<=n; i++) {
            if(i%2==0) {
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

    public long countOfElements(long arr[], long n, long x)
    {
        long count = 0;
        for(int i=0; i<n; i++) {
            if(arr[i]<=x) {
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }

    public static boolean check(long A[],long B[],int N)
    {
        //Your code here
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i=0; i<N; i++) {
            if(A[i]!=B[i]) {
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
        for(int i=0; i<n; i++) {
            if(arr[i] <= x) {
                count1++;
            }
            if(arr[i] >= x) {
                count2++;
            }
        }
        a[0] = count1;
        a[1] = count2;
        return a;
        
    }

    int thirdLargest(int a[], int n)
    {
	    // Your code here
        
	    Arrays.sort(a);
	    int result = 0;
	    return a[n-3];
    }

    int Maximize(int arr[], int n)
    {
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
        prod = arr[n-1] * arr[n-2];
        return prod;
    }

    void immediateSmaller(int arr[], int n) {
        // code here
        for(int i=0; i<n-1; i++) {
            if(arr[i]>arr[i+1]) {
                arr[i] = arr[i+1];
            } else {
                arr[i] = -1;
            }
        }
        
        arr[n-1] = -1;
    }

    // Function for finding maximum and value pair
    public static int[] game_with_number (int arr[], int n) {
        // Complete the function
        int a[] = new int[n];
        for(int i=0; i<n-1; i++) {
            a[i] = arr[i] ^ arr[i+1];
        }
        a[n-1] = arr[n-1];
        return a;
    }

    static Pair getMinMax(long a[], long n)  
    {
        //Write your code here
        Arrays.sort(a);
        a[0] = a[0];
        a[1] = a[(int)n-1];
        return new Pair(a[0], a[1]);
        
    }

    public static long[] printFibb(int n) 
    { 
        long arr[] = new long[n];
        long n2 = (n-1);
        long n3 = (n-2);
        arr[0] = 1;
        if(n>1) {
            arr[1] = 1;
        }
        for(int i=2; i<n; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr;
    }

    static void binSort(int A[], int N)
    {
        // add your code here
        Arrays.sort(A);
        
        
        /**************
        * No need to print the array
        * ************/
    }

    public void rotate(int arr[], int n)
    {
        int x = arr[n-1];
        for(int i=n-1; i>0; i--) {
            arr[i] = arr[i-1];
            
        }
        arr[0] = x;
    }

    public static long find_multiplication (int arr[], int brr[], int n, int m) {
        // Complete the Function
        Arrays.sort(arr);
        Arrays.sort(brr);
        long pr = arr[n-1] * brr[0];
        return pr;
    }

    public long printMinimumProduct(long arr[], long n)
    {
        Arrays.sort(arr);
        long pr = arr[0] * arr[1];
        return pr;
    }

    int[] sortArr(int[] arr, int n) 
    { 
        // code here
        Arrays.sort(arr);
        return arr;
    }

    public static int multiply (int arr[], int n) {
        //Complete the function
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0; i<n/2; i++) {
            sum1 += arr[i]; 
        }
        for(int i=n-1; i>=n/2; i--) {
            sum2 += arr[i];
        }
        return sum1*sum2;
    }

    int isDigitSumPalindrome(int N) {
        // code here
        int sum = 0;
        while(N>0) {
            int last = N%10;
            sum = sum + last;
            N = N / 10;
        }
        int rev = 0;
        int originalSum = sum;
        while(sum>0) {
            int last1 = sum%10;
            rev = (rev*10) + last1;
            sum = sum / 10;
        }
        
        if(rev == originalSum) {
            return 1;
        }
        return 0;
    }

    public String is_AutomorphicNumber(int n)
    {
        // Code here
        int last = n%10;
        int sq = (int)Math.pow(n,2);
        int last1 = sq%10;
        if(last == last1) {
            return "Automorphic";
        }
        return "Not Automorphic";
    }

    public static int[] gamewithnumber(int arr[], int n) {
        // Complete the function
        int a[] = new int[n];
        a[n-1] = arr[n-1];
        for(int i=0; i<n-1; i++) {
            a[i] = arr[i] | arr[i+1];
            
        }
        return a;
    }

    public long leftElement(long arr[], long n)
    {
        // Your code goes here  
        Arrays.sort(arr);
        long n1 = 0;
        if(n%2==0) {
            n1 = arr[(int)(n/2)-1];
        } else {
            n1 = arr[(int) n/2];
        }
        return n1;
    }

    static int[] findIndex(int a[], int N, int key) 
    { 
        //code here.
        int start = -1;
        int end = -1;
        int arr[] = new int[N];
        for(int i=0; i<N; i++) {
            if(a[i] == key) {
                start = i;
            }
        }
        for(int i=N-1; i>=0; i--) {
            if(a[i] == key) {
                end = i;
            }
        }
        arr[0] = end;
        arr[1] = start;
        return arr;
    }
    public static void main(String[] args) {

    }
}