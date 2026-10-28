package OOPS;

public class SuperKeyword {
  public static void main(String[] args) {
    Horse h = new Horse();
    
  }
}




class Animal{
  Animal(){
    System.out.println("animal constructor called");
  }
}

class Horse extends Animal{
  Horse(){
    super();
    System.out.println("Horse constructor called");
  }
}