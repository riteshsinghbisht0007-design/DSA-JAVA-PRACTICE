package BinarySearchTreeInJava;

import java.util.ArrayList;

import javax.print.attribute.standard.MediaSize;

public class ConversionBSTToBalancedBST {
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

  // inorder 
  public static void getInorder(Node root, ArrayList<Integer> inorder) {
     if(root == null) {
       return;
     }
     getInorder(root.left, inorder);
     inorder.add(root.data);
     getInorder(root.right, inorder);
  }

  public static Node createBalancedBST(ArrayList<Integer> inorder, int start, int end) {
    if(start > end) {
      return null;
    }
    int mid = (start + end) / 2;
    Node root = new Node(inorder.get(mid));
    root.left = createBalancedBST(inorder, start, mid - 1);
    root.right = createBalancedBST(inorder, mid + 1, end);
    return root;
  }
  public static Node convert(Node root) {
    if (root == null) {
      return null;
    }
    
    // inorder sequence 
    ArrayList<Integer> inorder = new ArrayList<>();
    getInorder(root, inorder);

    return createBalancedBST(inorder, 0, inorder.size() - 1);

  }

  public static void preorder(Node root) {
    if (root == null) {
      return;
    }
    System.out.print(root.data + " ");
    preorder(root.left);
    preorder(root.right);
  }
  public static void main(String[] args) {
    /*
             8
           /   \
          6     10
         /        \
        5         11
       /            \
      3             12
 given bst 
    */
    Node root = new Node(8);
    root.left = new Node(6);
    root.right = new Node(10);
    root.left.left = new Node(5);
    root.left.right = new Node(3);
    root.right.right = new Node(11);
    root.right.right.right = new Node(12);


    root = convert(root);
    preorder(root);
  }
}
