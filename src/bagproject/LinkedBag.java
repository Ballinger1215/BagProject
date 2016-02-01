/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bagproject;

/**
 *
 * @author mbolli4593
 */
public class LinkedBag {
    private Node firstNode;
    private int numberOfEntries;
    
    public LinkedBag() {
        firstNode = null;
        numberOfEntries = 0;
    }
    
    public void add(String dataPortion) {
        
        Node newNode = new Node(dataPortion);
        
        newNode.next = firstNode;
        
        firstNode = newNode;
        
        numberOfEntries++;
        
        //System.out.println("created first node");
    }
    
    public void remove() {
        
        if(numberOfEntries>0){
            
        firstNode = firstNode.next;
        
        numberOfEntries--;
        
        }else{
            
            System.out.println("Nothing to remove");
            
        }
    }
}
