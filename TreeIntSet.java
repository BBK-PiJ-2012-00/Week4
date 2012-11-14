public class TreeIntSet implements IntSet {
	private int value;
	private TreeIntSet left = null;
	private TreeIntSet right = null;
	
	public TreeIntSet(int num) {
		this.value = num;
	}
	
	public void add(int newNumber) {
		if (newNumber > this.value) {
			if (right == null) {
				right = new TreeIntSet(newNumber);
			}
			else {
				right.add(newNumber);
			}
		}
		else {
			if (left == null) {
				left = new TreeIntSet(newNumber)
			}
			else {
				left.add(newNumber);
			}
		}
	
	}
		
		
		
		
	












public interface IntSet {

	/**
	* Adds a new int to the set; if it is there already, nothing happens.
	*/
	void add(int item);
	
	/**
	* Returns true if the number is in the set, false otherwise.
	*/
	boolean contains(int item);
	
	/**
	* Returns the same values as the former method but for every element that
	* is checked, it prints its value on screen.
	*/
	boolean containsVerbose(int item);
	
	/**
	* Returns a string with the values of the elements in the set separated by
	* commas.
	*/
	String toString();
	
}
	