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
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("Value after reversing");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        
    }
}
