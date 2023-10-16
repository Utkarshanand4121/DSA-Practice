public class ArrayRevision {

    // Linear Search
    public static int linearSear(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    // Binary Search
    public static int binary(int arr[], int key) {
        int len = arr.length;
        int start = 0;
        int last = len - 1;
        while (start <= last) {
            int mid = (start + last) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        return -1;
    }

    // Reverse as array
    public static void reverse(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {

            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }

    // Pairs in array
    public static void pair(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int first = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + first + "," + arr[j] + ")");
            }
            System.out.println();
        }
    }

    // Largest number
    public static int largest(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(largest(arr));
    }
}
