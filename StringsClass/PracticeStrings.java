public class PracticeStrings {
  public static String Prefix(String str[]){
    String ref = str[0];
  
  for(int i=0; i<str.length;i++){
    int j=0;
    while(j<ref.length() && j<str[i].length() && ref.charAt(j) == str[i].charAt(j)){
      j++;
      
    }
    ref = ref.substring(0,j);
    if(ref.length() == 0){
      return "";
    }
  }
  return ref;
  }
  public static void main(String[] args) {
    
    // Longest common prefix 
  String []str = {"dog","racecar","car"};
    System.out.println(Prefix(str));
  }
}
