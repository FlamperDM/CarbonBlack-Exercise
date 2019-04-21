/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Flampeyeiry Diaz
 */
public class Queue implements IQueue{
    private Node first, last;
    private int count = 0;

    @Override
    public void queue(int number) {
        Node node = new Node(number);
        if (first == null) first = node;
        else last.next = node;
        last = node;
        count++;
    }

    @Override
    public Integer dequeue() {
        if (first == null) return null;
        
        int value = first.number;
        Node dispatch = first;
        first = first.next;
        
        dispatch.next = null;
        dispatch = null;
        
        if (first == null) last = null;

        if (count > 0) count--;
        
        return value;
    }

    @Override
    public int count() {
        return count;
    }
}
