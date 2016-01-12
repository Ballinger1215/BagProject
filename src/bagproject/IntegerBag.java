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
public class IntegerBag {
    private int Data[];  // this is the bag data array
    private static int Capacity = 10;   //this is the total capacity of the bag
    
    private int numberOfEntries = 0;  
    
    public IntegerBag(){
        Data = new int[Capacity];
    }
    
    public int getCurrentSize(){
        return numberOfEntries;
    }
    
    public boolean isEmpty(){
        boolean result = false;
        if(numberOfEntries == 0)
            return true;
        else
            return false;
    }
//        return (numberOfEntries == 0);

    public void add(int newData){
        //if bag is full?
        if(numberOfEntries<Capacity)
        {
          //basic addition of data    
            Data[numberOfEntries] = newData;
            numberOfEntries++; // numberOfEntries = numberOfEntries+1;
        } else {
            System.out.println("Bag is full! Delete Something!");
        }
    }
    
    public void remove(){
        if(numberOfEntries>=0){
            Data[numberOfEntries] = 0;
            numberOfEntries--; //numberOfEntries = numberOfEntries-1;
        } else {
            System.out.println("Bag is empty! Add Something!");
        }
    }
    
    public void clear(){
        while(numberOfEntries<=0){
            remove();
        }
    }
 
}
