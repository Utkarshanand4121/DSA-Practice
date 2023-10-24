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
    public static void main(String[] args) {

    }
}