package HashingInJavaa;
import java.util.*;
public class HashmapCode {

  static class HashMap<K, V> { // generic class
    private class Node {
      K key;
      V value;
      

      Node(K key, V value) {
        this.key = key;
        this.value = value;
      }
    }
    private int n; // n
    private int N;
    private LinkedList<Node>[] buckets; // N

    @SuppressWarnings("unchecked")
    public HashMap() {
      this.n = 4;
      this.N = 4;
      this.buckets = new LinkedList[4];
      for (int i = 0; i < 4; i++) {
        this.buckets[i] = new LinkedList<>();
      }
    }

    private int hashfunction(K key) {
      int hc = key.hashCode();
      return Math.abs(hc) % buckets.length;

    }

    private int SearchInLL(K key, int bi) {
      LinkedList<Node> ll = buckets[bi];
      int di = -1;

      for (int i = 0; i < ll.size(); i++) {
        Node node = ll.get(i);
        if (node.key == key) {
          return di;
        }
        di++;
      }
      return -1;
    }


    @SuppressWarnings ("unchecked")
    private void rehash() {
      LinkedList<Node>[] oldBuck = buckets;
      buckets = new LinkedList[N * 2];
      N = N * 2;
      for (int i = 0; i < buckets.length; i++) {
        buckets[i] = new LinkedList<>();
      }
      // nodes -> add in bucket 
      n = 0;
      for (int i = 0; i < oldBuck.length; i++) {
        LinkedList<Node> ll = oldBuck[i];
        for (int j = 0; j < ll.size(); j++) {
          Node node = ll.get(j);
          put(node.key, node.value);
        }
      }
    }
    public void put(K key, V value){ // O(1)
      int bi = hashfunction(key); // 0 to size-1 
      int di = SearchInLL(key, bi); // valid; -1

      if(di != -1){ // found
        Node node = buckets[bi].get(di);
        node.value = value;
      }else{ // not found
        buckets[bi].add(new Node(key, value));
        n++;
      }

      double lamda = (double)n/N;
      if(lamda > 2.0){
        rehash();
      }

      

    }

    public boolean containsKey(K key){ // O(1)
      int bi = hashfunction(key); // 0 to size-1 
      int di = SearchInLL(key, bi); // valid; -1

      if(di != -1){ // found
        return true;
      }else{ // not found
        return false;
      }
    }

    public V remove(K key){ // O(1)
      int bi = hashfunction(key); // 0 to size-1 
      int di = SearchInLL(key, bi); // valid; -1

      if(di != -1){ // found
        Node node = buckets[bi].remove(di);
        n--;
        return node.value;
      }else{ // not found
        return null;
      }
    }
    public V get(K key){ // O(1)
      int bi = hashfunction(key); // 0 to size-1 
      int di = SearchInLL(key, bi); // valid; -1

      if(di != -1){ // found
        Node node = buckets[bi].get(di);
        return node.value;
      }else{ // not found
        return null;
      }
    }

    public ArrayList<K> keys(){
      ArrayList<K> keys = new ArrayList<>();
      for(int i=0; i<buckets.length; i++){
        LinkedList<Node> ll = buckets[i];
        for(int j=0; j<ll.size(); j++){
          Node node = ll.get(j);
          keys.add(node.key);
        }
      }
      return keys;
    }

    public boolean isEmpty(){
      return n==0;
    }

    
  }
  public static void main(String[] args) {
    HashMap<String, Integer> map = new HashMap<>();
    map.put("India", 1000);
    map.put("USA", 2000);
    map.put("Russia", 3000);
    map.put("China", 4000);
    map.put("Japan", 5000);

    ArrayList<String> keys = map.keys();

    for (String k : keys) {
      System.out.println("key = " + k + " value = " + map.get(k));
    }

    System.out.println(map.containsKey("India"));

    System.out.println(map.remove("Russia"));

    System.out.println(map);

    System.out.println(map.isEmpty());  


  }
}
