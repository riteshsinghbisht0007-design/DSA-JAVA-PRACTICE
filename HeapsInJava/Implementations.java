package HeapsInJava;

import java.util.PriorityQueue;

public class Implementations {

  // this is a comparable student class 
  static class Student implements Comparable<Student> { // function overriding --> parent class ya fir parent interface se jab koi parent aata hai jisko child class bhi implement karti hai toh usse override kehte hai ............
    String name;
    int rank;

    public Student(String name, int rank) {
      this.name = name;
      this.rank = rank;
    }

    @Override 
    public int compareTo(Student s2) {
      return this.rank - s2.rank;
    }
  }


  public static void main(String[] args) {
    PriorityQueue<Student> pq = new PriorityQueue<>();
    pq.add(new Student("A", 1));
    pq.add(new Student("B",5));
    pq.add(new Student("C", 3));
    pq.add(new Student("D", 12));
    
    while((!pq.isEmpty())) {
      System.out.println(pq.peek().name + "  ->  " + pq.peek().rank + ""); // o(1)
      pq.remove(); // O(logn)
    }
  }
} 
