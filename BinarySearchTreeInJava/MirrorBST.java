package BinarySearchTreeInJava;
public class MirrorBST {
  static class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
      this.data = data;
    }
  }
  public static Node mirror(Node root) {
    if(root == null) return null;
    Node left = mirror(root.left);
    Node right = mirror(root.right);
    root.left = right;
    root.right = left;
    return root;
  }
  public static void preorder(Node root) {
    if(root == null) return;
    System.out.print(root.data + " ");
    preorder(root.left);
    preorder(root.right);
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

    root = mirror(root);
    preorder(root);
  }
}
