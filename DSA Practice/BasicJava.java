import java.util.*;
public class BasicJava {
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
