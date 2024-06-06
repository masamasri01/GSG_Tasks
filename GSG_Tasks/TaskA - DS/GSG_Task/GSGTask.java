/*
 Given an array of integers arr where the elements are sorted in ascending order,
  convert it to a height-balanced binary search tree BST. */
import java.lang.Math;

class BST_Node {
    int data;
    BST_Node left;
    BST_Node right;

    BST_Node() {
        data = 0;
        left = null;
        right = null;
    }

    BST_Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class GSGTask {
    static void printTree(BST_Node root) {
        if (root == null) return;
        System.out.print(root.data);
        if (root.left != null) System.out.print(" my left is " + root.left.data);
        if (root.right != null) System.out.print(", my right is " + root.right.data);
        System.out.println();
        printTree(root.left);
        printTree(root.right);
    }

    public static BST_Node buildTree(int arr[], int start, int end) {
        if (start > end) {
            return null;
        }
        int mid =(int)Math.round((start+end)/2.0) ;
        System.out.println("mid="+mid);
        BST_Node node = new BST_Node(arr[mid]);
        node.left= buildTree(arr,start,mid-1);
        node.right= buildTree(arr,mid+1,end);
        return node;
    }

    public static void main(String[] args) {
        int arr[] = {-10,-3,  0,  5,9};
        BST_Node root = buildTree(arr,0,arr.length - 1);
        printTree(root);
    }
}

