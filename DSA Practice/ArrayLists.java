import java.util.*;

import org.w3c.dom.Node;

public class ArrayLists {
    static List<Integer> get(int a, int b) {
        // Swapping without third variable
        List<Integer> result = new ArrayList<>();
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        result.add(a);
        result.add(b);
        return result;
    }

    static ArrayList<Integer> getTable(int N) {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
        int table;
        for (int i = 1; i <= 10; i++) {
            table = N * i;
            arr.add(table);
        }
        return arr;
    }

    ArrayList<Long> alternateSort(long arr[], int N) {

        // Your code goes here
        Arrays.sort(arr);
        ArrayList<Long> a = new ArrayList<>();
        int start = 0;
        int end = N - 1;
        while (start <= end) {
            a.add(arr[end]);
            a.add(arr[start]);
            end--;
            start++;
        }
        return a;
    }

    static ArrayList<Integer> preorder(Node root) {
        // Code here
        ArrayList<Integer> arr = new ArrayList<>();
        if (root == null) {
            return arr;
        }
        arr.add(root.data);
        arr.addAll(preorder(root.left));
        arr.addAll(preorder(root.right));

        return arr;
    }

    ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList<Integer> arr = new ArrayList<>();
        if (root == null) {
            return arr;
        }
        arr.addAll(inOrder(root.left));
        arr.add(root.data);
        arr.addAll(inOrder(root.right));
        return arr;
    }

    ArrayList<Integer> postOrder(Node root) {
        // Your code goes here
        ArrayList<Integer> arr = new ArrayList<>();
        if (root == null) {
            return arr;
        }
        arr.addAll(postOrder(root.left));
        arr.addAll(postOrder(root.right));
        arr.add(root.data);
        return arr;
    }

    ArrayList<Integer> acceptedProposals(int arr[], int n) {
        // your code here
        ArrayList<Integer> a = new ArrayList<>();
        Arrays.sort(arr);
        a.add(arr[n - 2]);
        a.add(arr[1]);
        return a;
    }

    public static ArrayList<Integer> array(int a[][], int b[], int n) {
        // Complete the function
        ArrayList<Integer> arr = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sum += a[i][j];
                }
            }
        }
        Arrays.sort(b);
        arr.add(sum);
        arr.add(b[n - 1]);
        return arr;
    }

    public static ArrayList<Integer> dupLastIndex(int arr[], int n) {
        // Complete the function
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = n - 1; i > 0; i--) {
            if (arr[i] == arr[i - 1]) {
                res.add(i);
                res.add(arr[i]);
                break;
            }
        }
        if (res.isEmpty()) {
            res.add(-1);
        }
        return res;
    }

    ArrayList<Long> findMissing(long A[], long B[], int N, int M) {
        ArrayList<Long> res = new ArrayList<>();
        HashMap<Long, Long> map = new HashMap<>();
        for (int i = 0; i < M; i++) {
            map.put(B[i], map.getOrDefault(B[i], 0L) + 1);
        }

        for (int i = 0; i < N; i++) {
            if (!map.containsKey(A[i])) {
                res.add(A[i]);
            }
        }
        return res;
    }

    public static ArrayList<Integer> kLargest(int arr[], int n, int k) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = n - 1; i > n - k - 1; i--) {
            res.add(arr[i]);
        }
        return res;
    }

    ArrayList<Long> arranged(long a[], int n) {
        long[] posArr = new long[(int) n / 2];
        long[] negArr = new long[(int) n / 2];
        int poIdx = 0;
        int neIdx = 0;
        for (int i = 0; i < n; i++) {
            if ((int) a[i] > 0) {
                posArr[poIdx] = a[i];
                poIdx++;
            } else {
                negArr[neIdx] = a[i];
                neIdx++;
            }
        }
        ArrayList<Long> res = new ArrayList<Long>();
        for (int i = 0; i < n / 2; i++) {
            res.add(posArr[i]);
            res.add(negArr[i]);
        }
        return res;
    }

    ArrayList<Integer> countChars(String s) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                count++;
            } else if (ch == ' ') {
                res.add(count);
                count = 0;
            }
        }
        int count2 = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                count2++;
            } else if (ch == ' ') {
                res.add(count2);
                break;
            }
        }
        if (res.isEmpty()) {
            res.add(s.length());
        }
        return res;
    }

    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set1 = new HashSet<>();
        for (int i = 0; i < n1; i++) {
            set.add(A[i]);
        }
        for (int i = 0; i < n2; i++) {
            if (set.contains(B[i])) {
                set1.add(B[i]);
            }
        }
        for (int i = 0; i < n3; i++) {
            if (set1.contains(C[i]) && !res.contains(C[i])) {
                res.add(C[i]);
            }
        }
        if (res.isEmpty()) {
            res.add(-1);
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
