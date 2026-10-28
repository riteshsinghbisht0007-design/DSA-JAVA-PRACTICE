package GreedyAlgorithm;
import java.util.*;

public class MaxLengthChainOfPairs {

  // T.C = O(nlogn)
  
  public static void main(String[] args) {
    int pairs[][]= {{5, 24}, {39, 60}, {15, 28}, {27, 40}, {50, 90}};

    Arrays.sort(pairs, (a, b) -> (a[1] - b[1]));

    int chainLen = 1;
    int endPair = pairs[0][1]; // last selected pair end // chain end 

    for (int i = 1; i < pairs.length; i++) {
      if (pairs[i][0] > endPair) {
        chainLen++;
        endPair = pairs[i][1];
      }
    }
    System.out.println(chainLen);
  }
}
