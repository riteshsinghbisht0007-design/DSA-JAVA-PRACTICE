  package ArraysInJava;
  public class ReviseArray {
    public static int[] productExceptSelf(int[] nums) {
      int product = 1;
      int[] result = new int[nums.length];
      for (int i = 0; i < nums.length; i++) {
        result[i] = product;
        product *= nums[i];
      }
      product = 1;
      for (int i = nums.length - 1; i >= 0; i--) {
        result[i] *= product;
        product *= nums[i];
      }
      return result;
    }

    public int pivotIndex(int[] nums) {
      int totalSum = 0;
      int leftSum = 0;
      for (int num : nums) {
        totalSum += num;
      }
      for (int i = 0; i < nums.length; i++) {
        totalSum -= nums[i];
        if (leftSum == totalSum) {
          return i;
        }
        leftSum += nums[i];
      }
      return -1;
    }

    public double myPow(double x, int n) {
        if(n == 0) {
            return 1;
        }
        if(n < 0) {
            return 1 / myPow(x, -n);
        }
        double half = myPow(x, n / 2);
        if(n % 2 == 0) {
            return half * half;
        }
        return half * half * x;
    }
    public static boolean powerOfTwo(int n) {
      // using recursion 
// input = 3
// 3/2 = 1
// 1/2 = 0

      if (n == 0) {
        return false;
      }

      if (n == 1) {
        return true;
      }
      return powerOfTwo(n % 2);
    }
    public static void main(String[] args) {
      // product of array except self 

      int[] nums = {1, 2, 3, 4};
      int[] result = productExceptSelf(nums);
      for (int i = 0; i < result.length; i++) {
        System.out.print(result[i] + " ");
      }
    }
  }