/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matchboxcarsproject;

/**
 *
 * @author gmillard
 */
public class MainClass extends MatchBox { //inherit from the MatchBox class
    
    public static void main(String[] args) {
        
       Box boxObject = new Box(); // object in Box Class
       MatchBox matchObject = new MatchBox(); // object in Box class
              

      
       boxObject.width = 5; // parameters from the assignment 
       boxObject.height = 10;
       boxObject.depth = 3;
      

       TextIO.putln("width of matchbox is "+ boxObject.width); // printing out variables as per the assingment
       TextIO.putln("height of matchbox is "+ boxObject.height);
       TextIO.putln("width of matchbox is "+ boxObject.depth);

       matchObject.calculateWeight(); // call the calculateWeight method from MatchBox class
       boxObject.getVolume(); // call the getVolume method from the Box class
      
      
       
     
    }
}
    
