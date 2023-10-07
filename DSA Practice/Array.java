public class Array {

    public static int sumElement(int arr[], int n) {
        // Your code here
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static void printHelloWorld(){
        // code here
        System.out.print("Hello World");
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
    
    static String compareNM(int n,int m){
        // code here
        String count;
        if(n<m) {
            count = "lesser";
        } else if(n>m) {
            count = "greater";
        } else{
            count = "equal";
        }
        return count;
    }
    
    static String compareFive(int N){
        // code here
        String greater;
        if(N>5) {
            greater = "Greater than 5";
        }
        else if(N<5) {
            greater = "Less than 5";
        } else{
            greater = "Equal to 5";
        }
        return greater;
    }

    
    static String compareNum(int A, int B){
        // code here
        String result;
        if(A>B) {
            result = A+" is greater than "+B;
        } else if(A<B) {
            result = A+" is less than "+B;
        } else {
            result = A+" is equals to "+B;
        }
        return result;
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


    public static void main(String[] args) {
        
    }
}