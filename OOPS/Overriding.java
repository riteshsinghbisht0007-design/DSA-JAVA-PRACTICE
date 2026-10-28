package OOPS;

public class Overriding {
  public static void main(String[] args) {
    Deer d = new Deer();
    d.eat();  
  }
}

class Animal {
  void eat() {
    System.out.println("Eating");
  }

}

class Deer extends Animal {
  void eat() {
    System.out.println("Eating grass");
  }
}
