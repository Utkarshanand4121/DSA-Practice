import java.util.LinkedList;
import java.util.Queue;

public class BT2Revision {
    static class Node{
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
            if(nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = builtTree(nodes);
            newNode.right = builtTree(nodes);
            return newNode;
        }

        public static void preOrder(Node root) {
            if(root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        } 

        public static void inOrder(Node root) {
            if(root == null) {
                return;
            }
            inOrder(root.left);
            System.out.print(root.data);
            inOrder(root.right);
        }

        public static void postOrder(Node root) {
            if(root == null) {
                return;
            }
            preOrder(root.left);
            preOrder(root.right);
            System.out.print(root.data + " ");
        }

        // level Order traversal
        public static void level(Node root) {
            if(root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()) {
                Node currNode = q.remove();
                if(currNode == null) {
                    System.out.println();
                    if(q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if(currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if(currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
        }

        // height
        public static int height(Node root) {
            if(root == null) {
                return 0;
            }
            int left = height(root.left);
            int right = height(root.right);
            return (int)Math.max(left, right) + 1;
        }

        public static int cnt(Node root) {
            if(root == null) {
                return 0;
            }
            int lc = cnt(root.left);
            int rc = cnt(root.right);
            return lc + rc + 1;
        }

        public static int sum(Node root) {
            if(root == null) {
                return 0;
            }
            int ls = sum(root.left);
            int rs = sum(root.right);
            return ls + rs + root.data;
        }
    } 

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.builtTree(nodes);
        System.out.println(root.data);
        tree.preOrder(root);
        System.err.println();
        tree.level(root);
        System.out.println(tree.height(root));
        System.out.println(tree.cnt(root));
        System.out.println(tree.sum(root));
    }
}