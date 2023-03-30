package studio7;

public class Die {

	private int n;
	
	/**
	 * 
	 * @param number of sides on dice
	 */
	public Die(int sides) {
		this.n = sides;
	}
	
	/**
	 * 
	 * @return randomized roll
	 */
	public int roll() {
		return (int)(Math.random() * n) + 1;
	}
	
	public static void main(String args[]) {
		Die die1 = new Die(8);
		System.out.println("Sides: " + die1.n);
		System.out.println("Roll: " + die1.roll());
	}
	
	
}
