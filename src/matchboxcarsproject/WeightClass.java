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
public class WeightClass extends MatchBox {
     void calculateWeight(){
        double wt;
        boxObject.width = 5;
        boxObject.height = 10;
        boxObject.depth = 3;
        wt = (boxObject.depth * boxObject.height * boxObject.width * wpci);
        
    
}
}
