/**
* The Character class is the superclass of SecurityGuard and Student class.
* It contains variables and methods that determine the activities of characters in the game
*
* @author  Zaria Wong
* @version 1.0
* @since   2/20/2023
*/


public class Character {
	String characterName;
	int power;
	int energyLevel;

	 /**
	   * This is a constructor to initialize objects. Below are the variables:
	   * @param characterName the name of character
	   * @param power the power level of the character
	   * @param energyLevel the energy level, which indicates the remaining energy of the character.
	   */
	public Character(String characterName, int power, int energyLevel) {
		this.characterName = characterName;
		this.power = power;
		this.energyLevel = energyLevel;
	}
	
	 /**
	  * This method returns the name of character.
	  * @return it returns the name of character.
	  */
	public String getName() {
		return characterName;
	}

	 /**
	   * This method calculates the remaining energy level of character after the attack.
	   * @param amount This is the amount of energy reduced after the attack.
	   * Prints the amount of attack and remaining energy level.
	   */
	public void hurt(int amount) {
		energyLevel = energyLevel - amount;
		System.out.println(characterName + " takes a hurt of " + amount + "!" + " Remaining energy becomes "+energyLevel+".");
	}

	 /**
	   * Prints the variable characterName + "launches an attack" on standard output.
	   * @return power This returns power level of character.
	   */
	public int attack() {
		System.out.println(characterName + " launches an attack!");
		return power;
	}

	 /**
	   * This method determines whether the character loses.
	   * @return boolean. If energy level equals than or smaller than zero, the method returns false
	   * and the character loses. Otherwise, the method returns false and the game continues.
	   */
	public boolean isLose() {
		if (energyLevel <= 0) {
			return true;}
		else {
			return false;}
		}
}
