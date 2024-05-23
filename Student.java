/**
* The Student class is the subclass of Character Class.
* It contains variables and methods that determine the activities of Student in the game
*
* @author  Zaria Wong
* @version 1.0
* @since   2/20/2023
*/
public class Student extends Character{
	
	boolean hideornot = false;

	 /**
	   * This is a constructor to initialize objects. Below are the variables:
	   * @param characterName the name of Student
	   * @param power the power level of the Student
	   * @param energyLevel the energy level, which indicates the remaining energy of the Student.
	   */
	public Student(String characterName, int power, int energyLevel) {
		super(characterName, power, energyLevel);
	}

	 /**
	  * This method is called when student hides himself/herself from the next attack.
	  * Prints the the name of student + "hides itself from attacks!" on standard output.
	  */
	void hide() {
		System.out.println(characterName + " hides itself from attacks!");
		hideornot = true;
	}

	 /**
	   * This method is an overridden method. It specifies the behaviors of the Security Guard.
	   * If the student hide, attack from the Security Guard is not successful.
	   * Prints the the name of Security Guard + "hides from the attack!" on standard output.
	   * Otherwise, the student is attacked.
	   * @param amount This is the amount of energy reduced after the attack.
	   * Prints the amount of attack and remaining energy level.
	   */
	public void hurt(int amount) {
		if (hideornot == true) {
			System.out.println(characterName + " hides from the attack!");
			hideornot =false;
		}
		else {
			energyLevel = energyLevel -amount;
			System.out.println(characterName + " takes a hurt of "+ amount + "! Remaining energy becomes " +energyLevel+".");
		}
	}
	
}
