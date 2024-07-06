import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class BT2Revision {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node builtTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = builtTree(nodes);
            newNode.right = builtTree(nodes);
            return newNode;
        }

        public static void preOrder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        public static void inOrder(Node root) {
            if (root == null) {
                return;
            }
            inOrder(root.left);
            System.out.print(root.data);
            inOrder(root.right);
        }

        public static void postOrder(Node root) {
            if (root == null) {
                return;
            }
            preOrder(root.left);
            preOrder(root.right);
            System.out.print(root.data + " ");
        }

        // level Order traversal
        public static void level(Node root) {
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
        }

        // height
        public static int height(Node root) {
            if (root == null) {
                return 0;
            }
            int left = height(root.left);
            int right = height(root.right);
            return (int) Math.max(left, right) + 1;
        }

        public static int cnt(Node root) {
            if (root == null) {
                return 0;
            }
            int lc = cnt(root.left);
            int rc = cnt(root.right);
            return lc + rc + 1;
        }

        public static int sum(Node root) {
            if (root == null) {
                return 0;
            }
            int ls = sum(root.left);
            int rs = sum(root.right);
            return ls + rs + root.data;
        }

        public static int diameter(Node root) {
            if (root == null) {
                return 0;
            }

            int ld = diameter(root.left);
            int rd = diameter(root.right);
            int lh = height(root.left);
            int rh = height(root.right);

            int selfDia = lh + rh + 1;

            return Math.max(selfDia, Math.max(ld, rd));
        }

        static class Info {
            int dia;
            int ht;

            public Info(int dia, int ht) {
                this.dia = dia;
                this.ht = ht;
            }
        }

        public static Info dia2(Node root) {
            if (root == null) {
                return new Info(0, 0);
            }

            Info leftInfo = dia2(root.left);
            Info rightInfo = dia2(root.right);
            int maxDia = Math.max(Math.max(leftInfo.dia, rightInfo.dia), rightInfo.ht + leftInfo.ht + 1);
            int maxht = Math.max(rightInfo.ht, leftInfo.ht) + 1;

            return new Info(maxDia, maxht);
        }

        public static boolean isIdential(Node node, Node subroot) {
            if (node == null && subroot == null) {
                return true;
            } else if (node == null || subroot == null || node.data != subroot.data) {
                return false;
            }

            if (!isIdential(node.left, subroot)) {
                return false;
            }
            if (!isIdential(node.right, subroot)) {
                return false;
            }

            return true;
        }

        public static boolean isSubtree(Node root, Node subroot) {
            if (root == null) {
                return false;
            }
            if (root.data == subroot.data) {
                if (isIdential(root, subroot)) {
                    return true;
                }
            }

            return isSubtree(root.left, subroot.left) || isSubtree(root.right, subroot.right);
        }

        // Top View
        static class Info2 {
            Node node;
            int hd;

            public Info2(Node node, int hd) {
                this.node = node;
                this.hd = hd;
            }
        }

        public static void topView(Node root) {
            if (root == null) {
                return;
            }
            HashMap<Integer, Node> map = new HashMap<>();
            Queue<Info2> q = new LinkedList<>();

            q.add(new Info2(root, 0));
            q.add(null);

            int min = 0;
            int max = 0;

            while (!q.isEmpty()) {
                Info2 currNode = q.remove();
                if (currNode == null) {
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    if (!map.containsKey(currNode.hd)) {
                        map.put(currNode.hd, currNode.node);
                    }

                    if (currNode.node.left != null) {
                        q.add(new Info2(currNode.node.left, currNode.hd - 1));
                        min = Math.min(min, currNode.hd - 1);
                    }
                    if (currNode.node.right != null) {
                        q.add(new Info2(currNode.node.right, currNode.hd + 1));
                        max = Math.max(max, currNode.hd + 1);
                    }
                }
            }

            for (int i = min; i <= max; i++) {
                System.out.print(map.get(i).data + " ");
            }
            System.out.println();
        }

        public static void klevel(Node root, int level, int k) {
            if (root == null) {
                return;
            }

            if (level == k) {
                System.out.print(root.data + " ");
                return;
            }
            klevel(root.left, level + 1, k);
            klevel(root.right, level + 1, k);
        }

        public static boolean getPath(Node root, int n, ArrayList<Node> path) {

            if(root == null) {
                return false;
            }

            path.add(root);

            if(root.data == n) {
                return true;
            }
            boolean foundLeft = getPath(root.left, n, path);
            boolean foundRight = getPath(root.right, n, path);

            if(foundLeft || foundRight) {
                return true;
            }

            path.remove(path.size() - 1);
            return false;
        }

        public static Node lca(Node root, int n1, int n2) {
            ArrayList<Node> path1 = new ArrayList<>();
            ArrayList<Node> path2 = new ArrayList<>();

            getPath(root, n1, path1);
            getPath(root, n2, path2);

            // last common ancestor
            int i = 0;
            for(; i<path1.size() && i<path2.size(); i++) {
                if(path1.get(i) != path2.get(i)) {
                    break;
                }
            }

            Node lca = path1.get(i-1);
            return lca;
        }

        public static Node lca2(Node root, int n1, int n2) {
            if(root == null || root.data == n1 || root.data == n2) {
                return root;
            }

            Node leftLca = lca2(root.left, n1, n2);
            Node rightLca = lca2(root.right, n1, n2);

            if(rightLca == null) {
                return leftLca;
            }

            if(leftLca == null) {
                return rightLca;
            }

            return root;
        }

        // Min Dist
        public static int lcaDist(Node root, int n) {
            if(root == null) {
                return -1;
            }

            if(root.data == n) {
                return 0;
            }
            int leftDist = lcaDist(root.left, n);
            int rightDist = lcaDist(root.right, n);

            if(leftDist == -1 && rightDist == -1) {
                return -1;
            } else if(leftDist == -1) {
                return rightDist + 1;
            } else {
                return leftDist + 1;
            }
        }
        public static int minDist(Node root, int n1, int n2) {
            Node lca = lca2(root, n1, n2);
            int dist1 = lcaDist(root, n1);
            int dist2 = lcaDist(root, n2);

            return dist1 + dist2;
        }
    }


    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.builtTree(nodes);
        System.out.println(root.data);
        // tree.preOrder(root);
        // System.out.println();
        // tree.level(root);
        // System.out.println(tree.height(root));
        // System.out.println(tree.cnt(root));
        // System.out.println(tree.sum(root));
        // System.out.println(tree.diameter(root));

        // System.out.println(tree.dia2(root).dia);
        // tree.topView(root);

        // tree.klevel(root, 1, 3);
        // System.out.println(tree.lca(root, 4, 6).data);

        // System.out.println(tree.lca2(root, 4, 5).data);

        System.out.println(tree.minDist(root, 4, 6));
        
    }
}