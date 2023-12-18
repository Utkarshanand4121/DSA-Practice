public class BitRevision {
    public static void evenOdd(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }

    public static int getIBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int clearBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int updateBit(int n, int i, int newBit) {
        int bitMask = 1 << i;
        int bitMask2 = ~(1 << i);
        if (newBit == 1) {
            return (n | bitMask);
        } else {
            return (n & bitMask2);
        }
    }

    public static int clearRange(int n, int i) {
        int bitMask = (~0) << i;
        return n & bitMask;
    }

    public static int countSetBit(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static int fastExpo(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fastExpo(n, 3));
    }
}
