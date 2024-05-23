/**
* The SecurityGuard class is the subclass of Character Class.
* It contains variables and methods that determine the activities of Security Guard in the game
*
* @author  Zaria Wong
* @version 1.0
* @since   2/20/2023
*/
public class SecurityGuard extends Character{
	
	boolean boostornot =false;
	
	 /**
	   * This is a constructor to initialize objects. Below are the variables:
	   * @param characterName the name of Security Guard
	   * @param power the power level of the Security Guard
	   * @param energyLevel the energy level, which indicates the remaining energy of the Security Guard.
	   */
	public SecurityGuard(String characterName, int power, int energyLevel) {
		super(characterName, power, energyLevel);
	}

	 /**
	  * This method is called when Security Guard Boost laser gun for the next attack. 
	  * Prints the the name of Security Guard + "boosts its laser gun!" on standard output.
	  * @param boostornot becomes true, meaning that laser gun is boosted.
	  */
	void boost() {
		System.out.println(characterName + " boosts its laser gun!");
		boostornot = true;
	}

	 /**
	   * This method is an overridden method. It specifies the behaviors of the Security Guard.
	   * @return power If laser gun is boosted, power is doubled.
	   * Prints the the name of Security Guard + "makes a heavy strike!" on standard output.
	   * Otherwise, the power of Security Guard is returned.
	   * Prints the the name of Security Guard + "strikes hard!" on standard output.
	   */
	public int attack() {
		if (boostornot == true) {
			System.out.println(characterName+" makes a heavy strike!");
			return power*2;
		}
		else {
			System.out.println(characterName+" strikes hard!");
			return power;

		}
	}
}
