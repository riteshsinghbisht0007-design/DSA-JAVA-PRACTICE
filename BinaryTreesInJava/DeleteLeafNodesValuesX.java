package BinaryTreesInJava;

public class DeleteLeafNodesValuesX {
  public static Node deleteLeafNodes(Node root, int x) {
    if(root == null){
      return root;
    }
     root.left = deleteLeafNodes(root.left, x);
    root.right = deleteLeafNodes(root.right, x);
    if(root.left == null && root.right == null && root.data == x){
      return null;
    }
    return root;
  }
  public static void preorder(Node root){
    if(root == null){
      return;
    }
    System.out.print(root.data + " ");
    preorder(root.left);
    preorder(root.right);
  }
  public static void main(String[] args) {
    /*
                 1
               /   \
              3     3
             / \   
            2   3 
    */
    Node root = new Node(1);
    root.left = new Node(3);
    root.right = new Node(3);
    root.left.left = new Node(2);
    root.left.right = new Node(3);
    


     root = deleteLeafNodes(root, 3);
    System.out.println();
    preorder(root);



  }
}
