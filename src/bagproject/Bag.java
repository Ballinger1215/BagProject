
package bagproject;

/**
 *
 * @author Mark Bollinger
 */
public class Bag <T> {
     private T Data[];  // this is the bag data array
    private static int Capacity = 10;   //this is the total capacity of the bag
    
    private int numberOfEntries = 0;  
    
    public Bag(){
        Data = (T[]) new Object[Capacity];
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

    public void add(T newData){
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
            Data[numberOfEntries] = null;
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
            Data[index] = null;
            for(int i=index; i<numberOfEntries-1; i++){
                Data[i] = Data[i+1];
            }
            numberOfEntries--;
            
            Data[numberOfEntries] = null;
            
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
    
    public void removeItem(T item){
        
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
