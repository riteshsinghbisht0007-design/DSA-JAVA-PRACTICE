package LEETCODE_Practice;
import java.util.*;
public class LC349 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size1 = sc.nextInt();
    int size2 = sc.nextInt();
    int[] nums1 = new int[size1];
    int[] nums2 = new int[size2];

    // input
    for (int i = 0; i < size1; i++) {
      nums1[i] = sc.nextInt();
    }
    for (int i = 0; i < size2; i++) {
      nums2[i] = sc.nextInt();
    }

    int[] ans = new int[size1 + size2];
    int i = 0, j = 0, k = 0;
    while (i < size1 && j < size2) {
      if (nums1[i] < nums2[j]) {
        ans[k++] = nums1[i++];
      } else {
        ans[k++] = nums2[j++];
      }
    }
  }
}