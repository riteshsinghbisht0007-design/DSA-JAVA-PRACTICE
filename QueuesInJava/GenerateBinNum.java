package QueuesInJava;
import java.util.*;
public class GenerateBinNum {
   static ArrayList<String> generateBin(int n) {
     ArrayList<String> ans = new ArrayList<>();

     Queue<String> q = new LinkedList<>();
      q.add("1");
      while(n-- > 0){
        String temp = q.remove();
        ans.add(temp);
        q.add(temp + "0");
        q.add(temp + "1");
        
      }
      return ans;
  }
  public static void main(String[] args) {
    int n = 3;
    ArrayList<String> res = generateBin(n);
    System.out.println(res);   
    }
  
}