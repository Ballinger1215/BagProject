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
public class Node {
    
    public String data;
    public Node next;
    
    public Node(String dataPortion){
        
        this(dataPortion, null);
        
    }
    
    private Node(String dataPortion, Node nextNode){
        
        data = dataPortion;
        next = nextNode;
               
    }
}
