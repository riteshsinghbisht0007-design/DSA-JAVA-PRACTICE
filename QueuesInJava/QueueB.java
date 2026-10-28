package QueuesInJava;

public class QueueB {
  
   static class Queue{
    static int arr[];
    static int size;
    static int rear;
    static int front;


    Queue(int n){
      arr = new int[n];
      size = n;
      rear = -1;
      front = -1;
    }

    public static boolean isEmpty(){
      return rear == -1;
    }

    public static boolean isFull2(){
      return (rear+1)%size == front;
    } 

    public static boolean isFull(){
      return rear == size-1;
    }

    // add 
    public static void add(int data){
      if(isFull()){
        System.out.println("Queue overflow");
        return;
      }
      // add first element
      if(front == -1){
        front = 0;
      }
      rear = (rear+1)%size; // 0
      arr[rear] = data;
    }

    // remove
    public static int remove(){
      if(isEmpty()){
        System.out.println("Queue underflow");
        return -1;
      }


      int result = arr[front];
      front = (front+1)%size;

      // last element 
      if(front == rear){
        front = -1;
        rear = -1;
      } else {
        front = (front+1)%size;
      }
      return result;
    }

    // peek 
    public static int peek(){
      if(isEmpty()){
        System.out.println("Queue underflow");
        return -1;
      }
      return arr[front];
    }
  }
  public static void main(String[] args) {
      Queue q = new Queue(5);
      q.add(10);
      q.add(20);
      q.add(30);
      q.add(40);
      q.add(50);
      while(!q.isEmpty()){
        System.out.println(q.peek());
        q.remove();
      }
  }
}
