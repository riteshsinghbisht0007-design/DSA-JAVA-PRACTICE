package RecursionBasics;

public class FirstOccur {

  public static int firstOccur(int arr[], int i, int key) {
    if (i == arr.length) {
      return -1;
    }
    if (arr[i] == key){
      return i;
    } else {
      return firstOccur(arr, i + 1, key);
    }
  }

  public static int lastOccur(int arr[], int i, int key) {
    if (i == arr.length) {
      return -1;
    }
    int isFound = lastOccur(arr, i + 1, key);
    if (isFound != -1) {
      return isFound;
    }
    if (arr[i] == key) {
      return i;
    }
    return -1;
  }
  public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    int key = 17;
    System.out.println("Key is at index: " + firstOccur(arr, 0, key));
    System.out.println("Key is at index: " + lastOccur(arr, 0, key));
  }
}  
