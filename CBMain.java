public class CBMain {
  public static void main(String[] args) {
      testQueue();
      testStack();
  }
  
  public static void testQueue(){
      System.out.println("Testing Queue");
      
      Queue queue = new Queue();
      queue.queue(12);
      queue.queue(13);
      queue.queue(14);
      queue.queue(15);
      
      System.out.println(queue.dequeue());
      System.out.println(queue.dequeue());
      System.out.println(queue.dequeue());
      System.out.println(queue.dequeue());
      
      queue.queue(16);
      queue.queue(17);
      
      System.out.println(queue.dequeue());
      System.out.println(queue.dequeue());
  }
  
  public static void testStack(){
      System.out.println("Testing Stack");
      Stack stack = new Stack();
      stack.push(12);
      stack.push(13);
      stack.push(14);
      stack.push(15);
      
      System.out.println(stack.pop());
      System.out.println(stack.pop());
      System.out.println(stack.pop());
      System.out.println(stack.pop());
      System.out.println(stack.pop());
      
      stack.push(16);
      stack.push(17);
      
      System.out.println(stack.pop());
      System.out.println(stack.pop());
      System.out.println(stack.pop());
  }
}