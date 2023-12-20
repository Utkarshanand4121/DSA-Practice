public class Dec20 {
    static int findWinner(int n, int A[]){
        // code here
        int sum = 0;
        for(int i=0; i<A.length; i++) {
            sum ^= A[i];
        }
        if(sum == 0) {
            return 1;
        } else{
            if(n %2 == 0) {
                return 1;
            } else {
                return 2;
            }
        }
        
    }
    public static void main(String[] args) {
        
    }
}
