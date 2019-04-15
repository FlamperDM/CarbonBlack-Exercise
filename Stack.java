public class Stack{
  private Node first;

  public void push(int number) {
      Node node = new Node(number) {};
      node.next = first;
      first = node;
  }

  public Integer pop() {
      if (first == null) return null;
      
      int value = first.number;
      
      Node dispatch = first;
      
      first = dispatch.next;
      dispatch.next = null;
      dispatch = null;
      
      return value;
  }
}