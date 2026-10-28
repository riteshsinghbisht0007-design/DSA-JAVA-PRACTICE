package BinarySearchTreeInJava;

import java.util.ArrayList;

public class KthSmallestElement {
  static class Node {
    int data;
    Node left;
    Node right;
    public Node(int data) {
      this.data = data;
      
    }
  }
  public static void getInorder(Node root, ArrayList<Integer> arr) {
    if(root == null) {
      return;
    }

    getInorder(root.left, arr);
    arr.add(root.data);
    getInorder(root.right, arr);
  }

  public static int kthSmallest(Node root, int k) {
    ArrayList<Integer> arr = new ArrayList<>();
    getInorder(root, arr);
    return arr.get(k - 1);
  }

  public static void main(String[] args) {
    /*
            8
           / \
          4   12
         / \   \
        2   6   14
    */

    Node root = new Node(8);
    root.left = new Node(4);
    root.right = new Node(12);
    root.left.left = new Node(2);
    root.left.right = new Node(6);
    root.right.right = new Node(14);
    System.out.println(kthSmallest(root, 3));
  }
}
