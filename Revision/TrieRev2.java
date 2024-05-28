public class TrieRev2 {
    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;

        Node() {
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    // insert in trie
    public static void insert(String word) { // O(L)
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }

        curr.eow = true;
    }

    // search in a trie
    public static boolean search(String word) { // O(L)
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow == true;
    }

    // Word Break
    public static boolean wordBreak(String key) { // O(L) --> L = length of key
        if (key.length() == 0) {
            return true;
        }
        for (int i = 1; i <= key.length(); i++) {
            if (search(key.substring(0, i)) && wordBreak(key.substring(i))) {
                return true;
            }
        }
        return false;
    }

    // Prefix
    static class Node2 {
        Node2 children[] = new Node2[26];
        boolean eow = false;
        int freq;

        public Node2() {
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }

            freq = 1;
        }
    }

    public static Node2 root1 = new Node2();

    public static void insert2(String word) {
        Node2 curr = root1;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node2();
            } else {
                curr.children[idx].freq++;
            }

            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static void findPrefix(Node2 root1, String ans) { // O(L)
        if (root1 == null) {
            return;
        }

        if (root1.freq == 1) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < root1.children.length; i++) {
            if (root1.children[i] != null) {
                findPrefix(root1.children[i], ans + (char) (i + 'a'));
            }
        }
    }

    // Starts With
    public static boolean startsWith(String prefix) {
        Node curr = root;
        for (int i = 0; i < prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    public static int countSubstring(Node root) {
        if (root == null) {
            return 0;
        }

        int cnt = 0;
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null) {
                cnt += countSubstring(root.children[i]);
            }
        }
        return cnt + 1;
    }
    public static void main(String[] args) {
        // String word[] = { "the", "a", "there", "their", "any", "thee" };
        // for (int i = 0; i < word.length; i++) {
        // insert(word[i]);
        // }
        // root1.freq = -1;
        // System.out.println(search("thee"));
        // System.err.println(search("thor"));

        // System.out.println(wordBreak("thereatheir"));

        // findPrefix(root1, "");

        // System.out.println(startsWith("thei"));

        // Unique Substring
        String str = "ababa";
        for (int i = 0; i < str.length(); i++) {
            String suffix = str.substring(i);
            insert(suffix);
        }

        System.out.println(countSubstring(root));
    }
}
