import java.util.*;
public class CollegePractice {
    public static int fact(int n) {
        int fact = 1;
        if(n==0 || n==1) {
            return 1;
        } else{
            fact = n * fact(n-1);
        }
        return fact;
    }
    public static void swap(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a);
        System.out.println(b);
    }
    public static void square(int n) {
        for(int i=1; i<=n; i++) {
            System.out.println(i+ " x " + i + " = "+i*i);
        }
    }
    public static void main(String args[]){
        square(10);
    }
}
