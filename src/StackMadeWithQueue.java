//I used my own stack and queue to do the homework.
public class StackMadeWithQueue implements IStack {
    private Queue queue = new Queue();
    private Queue copyQueue = new Queue();
    private int count = 0;

    @Override
    public void push(int number) {
        queue.queue(number);
        count++;
    }

    @Override
    public Integer pop() {
        if (count < 1) return  null;

        int number = takeLasttNumber();

        if (count > 0) count--;

        return number;
    }

    @Override
    public int count() {
        return count;
    }

    private int takeLasttNumber(){
        int number;

        for (int i = 0; i < count-1; i++){
            copyQueue.queue(queue.dequeue());
        }

        number = queue.dequeue();
        queue = copyQueue;
        return  number;
    }
}
