package BinaryTreesInJava;

public class TransFormToSumTree {
 public static int TransFormSumTree(Node root) {
    if(root == null) {
      return 0;
    }
    int leftSum = TransFormSumTree(root.left);
    int rightSum = TransFormSumTree(root.right);

    int data = root.data;
    
    int newLeft = root.left == null ? 0 : root.left.data;
    int newRight = root.right == null ? 0 : root.right.data;

    root.data = leftSum + rightSum + newLeft + newRight;
    return data;
 }

 public static void preorder(Node root) {
    if(root == null) {
      return;
    }
    System.out.print(root.data + " ");
    preorder(root.left);
    preorder(root.right);
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

    System.out.println(TransFormSumTree(root));
    preorder(root);
    preorder(root.left);
    preorder(root.right);
    
    
  }
}
