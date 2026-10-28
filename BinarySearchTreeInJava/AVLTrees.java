package BinarySearchTreeInJava;

public class AVLTrees {
  static class Node{
    int data, height;
    Node left, right;
    Node(int data){
      this.data = data;
      height = 1;
    }
  }

  public static Node root;
  public static int height(Node node){
    if(node == null){
      return 0;
    }
    return node.height;
  }

  static int max(int a, int b){
    return a > b ? a : b;
  }

  public static Node insert(Node root, int key){
    if(root == null){
      return new Node(key);
    }

    if(key < root.data){
      root.left = insert(root.left, key);
    }else if(key > root.data){
      root.right = insert(root.right, key);
    } else {
      return root; // Duplicate keys not allowed 
    }

    // update root height 
    root.height = 1 + max(height(root.left), height(root.right));


    // Get root's balance factor 
    int bf = getbalanceFactor(root);

    // Left Left Case 
    if(bf > 1 && key < root.left.data){
      return rightRotate(root);
    }

    // Right Right Case 
    if(bf < -1 && key > root.right.data){
      return leftRotate(root);
    }

    // Left Right Case 
    if(bf > 1 && key > root.left.data){
      root.left = leftRotate(root.left);
      return rightRotate(root);
    }

    // Right Left Case 
    if(bf < -1 && key < root.right.data){
      root.right = rightRotate(root.right);
      return leftRotate(root);
    }

    return root; // returned if AVL Balanced 
  }



  // Return balance factor of node 
  public static int getbalanceFactor(Node node){
    if(node == null){
      return 0;
    }
    return height(node.left) - height(node.right);
  }





  public static Node leftRotate(Node x){
    Node y = x.right;
    Node T2 = y.left;

    y.left = x;
    x.right = T2;

    x.height = 1 + max(height(x.left), height(x.right));
    y.height = 1 + max(height(y.left), height(y.right));


    return y;
  }

  public static Node rightRotate(Node x){
    Node y = x.left;
    Node T2 = y.right;

    y.right = x;
    x.left = T2;  

    x.height = 1 + max(height(x.left), height(x.right));
    y.height = 1 + max(height(y.left), height(y.right));

    return y;
  }




  public static void main(String[] args) {
    root = insert(root, 10);
    root = insert(root, 20);
    root = insert(root, 30);
    root = insert(root, 40);
    root = insert(root, 50);
    root = insert(root, 25);

    /*
      30
     /  \
    20   40
     \
         \
          50
          
          
    */

    
  }
}
