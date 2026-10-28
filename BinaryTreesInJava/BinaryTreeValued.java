package BinaryTreesInJava;
public class BinaryTreeValued {
  public static boolean isValued(Node root){
    if(root == null){
      return true;
    }
    int n = root.data;
    if(root.left != null && root.left.data != n){
      return false;
    }
    if(root.right != null && root.right.data != n){
      return false;
    }
    return isValued(root.left) && isValued(root.right);
  }
    public static void main(String[] args) {
    /*
              1
            /  \
           2    2
          / \  / \
         2   2 2  2
    */
    Node root = new Node(2);
    root.left = new Node(2);
    root.right = new Node(2);
    root.left.left = new Node(2);
    root.left.right = new Node(2);
    root.right.left = new Node(2);
    root.right.right = new Node(2);

    System.out.println(isValued(root));
    
  }
  }

