public class Sorting {

    // Bubble sort
    public static void bubble(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }

    }

    // print arr
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Searching sort
    public static void selection(int arr[]) {
        int minPos = 0;
        int i = 0;
        for (i = 0; i < arr.length - 1; i++) {
            minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            // swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }

    }

    // Counting sort
    public static void countSort(int arr[]) {

        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest+1];
        for(int i=0; i<arr.length; i++) {
            count[arr[i]]++;
        }

        int j = 0;
        for(int i=0; i<count.length; i++) {
            while(count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    } 
    public static void main(String[] args) {
        int arr[] = { 5, 4, 8, 9, 1 };
        countSort(arr);
        printArr(arr);
    }
}
