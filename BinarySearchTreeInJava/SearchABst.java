package BinarySearchTreeInJava;
import java.util.*;

import javax.swing.tree.TreeNode;
public class SearchABst {
  static class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
      this.data = data;
    }
  }
  public static void inorder(Node root) {
    if (root == null) {
      return;
    }
    inorder(root.left);
    System.out.print(root.data + " ");
    inorder(root.right); 
  }
  public static Node insert(Node root, int val) {
    if (root == null) {
      root = new Node(val);
      return root;
    }
    if (root.data > val) {
      root.left = insert(root.left, val);
    } else {
      root.right = insert(root.right, val);
    }
    return root;
  }
  public static boolean search(Node root, int key) {
    if (root == null) {
      return false;
    }
    if (root.data == key) {
      return true;
    }
    if (root.data > key) {
      return search(root.left, key);
    }
    return search(root.right, key);
  }

  public static Node delete(Node root, int key) {
     if(root.data < key) {
       root.right = delete(root.right, key);
     } else if(root.data > key) {
       root.left = delete(root.left, key);
     }
     else {
      // case 1: no child
       if(root.left == null && root.right == null) {
         return null;
      }

      // case 2: one child
       if(root.left == null) {
         return root.right;
       } else if(root.right == null) {
         return root.left;
       }

       // case3 : two child
       Node IS = findInorderSuccessor(root.right);
       root.data = IS.data;
       root.right = delete(root.right, IS.data);


     }
     return root;
  }
  public static Node findInorderSuccessor(Node root) {
    while(root.left != null) {
      root = root.left;
    }
    return root;
  }

  public static void printInRange(Node root, int k1, int k2) {
    if(root.data >= k1 && root.data <= k2) {
      printInRange(root.left, k1, k2);
      System.out.print(root.data + " ");
      printInRange(root.right, k1, k2);
    }
    else if(root.data < k1) {
      printInRange(root.left, k1, k2);
    }
    else {
      printInRange(root.right, k1, k2);
    }
  }


  public List<List<Integer>> pathSum(Node root, int targetSum) {
        if(root == null) {
            return new ArrayList<>();
        }
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        pathSum(root, targetSum, path, ans);
        return ans;

    }

    public void pathSum(Node root, int targetSum, List<Integer> path, List<List<Integer>> ans) {
        if(root == null) {
            return;
        }
        path.add(root.data);
        targetSum -= root.data;
        if(targetSum == 0 && root.left == null && root.right == null) {
            ans.add(new ArrayList<>(path));
        }
        pathSum(root.left, targetSum, path, ans);
        pathSum(root.right, targetSum, path, ans);
        path.remove(path.size()-1);
    }






  public static void printPath(ArrayList<Integer> path) {
    for(int i = 0; i < path.size(); i++) {
      System.out.print(path.get(i) + "-> ");
    }
    System.out.println("Null");
  }
  public static void printRoot2leaf(Node root, ArrayList<Integer> path) {
    if(root == null) {
      return;
    }
    path.add(root.data);
    if(root.left == null && root.right == null) {
      printPath(path);
    }
    printRoot2leaf(root.left, path);
    printRoot2leaf(root.right, path);
    path.remove(path.size()-1);

  }

  

  public static boolean isValidBST(Node root, Node min , Node max){
    if(root == null){
      return true;
    }
    if(min != null && root.data <= min.data){
      return false;
    }
    else  if(max != null && root.data >= max.data){
      return false;
    }
    return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
  }



  public static int ClosestElementInBST(Node root, int target) {
    if(root == null) {
      return -1;
    }

    // int closest = root.data;
    // while(root != null) {
    //   if(Math.abs(root.data - target) < Math.abs(closest - target)) {
    //     closest = root.data;
    //   }
    //   if(root.data > target) {
    //     root = root.left;
    //   } else {
    //     root = root.right;
    //   }
    // }

    // using recursion 

    int closest = root.data;
    closest = Math.min(closest, ClosestElementInBST(root.left, target));
    closest = Math.min(closest, ClosestElementInBST(root.right, target));
    return closest;
  }
  
  public static void main(String[] args) {
    int values[] = {8,5,3,1,4,6,10,11,14};
    Node root = null; 

    for(int i = 0; i < values.length; i++){
      root = insert(root, values[i]);
    } 

    inorder(root);    
System.out.println();
    // System.out.println(search(root, 5));
    // if(search(root, 5)) {
    //   System.out.println("Found");
    // } else {
    //   System.out.println("Not Found");
    // }

    // delete(root, 1);
    // System.out.println();
    // inorder(root);

    // printInRange(root, 3, 7);

    // printRoot2leaf(root, new ArrayList<Integer>());

    // System.out.println(isValidBST(root, null, null));


  }
}
