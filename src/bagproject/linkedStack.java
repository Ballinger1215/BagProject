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
public class linkedStack {
    
    public Node top;
    
    public linkedStack(){
        
        top = null;
        
    }
    
    public void Push(String item){
        
        Node newNode = new Node(item);
        newNode.next = top;
        top = newNode;
        
    }
    
    public String Pop(){
        
        return "";
    }
    
}
