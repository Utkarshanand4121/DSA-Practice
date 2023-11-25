public class DP {
    long[] Series(int N) {
        // code here
        long n1 = N;
        long dp[] = new long[(int)n1+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2; i<=n1; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp;
        
    }

    static long fibSum(long N){
        //code here
        long dp[] = new long[(int)N+1];
        dp[0] = 0;
        dp[1] = 1;
        long sum = 1;
        for(int i=2; i<=N; i++) {
            dp[i] = (dp[i-1] + dp[i-2])%1000000007;
            sum = (sum + dp[i])%1000000007;
        }
        return sum;
    }
    public static void main(String[] args) {
        
    }
}
