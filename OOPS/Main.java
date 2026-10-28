package OOPS;

public class Main {
    public static void main(String[] args) {
      Pen p1 = new Pen(); // created a pen object of class Pen
      p1.setColor("Blue");
      System.out.println(p1.color);
      p1.setTip(5);
      System.out.println(p1.tip);

      BankAccount myAcc = new BankAccount();
      myAcc.username = "Pankaj";
      myAcc.setPassword("sdfshdfk");
    
}
}
class BankAccount {
  public String username;
  private String password;
  public void setPassword(String newPassword){
    password = newPassword;
  }

}
  
  class Pen{
    String color;
    int tip;

    String getColor(){
      return this.color;
    }

    int getTip(){
      return this.tip;
    }

    void setColor(String newColor){
      this.color = newColor;
    }
    void setTip(int newTip){
      this.tip = newTip;
    }

    class Student {
      String name;
      int age;
      float percentage;

      void calcPercentage(int marks1, int marks2, int marks3){
        percentage = (marks1 + marks2 + marks3)/3;
      }
    }
  
}
