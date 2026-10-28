package GreedyAlgorithm;

import java.util.Arrays;

public class LexicographicallySmallestString {

  static String getLexicographicallySmallestString(int n, int k) {
     char res[] = new char[n];
        Arrays.fill(res, 'a');
        k -= n;
        
        while(k > 0){
            res[n-1] += Math.min(25, k);
            k -= Math.min(25, k);
            n--;
        }
        return String.valueOf(res);
  }
  public static void main(String[] args) {
     int  n = 5;
     int  k = 73;
     System.out.println(getLexicographicallySmallestString(n,k));
  }
}
