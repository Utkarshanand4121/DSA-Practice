public class Strings {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        s = s.toLowerCase();
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if((ch >='a' && ch <='z') || (ch >='0' && ch <= '9')) {
                str.append(ch);
            }
        }
        // if(str.length() == 0) {
        //     return true;
        // } else if(str.length() == 1) {
        //     return false;
        // }
        int start = 0;
        String st = str.toString();
        int end = str.length() - 1;
        while(start <= end) {
            char ch1 = str.charAt(start);
            char ch2 = str.charAt(end);
            if(ch1 != ch2) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        
    }
}
