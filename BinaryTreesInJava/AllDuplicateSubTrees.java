package BinaryTreesInJava;

public class AllDuplicateSubTrees {
  public static Node allDuplicateSubTrees(Node root) {
    if (root == null) {
      return null;
    }
    
    Node left = allDuplicateSubTrees(root.left);
    Node right = allDuplicateSubTrees(root.right);
    if (left != null && right != null) {
      if (left.data == root.data && right.data == root.data) {
        return root;
      }
    }
    return null;
  }
  public static void main(String[] args) {
    /*
              1
             / \
            2   3
           /   / \
          4   2   4
         / \
        4   4
     */

    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.right.left = new Node(2);
    root.right.right = new Node(4);
    root.left.left.left = new Node(4);
    root.left.left.right = new Node(4);

    System.out.println(allDuplicateSubTrees(root));
  }
}
