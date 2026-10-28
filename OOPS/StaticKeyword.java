package OOPS;

public class StaticKeyword {
  public static void main(String[] args) {
    Student s1 = new Student();
    s1.schoolName = "JMV";

    Student s2 = new Student();
    s2.setName("Shradha");

    Student s3 = new Student();
    s3.setName("Shradha");
  }
  
}
class Student{
  static int returnPercentage(int math, int phy, int chem){
    return (math+phy+chem)/3;
  }
  String name;
  int roll;

  static String schoolName;
  void setName(String name){
    this.name = name;
  }

  String getName(){
    return this.name;
  }
}


