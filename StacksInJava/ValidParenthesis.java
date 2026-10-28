package StacksInJava;
import java.util.Stack;

public class ValidParenthesis {
  public static boolean isValid(String s){
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);


      // Check if the character is an opening bracket
      if (c == '(' || c == '{' || c == '[') {
        stack.push(c);
      } else {
        /// Check if the stack is empty or if  the top of the stack does not match the closing bracket
        if (stack.isEmpty()) {
          return false;
        }

        // Pop the top of the stack and check if it matches the closing bracket 
        char top = stack.pop();
        if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
          return false;
        }
      }
    }
    if (stack.isEmpty()) {
      return true;
    } else {
      return false;
    }
  }
  public static void main(String[] args) {
    String str = "(){}[]";
    System.out.println(isValid(str));
  }
}
