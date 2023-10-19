public class ArrayRevision {

    // Linear Search
    public static int linear(int arr[], int key) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i]==key) {
                return i;
            }
        }
        return -1;
    }

    // Binary Search
    public static int binary(int arr[], int key) {
        int start = 0;
        int end = arr.length-1;
        for(int i=0; i<arr.length; i++) {
            int mid = (start + end)/2;
            if(arr[mid] == key) {
                return mid;
            } else if(arr[mid]>key) {
                end = mid-1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    // Reverse as array
    public static void reverse(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while(start<end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }

    }

    // Pairs in array
    public static void pairs(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
            System.out.println();
        }
    }

    // Largest number
    public static int largest(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(largest<arr[i]) {
                largest = arr[i];
            }
        }
        return largest;
    }
    
    // Subarray
    public static void subArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            int start = i;
            for(int j=i; j<arr.length; j++) {
                int end = j;
                for(int k=start; k<=end; k++) {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    
    // Max Sum of subarray
    public static void maxSum(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            int start = i;
            for(int j=i; j<arr.length; j++) {
                int end = j;
                currSum = 0;
                for(int k=start; k<=end; k++) {
                    currSum += arr[k];
                }
                if(maxSum<currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum is "+maxSum);
    }

    // Prefix method
    public static void prefix(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1; i<arr.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i=0; i<arr.length; i++) {
            int start = i;
            for(int j=i; j<arr.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
            }
            if(maxSum < currSum) {
                maxSum = currSum;
            }
        }
        System.out.println("max sum is: " + maxSum);
    }

    public static void kadens(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0; i<arr.length; i++) {
            currSum += arr[i];
            if(currSum<0) {
                currSum = 0;
            }
        }
        if(maxSum < currSum) {
            maxSum = currSum;
        }
        System.out.println("max sum is: " +maxSum);
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        kadens(arr);
    }
}
