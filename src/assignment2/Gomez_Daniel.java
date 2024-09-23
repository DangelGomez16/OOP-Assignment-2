// Daniel A. Gomez
package assignment2;

public class Gomez_Daniel {

	public static void main(String[] args) {
		// The array that stores how many times a roll's outcome has been produced is declared
		// and initialized. 
		int rollNum = 13;
		int[] arr = new int[rollNum];
		
		// The dice are rolled a thousand times, each time calling the Dice class and executing it's
		// roll method which returns the sum of two die rolls.
		for(int i = 0; i < 1000; i++) {
			Dice dieRoll = new Dice();
			int roll = dieRoll.value(); 
			
			// Knowing the roll will always be between 2 and 12, the result of the roll becomes the index
			// for the array which increases it's counting total of rolls represented by the index by one.
			arr[roll]++; 
		}
		
		// Prints out the number of rolls made for every possible outcome of the dice rolls.
		for(int i = 2; i < rollNum; i++) {
		System.out.println("Number of " + i + "s are " + arr[i]);
		}
		
		// A graph is printed out which displays how many times a given dice outcome was produced. The y 
		// axis begins at 150 and goes down to 0. Whenever the y axis goes down a digit place, a space is 
		// added between the left most side of the screen and the y axis number. 
		int yAxis = 150;
		System.out.println("Graph");
		while(yAxis >= 0) {
			if(yAxis >= 100)
				System.out.print(yAxis + "|");
			if(yAxis < 100) {
				if(yAxis >= 10)
					System.out.print(" " + yAxis + "|");
				else
					System.out.print("  " + yAxis + "|");
			}					
			
			// Going index by index, if an array index is storing a number greater than the current
			// y axis, a star is printed. Otherwise, a space is printed, and after, two spaces are printed.
			for(int i = 2; i < rollNum; i++) {
				if(arr[i] >= yAxis)
					System.out.print("*");
				else
					System.out.print(" ");
				
				System.out.print("  ");
			}
			
			// The y axis is decreased by 25 and the while loop continues line by line until it gets below zero.
			System.out.println("");
			yAxis -= 25; 
		}
		
		// The base of the graph is printed out to be in alignment with the y axis and stars. 
		System.out.println("    --------------------------------");
		System.out.println("    2  3  4  5  6  7  8  9  10 11 12 ");
	}

}
