public class StringRevision {
    public static void largest(String arr[]) {
        String largest = arr[0];
        for(int i=1; i<arr.length; i++) {
            if(largest.compareTo(arr[i]) < 0) {
                largest = arr[i];
            }
        }
        System.out.println("Largest is "+largest);
    }

    // First Letter to upper case
    public static String upper(String str) {
        StringBuilder strr = new StringBuilder();
        char ch = Character.toUpperCase(str.charAt(0));
        strr.append(ch);
        for(int i=1; i<str.length(); i++) {
            if(str.charAt(i) == ' ' && i < str.length()-1) {
                strr.append(str.charAt(i));
                i++;
                strr.append(Character.toUpperCase(str.charAt(i)));
            } else {
                strr.append(str.charAt(i));
            }
        }
        return strr.toString();
    }

    // Compression
    public static String compress(String str) {
        String newString = "";
        for(int i=0; i<str.length(); i++) {
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }
            newString += str.charAt(i);
            if(count > 1) {
                newString += count.toString();
            }
        }
        return newString;
    }

    // By string builder
    public static String compress2(String str) {
        StringBuilder res = new StringBuilder();
        for(int i=0; i<str.length(); i++) {
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }
            res.append(str.charAt(i));
            if(count > 1) {
                res.append(count.toString());
            }
        }
        return res.toString();
    }
    public static void main(String[] args) {
        String str = "aaaabbbcc";
        System.out.println(compress2(str));
    }
}
