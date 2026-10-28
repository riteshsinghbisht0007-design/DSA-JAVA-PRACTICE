package Revision;

import java.util.*;

public class Recursion {
  public List<List<Integer>> subsets(int[] nums, int[] ans, int index) {
      if(index == nums.length) {
          return List.of(new ArrayList<>());
      }
      List<List<Integer>> left = subsets(nums, ans, index+1);
      List<List<Integer>> right = subsets(nums, ans, index+1);
      return new ArrayList<>();
    }
  public static void main(String[] args) {
    int[] nums = {1, 2, 3};
    
}
