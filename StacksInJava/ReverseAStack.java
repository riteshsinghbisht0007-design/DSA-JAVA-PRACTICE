package StacksInJava;
import java.util.Stack;

public class ReverseAStack {
  public static void pushAtBottom(Stack<Integer> stack, int data) {
    if(stack.isEmpty()) {
      stack.push(data);
      return;
    }
    int top = stack.pop();
    pushAtBottom(stack, data);
    stack.push(top);
  }
  public static void reverseStack(Stack<Integer> stack) {
    if (stack.isEmpty()) {
      return;
    }

    int topElement = stack.pop();
    reverseStack(stack);
    pushAtBottom(stack, topElement);
  }

  public static void printStack(Stack<Integer> stack) {
    Stack<Integer> tempStack = new Stack<>();
    while(!stack.isEmpty()) {
      int element = stack.pop();
      System.out.println(element);
      tempStack.push(element);
    }
  }
  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();
    stack.push(1);
    stack.push(2);
    stack.push(3);

    System.out.println("Original Stack:");
    printStack(stack);

    reverseStack(stack);
    System.out.println("Reversed Stack:");
    printStack(stack);
  }
}
