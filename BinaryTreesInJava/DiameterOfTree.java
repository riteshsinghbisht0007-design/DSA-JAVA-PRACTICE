package BinaryTreesInJava;
public class DiameterOfTree {
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

  // Approach -1 T.C = O(n^2)

  public static int height(Node root) {
    if(root == null){
      return 0;
    }  
    int lh = height(root.left);
    int rh = height(root.right);
    return Math.max(lh, rh) + 1;
  }
  public static int diameter(Node root) {
    if(root == null){
      return 0;
    } 
    int lh = height(root.left);
    int rh = height(root.right);
    int ld = diameter(root.left);
    int rd = diameter(root.right);

    int seldiam = lh + rh + 1;
    return Math.max(seldiam, Math.max(ld, rd)); 
  }


  // Approach -2 T.C = O(n)
  static class Info {
    int ht;
    int diam;
    public Info(int height, int diameter) {
      this.diam = diameter;
      this.ht = height;
    }
  }
  public static Info diameter2(Node root) {
 
    if(root == null){
      return new Info(0, 0);
    }
    
    Info leftInfo = diameter2(root.left);
    Info rightInfo = diameter2(root.right);

    int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
    int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;
    return new Info(ht, diam);
  }
  public static void main(String[] args) {
     /*
                 1
                / \
               2   3
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
     System.out.println(diameter(root));

     System.out.println(diameter2(root).diam);
  }
}
