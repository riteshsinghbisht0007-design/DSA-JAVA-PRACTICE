package ArraysInJava;

public class FindSqrt {
  public static int SqrtOfNum(int n){
    int st = 0;
    int end = n;
    int ans = -1;

    while(st<=end){
      int mid = st + (end-st)/2;
      int sqr = mid*mid; // use long here to avoid integer overflow for large n
      
      if(sqr == n){
        return mid;
      } else if(sqr < n){
        ans = mid;
        st = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return ans;
  }
  public static void main(String[] args) {
    int n = 37;
    int result = SqrtOfNum(n);
    System.out.println("Square root of " + n + " is: " + result);
  }
}
