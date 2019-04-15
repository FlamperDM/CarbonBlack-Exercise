public class Queue{
  private Node first, last;

  public void queue(int number) {
      Node node = new Node(number);
      if (first == null) first = node;
      else last.next = node;
      last = node;
  }

  public Integer dequeue() {
      if (first == null) return null;
      
      int value = first.number;
      Node dispatch = first;
      first = first.next;
      
      dispatch.next = null;
      dispatch = null;
      
      if (first == null) last = null;
      
      return value;
  }
}