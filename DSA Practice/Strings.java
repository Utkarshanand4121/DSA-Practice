public class Strings {
    
    static void printHelloWorld(){
        // code here
        System.out.print("Hello World");
    }
    // Important question Revise it
    public static String reverseWord(String str)
    {
        // Reverse the string str
        int n = str.length();
        StringBuilder reverse = new StringBuilder();
        for(int i= n-1; i>=0; i--) {
            reverse.append(str.charAt(i));
        }
        return reverse.toString();
    }
    static String compareNum(int A, int B){
        // code here
        String result;
        if(A>B) {
            result = A+" is greater than "+B;
        } else if(A<B) {
            result = A+" is less than "+B;
        } else {
            result = A+" is equals to "+B;
        }
        return result;
    }

    
    static String compareNM(int n,int m){
        // code here
        String count;
        if(n<m) {
            count = "lesser";
        } else if(n>m) {
            count = "greater";
        } else{
            count = "equal";
        }
        return count;
    }
    
    static String compareFive(int N){
        // code here
        String greater;
        if(N>5) {
            greater = "Greater than 5";
        }
        else if(N<5) {
            greater = "Less than 5";
        } else{
            greater = "Equal to 5";
        }
        return greater;
    }

    int isPalindrome(String S) {
        // code here
        int n = S.length();
        for(int i=0; i<n/2; i++){
            if(S.charAt(i) != S.charAt(n-i-1)){
                return 0;
            }
        }
        return 1;
    }

    // Armstrong num
    static String armstrongNumber(int n){
        // code here
        int lastDigit = 0;
        int originalNum = n;
        int cb = 0;
        while(n>0) {
            lastDigit = n%10;
            cb += (int) Math.pow(lastDigit,3);
            n = n/10;
        }
        if(cb == originalNum) {
            return "Yes";
        } else {
            return "No";
        }
        
    }
    public static void main(String[] args) {

    }
}
