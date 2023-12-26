import java.util.ArrayList;

import org.w3c.dom.Node;

public class BSTRevision {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (val > root.data) {
            root.right = insert(root.right, val);
        } else {
            root.left = insert(root.left, val);
        }
        return root;
    }

    public static void inOrder(Node root) {
        if(root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static boolean search(Node root, int key) {
        if(root == null) {
            return false;
        }
        if(root.data == key) {
            return true;
        }
        if(key > root.data) {
            return search(root.right, key);
        } else {
            return search(root.left, key);
        }
    }

    // delete in a BST
    public static Node delete(Node root, int val) {
        if(root.data > val) {
            root.left = delete(root.left, val);
        } else if (root.data < val) {
            root.right = delete(root.right, val);
        } else {
            // case 1
            if(root.left == null && root.right == null) {
                return null;
            }
            // case 2
            if(root.left == null) {
                return root.right;
            } else if(root.right == null) {
                return root.left;
            }
            // case 3
            Node IS = findInorderSucc(root.right);
            root.data = IS.data;
            root.right =delete(root.right, IS.data);
        }
        return root;
    }

    public static Node findInorderSucc(Node root) {
        while(root.left != null) {
            root = root.left;
        }
        return root;
    }

    // Print in range
    public static void printInRange(Node root, int k1, int k2) {
        if(root == null) {
            return;
        }

        if(root.data >= k1 && root.data <= k2) {
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        } else if(root.data > k1) {
            printInRange(root.left, k1, k2);
        } else {
            printInRange(root.right, k1, k2);
        }
    }

    // Root to leaf path
    public static void printPath(ArrayList<Integer> path) {
        for(int i=0; i<path.size(); i++) {
            System.out.print(path.get(i) + "->");
        }
        System.out.println();
    }
    public static void rootToLeaf(Node root, ArrayList<Integer> path) {
        if(root == null) {
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null) {
            printPath(path);
        }
        rootToLeaf(root.left, path);
        rootToLeaf(root.right, path);
        path.remove(path.size() - 1);
    }

    // Validate BST
    public static boolean isValidate(Node root, Node min, Node max) {
        if(root == null) {
            return true;
        }
        if(min != null && root.data <= min.data) {
            return false;
        } else if(max != null && root.data >= max.data) {
            return false;
        }

        return isValidate(root.left, min, root) && isValidate(root.right, root, max);
    }

    // mirror of a BST
    public static Node createMirror(Node root) {
        if(root == null) {
            return null;
        }
        Node leftMirror = createMirror(root.left);
        Node rightMirror = createMirror(root.right);

        root.left = rightMirror;
        root.right = leftMirror;
        return root;
    }

    // create BST from sorted array
    public static Node createBST(int arr[], int st, int end) {
        if(st > end) {
            return null;
        }
        int mid = (st + end) / 2;
        Node root = new Node(arr[mid]);
        root.left = createBST(arr, st, mid-1);
        root.right = createBST(arr, mid+1, end);
        return root;
    }

    // converted BST to balanced BST
    public static void getInorder(Node root, ArrayList<Integer> inorder) {
        if(root == null) {
            return;
        }
        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }

    public static Node createBST2(ArrayList<Integer> inorder, int st, int end) {
        if(st > end) {
            return null;
        }
        int mid = (st + end) / 2;
        Node root = new Node(inorder.get(mid));
        root.left = createBST2(inorder, st, mid-1);
        root.right = createBST2(inorder, mid+1, end);

        return root;
    }

    // merge two bst
    
    public static void main(String[] args) {
        // int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        // Node root = null;

        // for (int i = 0; i < values.length; i++) {
        //     root = insert(root, values[i]);
        // }
        // inOrder(root);
        // System.out.println(search(root, 5));
        // root = delete(root, 5);
        // System.out.println();
        // inOrder(root);

        // printInRange(root, 5, 12);
        // System.out.println();
        // rootToLeaf(root, new ArrayList<>());

        // createMirror(root);
        // inOrder(root);

        int arr[] = {3,5,6,8,10,11,12};
        Node root2 = createBST2(arr, 0, arr.length-1);
        inOrder(root2);
    }
}
