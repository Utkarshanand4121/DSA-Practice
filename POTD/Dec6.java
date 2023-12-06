public class Dec6 {
    // Given two integers L, R, and digit X. Find the number of occurrences of X in
    // all the numbers in the range (L, R) excluding L and R.
    int countX(int L, int R, int X) {
        // code here
        int last = 0;
        int count = 0;
        for (int i = (L + 1); i < R; i++) {
            int origNum = i;
            while (origNum > 0) {
                last = origNum % 10;
                if (last == X) {
                    count++;
                }
                origNum = origNum / 10;
            }

        }
        return count;
    }

    public static void main(String[] args) {

    }
}
