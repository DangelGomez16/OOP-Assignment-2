// Daniel A. Gomez
package assignment2;
import java.util.Random;

// This class is for individual dies and die rolls.
public class Die {
	
	// faceValue stores the roll of the die. 
	private int faceValue; 
	
	public Die() {
		
		// Initiates faceValue.
		int faceValue;
	}
	
	// Sets faceValue to one as required by instruction. 
	public void setFaceValue() {
		faceValue = 1;
	}
	
	// Sets faceValue to a random integer between 1 and 7. 
	public void roll() {
		Random random = new Random();
		faceValue = random.nextInt(1, 7);
	}
	
	// Returns faceValue.
	public int getFaceValue() {
		return faceValue; 
	}
}
