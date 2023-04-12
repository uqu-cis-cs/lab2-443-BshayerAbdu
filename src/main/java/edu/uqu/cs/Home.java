package edu.uqu.cs;
/*
 * Lab 2 
 * CS 1312
 */

/*
* Make sure to complete and submit your lab
*/
import java.util.Scanner;

public class Home{
	public static void main(String [] args){
          ////// everything i added it, it just to be sure from my code. /////

		// Create an object of type Garage 
                //HERE
                Garage ga=new Garage();
	        // Add "Toyota Corolla Cross" in the garage. Hint: use method addCar () of class Garage
        

                ga.addcar("Toyota Corolla Cross");
                //List all the cars in the garage. Hint: use method listCars () of class Garage
                //HERE
                ga. listcars();
                System.out.println( "Countcars: "+ga.countcars);
                // Place "Ford Funsio" in the garage. Hint: use method addCar () of class Garage
                //HERE
                ga. addcar("Ford Funsio");
                ga.addcar("ford Funsio");
 	        // List all the cars in the garage once again. Hint: use method listCars () of class Garage
                //HERE
                ga.listcars();
                System.out.println("Countcars: "+ga.countcars);

               // Move out "Ford Fusion" from the garage. Hint: use method moveOut () of class Garage
               //HERE
               ga.moveout("Ford Funsio");

               // List all the cars in the garage. Hint: use method listCars () of class Garage
               //HERE
               ga.listcars();
               System.out.println("Countcars: "+ga.countcars);

        }

}