package HashingInJavaa;


import java.util.*;

public class BottomViewOfBT {

  static class Info {
    TreeNode node;
    int hd;

    Info(TreeNode node, int hd) {
      this.node = node;
      this.hd = hd;
    }

  }
  static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) {
      this.val = val;
    }
  }

  public static void bottomView(TreeNode root) {
    if(root == null) {
      return;
    }

    Queue<Info> q = new LinkedList<>();
    TreeMap<Integer, Integer> map = new TreeMap<>();

    q.add(new Info(root, 0));

    while(!q.isEmpty()) {
      Info curr = q.poll();
      TreeNode node = curr.node;
      int hd = curr.hd;
      

      // bottom vview : same hd par value update hogi 
      map.put(hd, node.val);

      if(node.left != null) {
        q.add(new Info(node.left, hd-1));
      }
      if(node.right != null) {
        q.add(new Info(node.right, hd+1));
      }
    }

    for(int value : map.values()) {
      System.out.print(value + " ");
    }

  }
  public static void main(String[] args) {
    /*
              20
            /    \
          8       22
        /   \       \
       5     3       25
            /  \
           10    14
    */

    TreeNode root = new TreeNode(20);
    root.left = new TreeNode(8);
    root.right = new TreeNode(22);
    root.left.left = new TreeNode(5);
    root.left.right = new TreeNode(3);
    root.right.right = new TreeNode(25);
    root.left.right.left = new TreeNode(10);
    root.left.right.right = new TreeNode(14);

    bottomView(root);
  }
}
