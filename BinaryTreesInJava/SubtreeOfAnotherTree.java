package BinaryTreesInJava;

import BinaryTreesInJava.DiameterOfTree.Node;

public class SubtreeOfAnotherTree {

  public static boolean isIdentical(Node node, Node subNode) {
    if(node == null && subNode == null){
      return true;
    } else if(node == null || subNode == null || node.data != subNode.data){
      return false;
    }

    if(!isIdentical(node.left, subNode.left)){
      return false;
    }
    if(!isIdentical(node.right, subNode.right)){
      return false;
    }
    return true;
  }

  public static boolean isSubtree(Node root, Node subRoot) {
  if(root == null){
    return false; 
  }
  if(root.data == subRoot.data){
    if(isIdentical(root, subRoot)){
      return true;
    }
  }
  boolean leftAns = isSubtree(root.left, subRoot);
  boolean rightAns = isSubtree(root.right, subRoot);

  return leftAns || rightAns;
  }
  public static void main(String[] args) {
    /*
             1
           /   \
          2     3
         / \   / \
        4   5  6  7
    */

    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);

    /* 
             2
           /   \
          4     5
    */
    
    Node root2 = new Node(2);
    root2.left = new Node(9);
    root2.right = new Node(5);


    System.out.println(isSubtree(root, root2));
  }
}
