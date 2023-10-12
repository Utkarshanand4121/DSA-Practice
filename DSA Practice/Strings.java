public class Strings {
    
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
    public static void main(String[] args) {

    }
}
