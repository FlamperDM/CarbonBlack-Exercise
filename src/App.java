/**
 *
 * @author Flampeyeiry Diaz
 * 
 * 
 Basic Data Types
Home-study problem.
Duration 60 minutes
 
Please return the solution via email. 
 
Please implement this in your programming language of choice (Java, python, c, c++).
 
The following are not good answers:
1.	copied solutions from the internet/textbook
2.	simply call STL functions or use Stack/Queue classes from an existing library
 
Exercise to Do: 

* Implement an object that has methods called ‘Push’ and ‘Pop’.  
* This object should be able to handle having integer values passed to Push 
* and should be able to give back an integer value from Pop in “stack order” (i.e. Last in First out - LIFO).
 

* Now implement an object or extend the previous object to implement methods called ‘Queue’ and ‘Dequeue’.  
* This object should also be able to handle integer values passed to Queue and 
* should be able to give back an integer value from Dequeue in “queue order” (i.e. First In, First Out - FIFO).
*
* 
 */

public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //testQueue();
        //testStack();
        //testQueueMadeWithStack();
        testStackMadeWithQueue();
        //testMixStackQueue();
    }
    
    public static void testQueue(){
        System.out.println("Queue");

        Queue queue = new Queue();
        queue.queue(12);
        queue.queue(13);
        queue.queue(14);
        queue.queue(15);
        
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        
        queue.queue(16);
        queue.queue(17);
        
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
    
    public static void testStack(){
        System.out.println("Stack");
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
        System.out.println(stack.pop());
        
        stack.push(16);
        stack.push(17);
        
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
    
    public static void testMixStackQueue(){
        System.out.println("MIX");
        Queue queue = new Queue();
        Stack stack = new Stack();
        
        queue.queue(12);
        queue.queue(13);
        stack.push(12);
        stack.push(13);
        stack.push(14);
        queue.queue(14);
        queue.queue(15);
        stack.push(15);
        
        
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        
        queue.queue(16);
        
        
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        
        
        
        
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        
        stack.push(16);
        stack.push(17);
        queue.queue(17);
        
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }    

    private static void testQueueMadeWithStack() {
        System.out.println("Queue made with stack");
        
        QueueMadeWithStack queue = new QueueMadeWithStack();
        
        queue.queue(12);
        queue.queue(13);
        queue.queue(14);
        queue.queue(15);
        
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        
        queue.queue(16);
        queue.queue(17);
        
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }

    public static void testStackMadeWithQueue(){
        System.out.println("Stack Made With Queue");

        StackMadeWithQueue stack = new StackMadeWithQueue();
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.push(15);

        System.out.println(stack.pop());
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
