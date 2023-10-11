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
    public static void greater(int a, int b){
        if(a>b){
            System.out.println(a+" is greater");
        } else{
            System.out.println(b+" is greater");
        }
    }
    public static void calculator(int num1, int num2 , char operator) {
        switch(operator){
            case '+' :
                System.out.println(num1 + num2);
                break;
            case '-' :
                System.out.println(num1 - num2);
                break;
            case '*' :
                System.out.println(num1 * num2);
                break;
            case '/' :
                System.out.println(num1 / num2);
                break;
            case '%' :
                System.out.println(num1 / num2);
                break;
            default :
                System.out.println("Invalid input");
                break;
        }    
    }

    public static void larger(int num1, int num2, int num3) {
        if(num1>num2 && num2>num3){
            System.out.println(num1 + " is larger");
        } else if(num2>num3 && num2>num1) {
            System.out.println(num2 + " is larger");
        } else{
            System.out.println(num3 + " is larger");
        }
    }

    public static void reverse(int num1) {
        int lastnum;
        while(num1>0) {
            lastnum = num1 % 10;
            num1 = num1 / 10;
            System.out.print(+lastnum);
        }
    }

    public static boolean prime(int num1) {
        boolean isPrime = false;
        if(num1==2){
            isPrime = true;
        }
        for(int i=2; i<num1; i++) {
            if(num1 % i == 0) {
                isPrime = false;
            }
        }
        return true;
    }

    public static void pallindrome(int num1) {
        int originalNum = num1;
        int lastnum;
        int reverse = 0;
        while(num1>0) {
            lastnum = num1%10;
            num1 = num1 / 10;
            reverse = (reverse*10)+lastnum;
        }
        if(originalNum == reverse) {
            System.out.print("Number is pallindrome");
        } else{
            System.out.print("Number is not pallindrome");
        }
    }
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the num1: ");
        // int num1 = sc.nextInt();
        // System.out.print("Enter the num2: ");
        // int num2 = sc.nextInt();
        // System.out.print("Enter the operator(+,-,*,/,%): ");
        // char operator = sc.next().charAt(0);
        // calculator(num1, num2, operator);

        // Student s1 = new Student("Utkarsh");
        // System.out.println(s1.name);
        // System.out.print("Enter the num1: ");
        // int num1 = sc.nextInt();
        // System.out.print("Enter the num2: ");
        // int num2 = sc.nextInt();
        // System.out.print("Enter the num3: ");
        // int num3 = sc.nextInt();
        // larger(num1, num2, num3);
        // pallindrome(num1);

        Student s1 = new Student();
        s1.getdetails("Utkarsh", 12345);
        s1.displayDetails();
    }
}
    class Student {
        String name;
        int roll;
        void getdetails(String name, int roll) {
            this.name = name;
            this.roll = roll;
        }
        void displayDetails(){
            System.out.println("Student name: "+name);
            System.out.println("Roll number: "+roll);
        }
    }
 

