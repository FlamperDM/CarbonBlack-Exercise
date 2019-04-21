
//I used my own stack and queue to do the homework.
public class QueueMadeWithStack implements IQueue{
    private Stack stack = new Stack();
    private Stack reverseStack = new Stack();
    private int count = 0;
    private boolean toggle = false;
    
    @Override
    public void queue(int number) {
        if (toggle) {
            reverse();
            toggle = false;
        }
        stack.push(number);
        count++;
    }

    @Override
    public Integer dequeue() {
        if (count < 1) return null;
        int number;
        if (!toggle) {
            reverse();
            toggle = true;
        }

        number = stack.pop();
        if (count > 0) count--;

        return number;
    }

    @Override
    public int count() {
        return count;
    }
    
    private void reverse(){
        for (int i = 0; i < count; i++){
            reverseStack.push(stack.pop());
        }
        stack = reverseStack;
        reverseStack = new Stack();
    }
}