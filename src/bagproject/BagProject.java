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
public class BagProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedBag myBag = new LinkedBag();
        myBag.add("Hello!");
        myBag.add("Hel");
        myBag.add("Hi!");
        myBag.add("jello!");
        myBag.add("low!");
        myBag.add("He!");
        myBag.add("frank");
        myBag.add("alrighty");
        myBag.add("then");
        
        myBag.remove();
        myBag.remove();
        myBag.remove();
        myBag.remove();
        myBag.remove();
        myBag.remove();
        myBag.remove();
        myBag.remove();
        myBag.remove();
//        TestIntegerBag();
//        TestStringBag();
    }
     
    public static void TestStringBag(){
        Bag<String> myBag = new Bag<String>();
        //Bag<T> myBag = new Bag<T>();
        //integerBag myBag = new IntegerBag();
        
        myBag.add("Mark");
        myBag.remove();
        System.out.println(myBag);
        myBag.clear();
    }
    
    public static void TestIntegerBag(){ 

//   System.out.println("Hello");
       int [] intarray = new int[10];
        intarray[0] = 10;
       intarray[1] = 1;
        
        IntegerBag myBag= new IntegerBag();
        
        myBag.add(10);
        myBag.add(12);
        myBag.add(1);
        myBag.add(2);
        myBag.add(3);
        myBag.add(4);
        myBag.add(5);
        myBag.add(6);
        myBag.add(7);
        
    //    myBag.remove();
    //    myBag.remove();
    //    myBag.remove();
    //    myBag.remove();
     //   myBag.remove();
     //   myBag.remove(); 
     //   myBag.remove();
     //   myBag.remove();
     //   myBag.remove();
     //   myBag.remove();
      
        
        //myBag.clear();
        
        System.out.println(myBag);
        
        myBag.removeAt(4);
        
        System.out.println(myBag);
        
        myBag.removeAt(0);
        
        System.out.println(myBag);
        
        
        
    
        
        
    
    }
    
}
