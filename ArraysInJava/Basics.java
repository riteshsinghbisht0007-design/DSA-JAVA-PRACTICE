package ArraysInJava;

public class Basics {
  public static int linearSearch(int numbers[], int key){
    for(int i = 0; i < numbers.length; i++){
      if(numbers[i] == key){
        return i;
      }
    }
    return -1;
             
  }
  public static void main(String[] args) {
    int numbers[] = {2,4,6,8,10,12,14,16};
    int key = 90;
    System.out.println("Key is at index: " + linearSearch(numbers, key));
  }
}
 