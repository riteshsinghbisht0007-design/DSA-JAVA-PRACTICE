package BinaryTreesInJava;

public class MinimumDepth {
  public static int minDepth(Node root) {
    int depth = 0;
    if(root == null) return 0;
    if(root.left == null && root.right == null) return 1;
    if(root.left == null) return minDepth(root.right) + 1;
    if(root.right == null) return minDepth(root.left) + 1;
    return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
  }

  public static boolean pathSum(Node root, int targetSum) {
    if(root == null) return false;
    if(root.left == null && root.right == null && root.data == targetSum) return true;
    return pathSum(root.left, targetSum - root.data) || pathSum(root.right, targetSum - root.data);
  }
  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);
    System.out.println(minDepth(root));
  }
}
