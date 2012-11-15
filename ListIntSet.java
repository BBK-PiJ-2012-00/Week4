public class ListIntSet implements IntSet {
	private IntListNode head = null;
	private IntListNode tail = null;
	
	public void add(int num) {
		if (contains(num) == false) {
			createNode(num);
		}		
	}
	
	public void createNode(int num) {
		if (head == null) {
			head = new IntListNode(num);
		}
		else {
			head.add(num);
		}
	}
	
	public boolean contains(int num) { //You could alternatively implement this in this class, using getters.
		if (head == null) {
			return false;
		}
		return head.contains(num);
	}
			
	
	public boolean containsVerbose(int num) {
		return head.containsVerbose(num);
	}
	
	public String toString() {
		return head.toString();
	}
	
	public static void main(String[] args) {
	
	ListIntSet set = new ListIntSet();
	set.launch();
	
	}
	
	private void launch() {
	
	add(5);
	add(8);
	add(4);
	add(21);
	add(8);
	
	containsVerbose(21);
	
	String print = toString();
	System.out.println("toString() method yields: " + print);
	
	}
	
	
}
	
		

	
	
	
	
	
	/**
	* If you implement this class by controlling the list from here rather than using methods in the IntListNode
	* class, then your contains() method operates on an internal loop, which requires a counter for every node
	* created, rather than using the method recursively.
	*/
	