package StacksInJava;
import java.util.Stack;
public class DuplicateParenthesis {
  public static boolean isDuplicate(String str){
    Stack<Character> stack = new Stack<>();

    for(int i=0; i<str.length(); i++){
      char ch = str.charAt(i);
      // if closing parenthesis is found
      if(ch == ')'){
        int count = 0; 
        while( stack.peek() != '('){
          stack.pop();
          count++;
        }
        if(count < 1){
          return true; // duplicate parenthesis found
        } else {
          stack.pop(); // pop the opening parenthesis
        }

      } else {
        stack.push(ch); // push the character onto the stack
      }

    }
    return false; // no duplicate parenthesis found
  }
  public static void main(String[] args) {
    String str = "((a+b))"; // (a+b) is duplicate parenthesis
    String str1 = "(a+(b)/c)"; // no duplicate parenthesis
    String str2 = "(a+b*(c-d))"; // no duplicate parenthesis

    System.out.println(isDuplicate(str));
    System.out.println(isDuplicate(str1));
    System.out.println(isDuplicate(str2));
  }
}
