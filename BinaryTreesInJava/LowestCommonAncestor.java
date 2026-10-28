package BinaryTreesInJava;

import java.util.ArrayList;

public class LowestCommonAncestor {

  public static boolean findPath(Node root, int n, ArrayList<Node> path) {
    if(root == null) {
      return false;
    }
    path.add(root);
    if(root.data == n) {
      return true;
    }
    boolean foundLeft = findPath(root.left, n, path);
    boolean foundRight = findPath(root.right, n, path);
    if(foundLeft || foundRight) {
      return true;
    }
    path.remove(path.size()-1);
    return false;
  }

  public static Node lca(Node root, int n1, int n2) {
    ArrayList<Node> path1  = new ArrayList<>();
    ArrayList<Node> path2  = new ArrayList<>();
    findPath(root, n1, path1);
    findPath(root, n2, path2);
    // calculate LCA
    int i =0;
    for(i=0; i<path1.size() && i<path2.size(); i++) {
      if(path1.get(i) != path2.get(i)) {
        break;
      }
    }
   Node lca = path1.get(i-1);
  return lca;
  }

  // Aproach -02
  public static Node lca2(Node root, int n1, int n2) {
    if(root == null) {
      return null;
    }
    if(root.data == n1 || root.data == n2) {
      return root;
    }

   Node leftLca = lca2(root.left, n1, n2);
   Node rightLca = lca2(root.right, n1, n2);
    
    // leftLca = val rightLCA = null
    if(rightLca == null){
      return leftLca;
    } 
    if(leftLca == null) {
      return rightLca;
    }
    return root;
  }

  public static int lcaDist(Node root, int n) {
    if(root == null) {
      return -1;
    }
    if(root.data == n) {
      return 0;
    }
    int leftDist = lcaDist(root.left, n);
   int rightDist = lcaDist(root.right, n);
   if(leftDist == -1 && rightDist == -1) {
     return -1;
   } else if(leftDist == -1){
     return rightDist + 1;
   } else {
     return leftDist + 1;
   }
  }

  public static int KthAncestor(Node root, int n, int k) {
    if(root == null) {
      return -1;
    }
    if(root.data == n) {
      return 0;
    }
    int leftDist = KthAncestor(root.left, n, k);
    int rightDist = KthAncestor(root.right, n, k);

    if(leftDist == -1 && rightDist == -1) {
      return -1;
    } 
    int max = Math.max(leftDist, rightDist);
    if(max + 1 == k) {
      return root.data;
    }
    return max + 1;
  }
  public static int MinDistance(Node root, int n1, int n2) {
    Node lca = lca2(root, n1, n2);
    int dis1 = lcaDist(lca, n1);
    int dis2 = lcaDist(lca, n2);
    return dis1 + dis2;
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

    int n1 = 4;
    int n2 = 6;
    // System.out.println(lca2(root, n1, n2).data);
    System.out.println(MinDistance(root, n1, n2));
    System.out.println(KthAncestor(root, n1, 2));
    
  }
}
