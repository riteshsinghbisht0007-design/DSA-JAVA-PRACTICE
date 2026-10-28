package ArrayListInJava;
import java.util.ArrayList;
public class Class {
  public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
    int temp = list.get(idx1);
    list.set(idx1, list.get(idx2));
    list.set(idx2, temp);
  }
  public static void main(String[] args) {

    // java collection framework 

    // ClassName objectName = new ClassName();

    ArrayList<Integer> list = new ArrayList<>();
    ArrayList<String> list1 = new ArrayList<>();
    ArrayList<Boolean> list2 = new ArrayList<>();

    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    

    System.out.println(list);

    // get operation 
    int element = list.get(2);
    System.out.println(element);

    // remove element 
    list.remove(2);
    System.out.println(list);
    
    // set element at index 
    list.set(2, 20);
    System.out.println(list);

    // contain element or not 
    System.out.println(list.contains(20));

    // size of arraylist 
    System.out.println(list.size());

    // print the arralist 
    for(int i=list.size()-1; i>=0; i--) {
      System.out.print(list.get(i) + " ");
    }
    System.out.println();
     

    // Maximum in arraylist 
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for(int i=0; i<list.size(); i++) {
      if(list.get(i) > max) {
        max = list.get(i);
      }
    }
    for(int i=0; i<list.size(); i++) {
     min = Math.min(min, list.get(i));
    }
    System.out.println(max);
    System.out.println(min);

    // swap two numbers  of given indices 
    int idx1 = 1;
    int idx2 = 3;
    System.out.println(list);
    swap(list, idx1, idx2);
    System.out.println(list);
  }
}
