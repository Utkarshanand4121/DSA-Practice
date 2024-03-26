public class RecursionRevision {
    public static void printDec(int num) {
        if(num == 1) {
            System.out.print(num + " ");
            return;
        }
        System.out.print(num + " ");
        printDec(num - 1);
    }

    public static void printInc(int num) {
        if(num == 1) {
            System.out.print(num + " ");
            return;
        }
        printInc(num - 1);
        System.out.print(num+ " ");
    }

    public static int fact(int n) {
        if(n == 0) {
            return 1;
        }
        return n*fact(n-1);
    }

    public static int sum(int n) {
        if(n == 1) {
            return 1;
        }
        return n + sum(n-1);
    }

    public static int fib(int n) {
        if(n == 0) {
            return 0;
        } else if(n == 1) {
            return 1;
        }
        else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static boolean sorted(int arr[], int i) {
        if(i == arr.length - 1) {
            return true;
        }
        if(arr[i] > arr[i+1]) {
            return false;
        }
        return sorted(arr, i+1);
    }

    public static int firstOcc(int arr[], int key, int i) {
        if(i == arr.length) {
            return -1;
        }
        if(arr[i] == key) {
            return i;
        }
        return firstOcc(arr, key, i + 1);
    }

    public static int power(int x, int n) {
        if(n == 1) {
            return x;
        }
        return x*power(x, n-1);
    }

    public static int powerOpt(int x, int n) {
        if(n == 0) {
            return 1;
        }
        int halfPower = powerOpt(x, n/2);
        int halfPower2 = halfPower * halfPower;
        if(n % 2 == 0) {
            return halfPower2;
        }
        return x * halfPower2;
    }

    public static int tilling(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        int horizontal = tilling(n-1);
        int vertical = tilling(n - 2);
        int totalWays = horizontal + vertical;
        return totalWays;
    }

    public static void removeDuplicate(String str, int idx, StringBuilder res, boolean map[]) {
        if(idx == str.length()) {
            System.out.println(res);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true) {
            removeDuplicate(str, idx+1, res, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicate(str, idx+1, res.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        // int n = 5;
        // for(int i=0; i<=n; i++) {
        //     System.out.print(fib(i) + " ");
        // }
        // System.out.println();
        // // int arr[] = {1,2,3,4,5,5,4,3,2,1};
        // // System.out.print(firstOcc(arr, 5, 0));
        // System.out.println(tilling(3));

        String str = "aabbccaabb";
        StringBuilder res = new StringBuilder();
        boolean map[] = new boolean[28];
        removeDuplicate(str, 0, res, map);
    }

}
