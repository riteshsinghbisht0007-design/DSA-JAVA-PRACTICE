package ArrayListInJava;

import java.util.ArrayList;

public class MostFrequent {
  public static int mostFrequent(ArrayList<Integer> list, int key) {
    for(int i=0; i<list.size()-1; i++){
      if(list.get(i) == key){
        int target = list.get(i+1);
        int count = 0;
        for(int j=0; j<list.size(); j++){
          if(list.get(j) == target){
            count++;
          }
          if (count > list.size()/2){
            return target;
          }
        }
        return target;

      }
    }
    return -1;
  }
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    // list.add(1);
    // list.add(100);
    // list.add(200);
    // list.add(1);
    // list.add(100);

    // 2 2 2 2 3
    list.add(2);
    list.add(2);
    list.add(2);
    list.add(2);
    list.add(3);

    int key = 2;

    System.out.println(mostFrequent(list, key));
  }
}
