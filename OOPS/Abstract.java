package OOPS;

public class Abstract {
  public static void main(String[] args) {

      Mustang myHorse = new Mustang();
      // Animal -> Horse -> Mustang
  }
}

abstract class Animal {

  String color;
  Animal(){
   System.out.println("animal constructor called");
  }
  void eat(){
    System.out.println("Animal eats");
  }

  abstract void walk();
}

class Horse extends Animal{

  Horse(){
    System.out.println("Horse constructor called");
  }
  void changeColor(String color){
    color = "dark brown";
  }
  void walk(){
    System.out.println("Walks on 4 legs");
  }
}

class Mustang extends Horse{
  Mustang(){
    System.out.println("Mustang constructor called");
  }
}
class Chicken extends Animal{
  void changeColor(String color){
    color = "white";
  }
  void walk(){
    System.out.println("Walks on 2 legs");
  }
}
