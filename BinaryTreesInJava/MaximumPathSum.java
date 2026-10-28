package BinaryTreesInJava;

public class MaximumPathSum {
  public static int maxPathSum(Node root) {
   int maxValue[] = new int[1];
   maxValue[0] = Integer.MIN_VALUE;
   maxPathdown(root, maxValue);
   return maxValue[0];
  }
  public static int maxPathdown(Node root, int[] maxValue) {
    if(root == null) return 0;
    int left = Math.max(0, maxPathdown(root.left, maxValue));
    int right = Math.max(0, maxPathdown(root.right, maxValue));
    maxValue[0] = Math.max(maxValue[0], root.data + left + right);
    return root.data + Math.max(left, right);
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

    System.out.println(maxPathSum(root));
  }
}
