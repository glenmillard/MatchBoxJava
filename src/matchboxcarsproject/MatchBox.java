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
public class MatchBox extends Box { //inherits from the Box class
    Box boxObject = new Box();  // reference to objects in Box class
    double wpci = 0.03611; // set the variable for the multipler - weight of water
    
    
    void calculateWeight(){ // calculate weight method
        double wt;
         
        boxObject.width = 5;
        boxObject.height = 10;
        boxObject.depth = 3;
        wt = (boxObject.depth * boxObject.height * boxObject.width * wpci); //volume times weight of water
        TextIO.putln("The Weight of the box is " + wt +" lb"); //output to the screen 
        //TextIO.putln("The Volume is "+ (wt/wpci) ); // output to the screen - I left this in
        
       
}

   
    
    
}
