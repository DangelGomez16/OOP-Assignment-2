// Daniel A. Gomez
package assignment2;

// This class is for initiating dice and returning dice rolls.
public class Dice {
	
	// firDie and secDie are the dies used to make rolls.
	private Die firDie, secDie; 
	
	public Dice() {
		
		// The dies are initiated, and their faceValue is made 1.
		firDie = new Die();
		secDie = new Die(); 
		
		firDie.setFaceValue();
		secDie.setFaceValue();
	}
	
	// Each die is rolled and their result is returned. 
	public int value() {
		firDie.roll();
		secDie.roll();
		
		return  firDie.getFaceValue() + secDie.getFaceValue();
	}
	
}
