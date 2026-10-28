package TriesInjava;

public class WordBreakProblem {
  static class Node {
    Node children[] = new Node[26];
    boolean isEndOfWord = false;

    Node(){
      for(int i = 0; i < 26; i++){
        children[i] = null;
      }
    }
  }

  public static Node root = new Node();
  public static void insert(String word){
    Node curr = root;
    for(int i = 0; i < word.length(); i++){
      int index = word.charAt(i) - 'a';
      if(curr.children[index] == null){
        curr.children[index] = new Node();
      }
      curr = curr.children[index];
    }
    curr.isEndOfWord = true;
  }

  public static boolean search(String key){
    Node curr = root;
    for(int i = 0; i < key.length(); i++){
      int index = key.charAt(i) - 'a';
      if(curr.children[index] == null){
        return false;
      }
      curr = curr.children[index];
    }
    return curr.isEndOfWord;
  }

  public static boolean wordBreak(String key){
    if(key.length() == 0){
      return true;
    }
    for(int i=1; i<=key.length(); i++){
      // substring (beg idx, last idx )  (0,i)
      if(search(key.substring(0,i)) && wordBreak(key.substring(i))){
        return true;
      }
    }
    return false;
  }
  

  public static void main(String[] args) {
    String arr[] = {"i", "like", "sam", "samsung", "mobile", "ice"};
    for(int i=0; i<arr.length; i++){
      insert(arr[i]);
    }

    String key = "ilikesamsung";
    System.out.println(wordBreak(key));

  }
}
