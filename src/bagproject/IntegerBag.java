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
        if(numberOfEntries>0){
            Data[numberOfEntries] = 0;
            numberOfEntries--; //numberOfEntries = numberOfEntries-1;
        } else {
            System.out.println("Bag is empty! Add Something!");
        }
    }
    
    public void clear(){
        while(numberOfEntries>0){
            remove();
        }
    }
    
    public void removeAt(int index) {
        
        if(numberOfEntries>index && index < Capacity){
            
            System.out.println("trying to remove at " + index);
            Data[index] = 0;
            for(int i=index; i<numberOfEntries-1; i++){
                Data[i] = Data[i+1];
            }
            numberOfEntries--;
            
            Data[numberOfEntries]=0;
            
        }else{
            
            System.out.println("nothing in the index");
        }
        
        System.out.println("Remove selected item");
    }
    public String toString(){
        
        String returnString = "";
        
        for(int i=0; i<numberOfEntries; i++){
            returnString = returnString + " " + "\n index " + i + Data[i];
        }
        
        return returnString;
    }
    
    public void removeItem(int item){
        
        boolean found = false;
        
        for(int i=0; i<numberOfEntries-1; i++){
            
        if (Data[i] == item) {
        
        }else{
            
            removeAt(i);
            found = true;
        }
        
        if (found==false){
            System.out.println("Item isn't found!");
        }else{
            System.out.println("Item is found!");
        }
        
      }
        
    }
    
}
