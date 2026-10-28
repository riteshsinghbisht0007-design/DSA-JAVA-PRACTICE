package BinaryTreesInJava;
import java.util.*;
public class KthLevelOFATree {
  public static void kthLevel(Node root, int k) {
    if (root == null) {
      return;
    }
    if (k == 1) {
      System.out.print(root.data + " ");
      return;
    }
    kthLevel(root.left, k - 1);
    kthLevel(root.right, k - 1);
  }

  // Binary tree level order traversal 

  public static int height(Node root) {
    if (root == null) {
      return 0;
    }
    int lh = height(root.left);
    int rh = height(root.right);
    return Math.max(lh, rh) + 1;
  }

  // add in a array List in the form of {{1,2,3},{4,5,6},{7,8,9}}
  public static void levelOrder(Node root, int level, ArrayList<Integer> ans[]) {
    ArrayList<Integer> ans[] = new ArrayList[height(root)];
    for (int i = 0; i < ans.length; i++) {
      ans[i] = new ArrayList<>();
    }
    levelOrder(root, 0, ans);
    for (int i = 0; i < ans.length; i++) {
      for (int j = 0; j < ans[i].size(); j++) {
        System.out.print(ans[i].get(j) + " ");
      }
      System.out.println();
    }
  }
  
  public static void main(String[] args) {
    /*
              1
            /  \
           2    3
          / \  / \
         4   5 6  7
    */
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);
    // kthLevel(root, 3);
    levelOrder(root);
  }
}
