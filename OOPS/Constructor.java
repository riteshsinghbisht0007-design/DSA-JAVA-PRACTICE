package OOPS;

public class Constructor {
  public static void main(String[] args) {
    Student s1 = new Student();
   s1.name = "Shradha";
   s1.roll = 1;
   s1.password = "1234";
   s1.marks[0] = 100; 
   s1.marks[1] = 90;
   s1.marks[2] = 80;

   Student s2 = new Student(s1);
   s2.password = "12345";


   s1.marks[0] = 50;
   for(int i = 0; i < s1.marks.length; i++){
    System.out.println(s1.marks[i]);
   }

  }
  
}
class Student {
  String name;
  int roll;
  String password;
  int[] marks;
  


  // Shallow copy constructor
  // Student (Student s1){
  //   marks = new int[3];
  //   this.name = s1.name;
  //   this.roll = s1.roll;
  //   this.marks = s1.marks;

  // }

  // deep copy constructor 
  Student (Student s1){
    marks = new int[3];
    this.name = s1.name;
    this.roll = s1.roll;
    for(int i = 0; i < s1.marks.length; i++){
      this.marks[i] = s1.marks[i];
    }
  }


  Student(){
    marks = new int[3];
    System.out.println("Constructor called");
    
  }

  Student(String name){
    marks = new int[3];
    this.name = name;
  }
  Student(int roll){
    marks = new int[3];
    this.roll = roll;
  }
}
