package RecursionBasics;

public class FriendsPairing {
  public static int friendsPairing(int n){
  
    if(n == 0 || n == 1){
      return 1;
    }
    // choice
    // single
    int fm1 = friendsPairing(n-1);
    // pair
    int fm2 = friendsPairing(n-2) * (n-1);
    return fm1 + fm2;
  }
  public static void main(String[] args) {
    
    int n = 3;
    System.out.println(friendsPairing(n));
  }
}
  