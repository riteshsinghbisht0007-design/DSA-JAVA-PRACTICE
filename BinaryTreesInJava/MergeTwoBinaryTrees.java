package BinaryTreesInJava;

public class MergeTwoBinaryTrees {
  public static Node mergeTrees(Node root1, Node root2) {
    if (root1 == null) {
      return root2;
    }
    if (root2 == null) {
      return root1;
    }
    root1.data += root2.data;
    root1.left = mergeTrees(root1.left, root2.left);
    root1.right = mergeTrees(root1.right, root2.right);
    return root1;
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
    /* root 1
               1
              / \
             2   3
            / \   \
           4   5   6


root 2
               1
              / \
             2   3
            / \   \
           4   5   6
    */

    Node root1 = new Node(1);
    root1.left = new Node(2);
    root1.right = new Node(3);
    root1.left.left = new Node(4);
    root1.left.right = new Node(5);
    root1.right.left = new Node(6);


    Node root2 = new Node(1);
    root2.left = new Node(2);
    root2.right = new Node(3);
    root2.left.left = new Node(4);
    root2.left.right = new Node(5);
    root2.right.left = new Node(6);

    System.out.println(mergeTrees(root1, root2));
    preorder(root1);
  }
}
