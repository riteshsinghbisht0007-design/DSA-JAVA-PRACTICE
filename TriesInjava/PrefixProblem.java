package TriesInjava;

public class PrefixProblem {
  static class Node{
    Node children[] = new Node[26];
    boolean isEndOfWord = false;
    int freq;

    Node(){
      for(int i = 0; i < 26; i++){
        children[i] = null;
      }
      freq = 1;
    }
  }

  public static Node root = new Node();


  public static void insert(String word){
    Node curr = root;
    for(int i = 0; i < word.length(); i++){
      int index = word.charAt(i) - 'a';
      if(curr.children[index] == null){
        curr.children[index] = new Node();
      } else{
        curr.children[index].freq++;
      }
    curr = curr.children[index];
    }
    curr.isEndOfWord = true;
  }
  
  public static void findPrefix(Node root, String ans){
    if(root == null){
      return;
    }
    if(root.freq == 1){
      System.out.println(ans);
    }
    for(int i=0; i<root.children.length; i++){
      if(root.children[i] != null){
        findPrefix(root.children[i], ans + (char)('a' + i));
      }
    }
  }

  public static boolean StartsWith(String word){
    Node curr = root;
    for(int i = 0; i < word.length(); i++){
      int index = word.charAt(i) - 'a';
      if(curr.children[index] == null){
        return false;
      }
      curr = curr.children[index];
    }
    return true;
  }
  public static void main(String[] args) {
    String words[] = {"the", "a", "there", "any", "thee"};

    for(int i = 0; i < words.length; i++){
      insert(words[i]);
    }

    root.freq = -1;
    findPrefix(root, "");

    System.out.println(StartsWith("the"));


  }
}
