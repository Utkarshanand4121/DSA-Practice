

import java.util.*;

public class BasicsJava {
    public static void calculator(int num1, int num2) {
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        char operator = sc.next().charAt(0);
        switch(operator) {
            case '+' :
                System.out.println(num1+num2);
                break;
            case '-' :
                System.out.println(num1-num2);
                break;
            case '*' :
                System.out.println(num1*num2);
                break;
            case '/' :
                System.out.println(num1/num2);
                break;
            case '%' :
                System.out.println(num1%num2);
                break;
            default :
                System.out.println("Invalid input");
                break;
        }

    }

    public static int reverse(int num) {
        int lastdigit;
        int reverse=0;
        while(num>0) {
            lastdigit = num%10;
            reverse = (reverse*10)+lastdigit;
            num = num/10;
        }
        return reverse;
    }
    public static void main(String[] args) {
        System.out.println(reverse(85201));
    }
}
