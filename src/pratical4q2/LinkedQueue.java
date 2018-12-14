/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratical4q2;

/**
 *
 * @author B1
 */

//Chapter 1 example assignment

public class LinkedQueue<T> implements QueueInterface<T> {

    private int length;// Let us know when to stop to print the whole list
    private Node lastNode; //pointer
    
    //Initialize private data members
    public LinkedQueue(){
            length = 0;
            lastNode = null;
            
    }
        
    @Override
    public void enqueue(T newEntry) {
        
        //Create a newNode for newEntry
        Node newNode = new Node(newEntry);
        
        //Queue is empty
        if(lastNode == null){

            newNode.next = newNode; //pointing to itself
                   
        }else{
            
            newNode.next = lastNode.next;
            lastNode.next = newNode;
            
        }
        
        //Queue is not empty but only have one node left    
        //if(lastNode != null && lastNode.next == lastNode){
            
            //newNode.next = lastNode.next;
            //lastNode.next = newNode;
            
        //}
        
        lastNode = newNode;
        length++;
    }
    
    public String toString(){
        
        String output = "";
        int tempLength = length;
        Node currentNode = lastNode; //traversal pointer
        
        while(length > 0){
            
            output += currentNode.next.data;
            currentNode = currentNode.next;
            length--;
        }
        length = tempLength;
        
        return output;
        
    }

    @Override
    //Remove from the front AND Display accrocding from the front (not suggested to use because it will remove from the front)
    public T dequeue() {
        
        T result = null;
        
        if(lastNode == null){
            
            return result;
            
        }else
        //queue has only one node left
        if(lastNode != null && lastNode.next == lastNode){
            result = lastNode.data;
            lastNode = null;
            length--;
        }else
            //queue has more than one node
        {
            
            result = lastNode.next.data;
            lastNode.next = lastNode.next.next;
            length--;
            
        }
        
        return result;
    }

    @Override
    //Display accrocding from the front (suggested to use because it will not remove everthing)
    //Retrieve the first in the queue without removing
    public T getFront() {
        
        T result = null;
        
        if(lastNode == null){
            
            return result;
            
        }else
        //queue has only one node left
        if(lastNode != null && lastNode.next == lastNode){
            result = lastNode.data;
        }else
            //queue has more than one node
        {
            
            result = lastNode.next.data;
            
        }
        
        return result;
        
    }

    @Override
    public boolean isEmpty() {
       return (lastNode == null);
    }

    @Override
    public int getLength() {
        return length;
        
    }
    
    //private Node inner class
    private class Node{
        
        private T data;
        private Node next; //refering to itself
        
        //Default Construtor
        public Node(){
            
            this.data = null;
            this.next = null;
            
        }
        
        //Second Construtor
        public Node(T data){
            
            this.data = data;
            this.next = null;
        }
        
        //Third Construtor
        public Node(T data, Node next){
            this.data = data;
            this.next = next;
        }
        
    }
}
