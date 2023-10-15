
import java.util.*;

public class BasicsJava {
    public static void calculator(int num1, int num2) {
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            case '%':
                System.out.println(num1 % num2);
                break;
            default:
                System.out.println("Invalid input");
                break;
        }

    }

    public static void multiple(int n) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while (true) {
            n = sc.nextInt();
            if (n % 10 == 0) {
                break;
            }
            System.out.print(n);
        }
    }

    public static int reverse(int num) {
        int lastdigit;
        int reverse = 0;
        while (num > 0) {
            lastdigit = num % 10;
            reverse = (reverse * 10) + lastdigit;
            num = num / 10;
        }
        return reverse;
    }

    public static int binToDec(int binNum) {
        int deciNum = 0;
        int lastDigit;
        int pow = 0;
        while (binNum > 0) {
            lastDigit = binNum % 10;
            deciNum = deciNum + lastDigit * (int) Math.pow(2, pow);
            pow++;
            binNum = binNum / 10;
        }
        return deciNum;
    }

    public static int deciToBin(int deciNum) {
        int binNum = 0;
        int lastDigit;
        int pow = 0;
        while(deciNum>0) {
            lastDigit = deciNum % 2;
            binNum = binNum + lastDigit*(int) Math.pow(10, pow);
            pow++;
            deciNum = deciNum / 2;
        }
        return binNum;
    }

    public static void main(String[] args) {
        System.out.println(deciToBin(15));
    }
}
