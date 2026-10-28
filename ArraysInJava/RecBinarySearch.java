package ArraysInJava;

public class RecBinarySearch {
  public static boolean recBinarySearch(int[] arr, int target, int stt, int end) {
    if (stt > end) {
      return false;
    }
    int mid = stt + (end - stt) / 2;
    if (arr[mid] == target) {
      return true;
    } else if (arr[mid] > target) {
      return recBinarySearch(arr, target, stt, mid - 1);
    } else {
      return recBinarySearch(arr, target, mid + 1, end);
    }
  }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 1;
        System.out.println(recBinarySearch(arr, target, 0, arr.length - 1));
        }
    }
 