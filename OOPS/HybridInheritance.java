package OOPS;

public class HybridInheritance {
  public static void main(String[] args) {

    Tuna tuna = new Tuna();
    tuna.eat();
    tuna.breathe();
    tuna.swim();
    tuna.fast();

    Shark shark = new Shark();
    shark.eat();
    shark.swim();
    shark.Big();

    Peacock peacock = new Peacock();
    peacock.eat();
    peacock.breathe();
    peacock.fly();
    peacock.sing();

    Dog dog = new Dog();
    dog.eat();
    dog.breathe();
    dog.walk();
    dog.bark();

    Cat cat = new Cat();
    cat.eat();
    cat.breathe();
    cat.walk();
    cat.meow();
}
}

class Animal {
  void eat() {
    System.out.println("Eating");
  }

  void breathe() {
    System.out.println("Breathing");
  }
}

class Fish extends Animal{
  int fins;
  void swim(){
    System.out.println("Swimming");
  }
}
class Tuna extends Fish{
  void fast(){
    System.out.println("Fast Powerful fish");
  }
}

class Shark extends Fish{
  void Big(){
    System.out.println("Big in size");
  }
}


class Mammals extends Animal{
  void walk(){
    System.out.println("Walking");
  }
}

class Dog extends Mammals{
  void bark(){
    System.out.println("Barking");
  }
}

class Cat extends Mammals{
  void meow(){
    System.out.println("Meowing");
  }
}

class bird extends Animal{
  void fly(){
    System.out.println("Flying");
  }
}

class Peacock extends bird{
  void sing(){
    System.out.println("Singing");
  }
}


