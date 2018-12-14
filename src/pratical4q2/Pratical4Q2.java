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
public class Pratical4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //QueueInterface<Catalog> intQueue = new LinkedQueue<>(); in assignment
        QueueInterface<Integer> intQueue = new LinkedQueue<>();
        
        intQueue.enqueue(1);
        System.out.println(intQueue.getLength());
        System.out.println(intQueue.isEmpty());//testing is empty or not
        intQueue.enqueue(2);
        System.out.println(intQueue.getLength());
        intQueue.enqueue(3);
        System.out.println(intQueue.getLength());
        intQueue.enqueue(4);
        System.out.println(intQueue.getLength());
        intQueue.enqueue(5);
        System.out.println(intQueue.getLength());
        
        System.out.println();
        
        System.out.println(intQueue);// call toString function
        
        System.out.println();
        
        //Dequeue
        System.out.println(intQueue.dequeue());//1
        //getFront
        System.out.println(intQueue.getFront());//2
        System.out.println(intQueue.dequeue());//2
        System.out.println(intQueue.dequeue());//3
        System.out.println(intQueue.dequeue());//4
        System.out.println(intQueue.dequeue());//5
        System.out.println(intQueue.dequeue());//null
        System.out.println(intQueue.getLength());//0

        
    }
    
}
