package BinarySearchTreeInJava;
public class MinAbsDiffInBST {
  
  public int minDiff(Node root) {
    int min = Integer.MAX_VALUE;
    int prev = -1;
    inorder(root, prev, min);
    return min;
  }
  public void inorder(Node root, int prev, int min) {
    if(root == null) return;
    inorder(root.left, prev, min);
    if(prev != -1) min = Math.min(min, Math.abs(root.data - prev));
    prev = root.data;
    inorder(root.right, prev, min);
  }
  public static void main(String[] args) {
    /*
          4
         / \
        2   6
       / \   \
      1   3   7
    */

    Node root = new Node(4);
    root.left = new Node(2);
    root.right = new Node(6);
    root.left.left = new Node(1);
    root.left.right = new Node(3);
    root.right.right = new Node(7);
    System.out.println(minDiff(root));
  }
}
