import java.util.Arrays;

public class Dec21 {
    static int minCandy(int N, int ratings[]) {
        // code here
        int res[] = new int[N];
        Arrays.fill(res, 1);
        for(int i=1; i<ratings.length; i++) {
            if(ratings[i] > ratings[i-1]) {
                res[i] = res[i-1] + 1;;
            }
        }
        for(int i=ratings.length-2; i>=0; i--) {
            if(ratings[i] > ratings[i+1]) {
                res[i] = Math.max(res[i], res[i+1] + 1);
            }
        }
        int sum = 0;
        for(int i=0; i<res.length; i++) {
            sum += res[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        
    }
}
