/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Flampeyeiry Diaz
 */
public class Stack implements IStack{
    private Node first;
    private int count = 0;

    @Override
    public void push(int number) {
        Node node = new Node(number) {};
        node.next = first;
        first = node;
        count++;
    }
    
    @Override
    public Integer pop() {
        if (first == null) return null;
        
        int value = first.number;
        
        Node dispatch = first;
        
        first = dispatch.next;
        dispatch.next = null;
        dispatch = null;
        
        if (count > 0) count--;
        
        return value;
    }

    @Override
    public int count() {
        return count;
    }
    
}
