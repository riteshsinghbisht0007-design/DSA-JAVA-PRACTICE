package BitManipulation;

public class SetBits {
  public static int countsetBits(int n) {
    int count = 0;
    while (n != 0) {
      n = n & (n - 1);
      count++;
    }
    return count;
  }

  public static int fastExpo(int a,int n){
    int ans = 1;
    while(n>0){
      if((n&1) != 0){
        ans = ans * a;
      }
      a = a * a;
      n = n >> 1;
    }
    return ans;
  }

  public static void main(String[] args) {
    System.out.println(fastExpo(5, 9));
  }
} 
