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

    boolean isBinary(String str)
	{
	  //Your code here
	  for(int i=0; i<str.length(); i++) {
	      if(str.charAt(i) != '1' && str.charAt(i) != '0' ) {
	          return false;
	      }
	  }
	  return true;
	  
	}

    public String chartostr(char arr[], int N){
        StringBuilder str = new StringBuilder();
        for(int i=0; i<N; i++) {
            str.append(arr[i]);
        }
        return str.toString();
    }

    public String is_palindrome(int n)
    {
        // Code here
        int lastnum;
        int reverseNum = 0;
        int originalNum = n;
        while(n>0) {
            lastnum = n%10;
            reverseNum = (reverseNum*10)+lastnum;
            n = n/10;
        }
        if(originalNum == reverseNum) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public int lastIndex( String s) {
        for(int i=s.length()-1; i>=0; i--) {
            if(s.charAt(i) == '1') {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

    }
}
