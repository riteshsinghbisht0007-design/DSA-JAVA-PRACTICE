package ArraysInJava;

public class LargestNum {
  public static int getlargest(int nums[]) {
    int largest = Integer.MIN_VALUE;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > largest) {
        largest = nums[i];
      }
    }
    return largest;

  }
  public static void main(String[] args) {
    int nums[] = {1, 2, 3, 6, 9,4};
    System.out.println(getlargest(nums)); 
  }
}
