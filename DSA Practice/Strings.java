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

    String removeVowels(String S) {
        // code here
        StringBuilder str = new StringBuilder();
        for(int i=0; i<S.length(); i++) {
            char c = S.charAt(i);
            if(c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                str.append(c);
            }
        }
        return str.toString();
    }

    String removeCharacters(String S) {
        // code here
        StringBuilder str = new StringBuilder();
        for(int i=0; i<S.length(); i++) {
            char c = S.charAt(i);
            if(c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9') {
                str.append(c);
            }
        }
        return str.toString();
    }

    String modify(String S)
    {
        // your code here
        StringBuilder str = new StringBuilder();
        for(int i=0; i<S.length(); i++) {
            char c = S.charAt(i);
            if(c != ' ') {
                str.append(c);
            }
        }
        return str.toString();
    }
    static String conRevstr(String S1, String S2) {
        // code here
        String str = S1+S2;
        StringBuilder str2 = new StringBuilder();
        for(int i=str.length()-1; i>=0; i--) {
            str2.append(str.charAt(i));
        }
        return str2.toString();
    }

    static String delAlternate(String S) {
        // code here
        StringBuilder str = new StringBuilder();
        str.append(S.charAt(0));
        for(int i=1; i<S.length(); i++) {
            if(i % 2 == 0) {
                str.append(S.charAt(i));
            }
        }
        return str.toString();
    }

    public String removeConsonants(String s)
    {
        //code here.
        StringBuilder str = new StringBuilder();
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u' || ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U') {
                str.append(ch);
            }
        }
        if(str.toString().equals("")) { // Remember this line clearfully
            return "No Vowel";
        } else {
            return str.toString();
        }
        
    }
    public static void main(String[] args) {

    }
}
