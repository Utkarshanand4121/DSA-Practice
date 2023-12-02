public class Dec2 {
    static int isRepresentingBST(int arr[], int N)
    {
        // code here
        int res = 1;
        for(int i=1; i<N; i++) {
            if(arr[i] < arr[i-1]) {
                res = 0;
                break;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        
    }
}
