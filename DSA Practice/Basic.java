import java.util.*;
public class Basic {
    static void printIndividualLine(){
        
        // Your code here
        System.out.println("Geeks");
        System.out.println("for");
        System.out.println("Geeks");
    }

    static void dataTypes(int a, float b, double c, long l, byte d){
        
        double p = c/b;//c/b
        double q = b/a;//b/a
        double r = c/a;//c/a
        double m = r+l;//r+l
        int s = a/d;//a/d
        
        //Printing all the results 
        System.out.println(p + " " + q + " " + r + " " + m + " " + s);
        
    }

    static void comment(int a, int b, int c){
        
        //Prints a
        System.out.println(a);
        //Prints b
        //System.out.println(b);
        //Prints c
        System.out.println(c);
    }
    static void getInput () {
		
	    Scanner sc = new Scanner(System.in);
	    int t=sc.nextInt(); //Taking the number of testcases
	    while(t-->0)
	    {
    		int a = sc.nextInt(); 
    		sc.nextLine();
    	    String s = sc.nextLine();
    	    
    	    //Your code here
    
    		System.out.println(a);
    		System.out.println(s);
	    }
	
	}
    public long find_fact(int n)
    {
        // Code here
        long n1 = n;
        long fact = 1;
        for(int i=1; i<=n; i++) {
            fact = fact*i;
        }
        return fact;
    }
    public long reverse_digit(long n)
    {
        // Code here
        long n1 = n;
        long last;
        long reve = 0;
        while(n1>0) {
            last = n1 % 10;
            n1 = n1/10;
            reve = (reve*10) + last;
        }
        return reve;
    }
    static int evenlyDivides(int N){
        // code here
        int count = 0;
        int originalNum = N;
        while(N>0) {
            int lastDigit = N%10;
            if(lastDigit!=0 && originalNum%lastDigit==0) {
                count++;
            }
            N = N/10;
        }
        return count;
    }

    static int sumOfDigits(int N) {
        // code here
        int sum = 0;
        while(N>0) {
            int lastDigit = N%10;
            sum = sum + lastDigit;
            N = N/10;
        }
        return sum;
    }

    static int cubeRoot(int N) {
        // code here
        if(N == 0){
            return 0;
        }
        int N1 = N;
        int cuberott = (int) Math.cbrt(N1);
        return cuberott;
    }

    int greatestOfThree(int A, int B, int C) {
        // code here
        int gre = 0;
        if(A>B && A>C) {
            gre = A;
        } else if(B>A && B>C) {
            gre = B;
        } else {
            gre = C;
        }
        return gre;
    }

    static int countSquares(int N) {
        // code here
        int count = 0;
        
        for(int i=1; i * i<N; i++) {
            count++;
        }
        return count;
    }
    int middle(int A, int B, int C){
        //code here
        int num = Integer.MAX_VALUE;
        if((A>B && A<C) || (A<B && A>C)) {
            num = A;
        } else if((B<A && B>C ) || (B>A && B<C)) {
            num = B;
        } else {
            num = C;
        }
        return num;
    }

    static String isValid(Long N){
        // code here
        String str = "";
        if(N%5==0) {
            str = "YES";
        } else {
            str = "NO";
        }
        return str;
    }

    // Mathematics
    static int maximizeMoney(int N , int K) {
        // code here
        int res = 0;
        if(N%2==0) {
            res = (N/2)*K;
        } else {
            res = ((N/2)+1)*K;
        }
        return res;
    }

    static int mindGame(int K) {
        // code here
        return K/2;
    }

    static int repeatedSumOfDigits(int N){
        // code here
        if(N < 10) {
            return N;
        }
        int last = 0;
        int sum = 0;
        while(N > 0) {
            last = N % 10;
            sum += last;
            N = N/ 10;
        }
        return repeatedSumOfDigits(sum);
    }

    static long isPerfectSquare(long n){
        // code here
        long res = 0;
        for(int i=1; i<=(int)Math.sqrt(n); i++) {
            if(n == (i*i)) {
                res = 1;
            }
        }
        return res;
    }

    static int findRemainder(int num1,int num2){
        // code here
        return num1 % num2;
    }

    static int mulClock(int num1, int num2) {
        // code here
        int res = num1 * num2;
        return res % 12;
    }
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a: ");
        // int a = sc.nextInt();
        // System.out.print("Enter b: ");
        // int b = sc.nextInt();
        // a = a ^ b;
        // b = a ^ b;
        // a = a ^ b;
        // System.out.println("Value after reversing");
        // System.out.println("a = "+a);
        // System.out.println("b = "+b);
        System.out.println(evenlyDivides(2446));
    }
}
