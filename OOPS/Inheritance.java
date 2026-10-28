package OOPS;

public class Inheritance {
  public static void main(String[] args) {
    Dog jenny = new Dog();
    jenny.color = "Black";
    jenny.breed = "German Shepherd"; 
  }
}

class Mammals extends Animal{
  void walk(){
    System.out.println("Walking");
  }
}
class fish extends Animal{
  void swim(){
    System.out.println("Swimming");
  }
}

class Bird extends Animal{
  void fly(){
    System.out.println("Flying");
  }
}

class Dog extends Mammals{
  String breed;
}

// Base class 
class Animal{
  String color;

  void eat(){
    System.out.println("Eating");
  }
  
  void breathe(){
    System.out.println("Breathing");
  }
}

// Derived class / subclass
// class Fish extends Animal{

//   int fins;



//   void swim(){
//     System.out.println("swims in water");
//   }
// }
