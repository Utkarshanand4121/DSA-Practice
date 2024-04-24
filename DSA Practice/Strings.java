import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Strings {

    static void printHelloWorld() {
        // code here
        System.out.print("Hello World");
    }

    // Important question Revise it
    public static String reverseWord(String str) {
        // Reverse the string str
        int n = str.length();
        StringBuilder reverse = new StringBuilder();
        for (int i = n - 1; i >= 0; i--) {
            reverse.append(str.charAt(i));
        }
        return reverse.toString();
    }

    static String compareNum(int A, int B) {
        // code here
        String result;
        if (A > B) {
            result = A + " is greater than " + B;
        } else if (A < B) {
            result = A + " is less than " + B;
        } else {
            result = A + " is equals to " + B;
        }
        return result;
    }

    static String compareNM(int n, int m) {
        // code here
        String count;
        if (n < m) {
            count = "lesser";
        } else if (n > m) {
            count = "greater";
        } else {
            count = "equal";
        }
        return count;
    }

    static String compareFive(int N) {
        // code here
        String greater;
        if (N > 5) {
            greater = "Greater than 5";
        } else if (N < 5) {
            greater = "Less than 5";
        } else {
            greater = "Equal to 5";
        }
        return greater;
    }

    int isPalindrome(String S) {
        // code here
        int n = S.length();
        for (int i = 0; i < n / 2; i++) {
            if (S.charAt(i) != S.charAt(n - i - 1)) {
                return 0;
            }
        }
        return 1;
    }

    // Armstrong num
    static String armstrongNumber(int n) {
        // code here
        int lastDigit = 0;
        int originalNum = n;
        int cb = 0;
        while (n > 0) {
            lastDigit = n % 10;
            cb += (int) Math.pow(lastDigit, 3);
            n = n / 10;
        }
        if (cb == originalNum) {
            return "Yes";
        } else {
            return "No";
        }

    }

    boolean isBinary(String str) {
        // Your code here
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '1' && str.charAt(i) != '0') {
                return false;
            }
        }
        return true;

    }

    public String chartostr(char arr[], int N) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < N; i++) {
            str.append(arr[i]);
        }
        return str.toString();
    }

    public String is_palindrome(int n) {
        // Code here
        int lastnum;
        int reverseNum = 0;
        int originalNum = n;
        while (n > 0) {
            lastnum = n % 10;
            reverseNum = (reverseNum * 10) + lastnum;
            n = n / 10;
        }
        if (originalNum == reverseNum) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public int lastIndex(String s) {
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '1') {
                return i;
            }
        }
        return -1;
    }

    String removeVowels(String S) {
        // code here
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                str.append(c);
            }
        }
        return str.toString();
    }

    String removeCharacters(String S) {
        // code here
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8'
                    || c == '9') {
                str.append(c);
            }
        }
        return str.toString();
    }

    String modify(String S) {
        // your code here
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c != ' ') {
                str.append(c);
            }
        }
        return str.toString();
    }

    static String conRevstr(String S1, String S2) {
        // code here
        String str = S1 + S2;
        StringBuilder str2 = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            str2.append(str.charAt(i));
        }
        return str2.toString();
    }

    static String delAlternate(String S) {
        // code here
        StringBuilder str = new StringBuilder();
        str.append(S.charAt(0));
        for (int i = 1; i < S.length(); i++) {
            if (i % 2 == 0) {
                str.append(S.charAt(i));
            }
        }
        return str.toString();
    }

    public String removeConsonants(String s) {
        // code here.
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                    || ch == 'O' || ch == 'U') {
                str.append(ch);
            }
        }
        if (str.toString().equals("")) { // Remember this line clearfully
            return "No Vowel";
        } else {
            return str.toString();
        }

    }

    String firstAlphabet(String S) {
        // code here
        StringBuilder str = new StringBuilder();

        str.append(S.charAt(0));
        for (int i = 1; i < S.length(); i++) {
            char s = S.charAt(i);
            if (s == ' ') {
                str.append(S.charAt(i + 1));
            }
        }
        return str.toString();
    }

    public String removeConsecutiveCharacter(String S) {
        StringBuilder str = new StringBuilder();
        str.append(S.charAt(0));
        for (int i = 1; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (ch != S.charAt(i - 1)) {
                str.append(ch);
            }
        }
        return str.toString();
    }

    public String modify2(String s) {
        char ch = s.charAt(0);
        if (Character.isUpperCase(ch)) { // Remember this line
            return s.toUpperCase();
        }
        return s.toLowerCase();
    }

    int LastIndex(String s, char p) {
        // code here
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == p) {
                return i;
            }
        }
        return -1;
    }

    static int RedOrGreen(int N, String S) {
        // code here
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (ch == 'R') {
                count1++;
            } else {
                count2++;
            }
        }
        int res = (int) Math.min(count1, count2);
        return res;
    }

    public int penaltyScore(String S) {
        // Your code goes here
        int count = 0;
        for (int i = S.length() - 1; i > 0; i--) {
            char ch = S.charAt(i);
            char ch1 = S.charAt(i - 1);
            if (ch == '1' && ch1 == '2') {
                count++;
            }
        }
        return count;
    }

    String isGoodString(String s) {
        // code here
        String str = "YES";
        for (int i = s.length() - 1; i > 0; i--) {
            char ch = s.charAt(i);
            char ch1 = s.charAt(i - 1);
            if (ch == ch1) {
                str = "NO";
            }
        }
        return str;
    }

    static String revStr(String S) {
        // code here
        StringBuilder str = new StringBuilder();
        for (int i = S.length() - 1; i >= 0; i--) {
            char ch = S.charAt(i);
            str.append(ch);
        }
        return str.toString();
    }

    int[] arrayForm(int a, int b, int c) {
        // code here
        int arr[] = new int[3];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        return arr;
    }

    String stringForm(int a, int b, int c) {
        // code here
        StringBuilder str = new StringBuilder();
        str.append(a);
        str.append(b);
        str.append(c);
        return str.toString();
    }

    char firstRep(String S) {
        // your code here
        HashMap<Character, Integer> map = new HashMap<>();
        char res = '\0';
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (map.get(ch) > 1) {
                res = ch;
                break;
            }
        }
        if (res == '\0') {
            return '#';
        }
        return res;
    }

    static char nonrepeatingCharacter(String S) {
        // Your code here
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        char res = '\0';
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (map.get(ch) == 1) {
                res = ch;
                break;
            }
        }
        if (res == '\0') {
            return '$';
        }
        return res;
    }

    String merge(String S1, String S2) {
        // code here
        StringBuilder res = new StringBuilder();
        int i = 0;
        int j = 0;
        while ((i != S1.length()) && (j != S2.length())) {
            char ch = S1.charAt(i);
            char ch1 = S2.charAt(j);
            res.append(ch);
            i++;
            if (j != S2.length()) {
                res.append(ch1);
                j++;
            }
        }
        while (i != S1.length()) {
            char ch3 = S1.charAt(i);
            res.append(ch3);
            i++;
        }
        while (j != S2.length()) {
            char ch4 = S2.charAt(j);
            res.append(ch4);
            j++;
        }
        return res.toString();
    }

    String removeDuplicates(String str) {
        // code here
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            set.add(ch);
        }
        for (Character ch : set) {
            res.append(ch);
        }
        return res.toString();
    }

    public static String PartyType(long a[], int n) {
        // Your code goes here
        String res = "GIRLS";
        HashMap<Long, Long> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0L) + 1);
        }
        for (int i = 0; i < n; i++) {
            if (map.get(a[i]) > 1) {
                res = "BOYS";
                break;
            }
        }
        return res;
    }

    public String transform(String s) {
        // code here
        StringBuilder res = new StringBuilder();
        char ch2 = s.charAt(0);
        res.append(Character.toUpperCase(ch2));
        for (int i = 0; i < s.length() - 1; i++) {
            char ch = s.charAt(i);
            char ch1 = s.charAt(i + 1);
            if (ch == ' ') {
                res.append(Character.toUpperCase(ch1));
            } else {
                res.append(ch1);
            }
        }
        return res.toString();
    }

    static String removeChars(String string1, String string2) {
        // code here
        HashSet<Character> set = new HashSet<>();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < string2.length(); i++) {
            char ch = string2.charAt(i);
            set.add(ch);
        }
        for (int i = 0; i < string1.length(); i++) {
            char ch = string1.charAt(i);
            if (!set.contains(ch)) {
                res.append(ch);
            }
        }
        return res.toString();
    }

    String removeSpecialCharacter(String s) {
        // code here
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (((ch >= 'a') && (ch <= 'z')) || ((ch >= 'A') && (ch <= 'Z'))) {
                res.append(ch);
            }
        }
        if (res.toString().isEmpty()) {
            return "-1";
        }
        return res.toString();
    }

    String modify2(String s) {
        // your code here
        StringBuilder vow = new StringBuilder();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vow.append(ch);
            }
        }
        vow.toString();
        int n = vow.length() - 1;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                char ch1 = vow.charAt(n);
                res.append(ch1);
                n--;
            } else {
                res.append(ch);
            }
        }
        return res.toString();
    }

    public String reverseString(String s) {
        // code here.
        StringBuilder str = new StringBuilder();
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                continue;
            } else {
                set.add(ch);
            }
        }
        for (Character key : set) {
            str.append(key);
        }
        return str.toString();
    }

    public static int divisibleBy4(String N) {
        // Your Code Here
        int rem = 0;
        for (int i = 0; i < N.length(); i++) {
            char ch = N.charAt(i);
            rem = ((rem * 10) + ch - '0') % 4;
        }
        if (rem == 0) {
            return 1;
        }
        return 0;
    }

    public static int divisibleBy11(String S) {
        // Your Code Here
        int rem = 0;
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            rem = (rem * 10 + (ch - '0')) % 11;
        }
        if (rem == 0) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {

    }
}
