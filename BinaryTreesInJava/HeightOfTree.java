package BinaryTreesInJava;

public class HeightOfTree {
  static class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  public static int height(Node root){
    if(root == null){
      return 0;
    } 
    int lh = height(root.left);
    int rh = height(root.right);

    return Math.max(lh, rh) + 1;
  }

  public static int countNodes(Node root){
    if(root == null){
      return 0;
    }
    int lc = countNodes(root.left);
    int rc = countNodes(root.right);
    return lc + rc + 1;
  }

  public static int SumNodes(Node root){
    if (root == null){
      return 0;
    }
    int lS = SumNodes(root.left);
    int rS = SumNodes(root.right);
    return lS + rS + root.data;
  }
  public static void main(String[] args) {

  /*            1
               / \
              2   3
             / \ / \
            4  5 6  7
                   \
                    8
                     \
                      9
  */
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);
    root.right.left.right = new Node(8);
    root.right.right.right = new Node(9);
    System.out.println(height(root));
    System.out.println(countNodes(root));
    System.out.println(SumNodes(root));
  }
}
