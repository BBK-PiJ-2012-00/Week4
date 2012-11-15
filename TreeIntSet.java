public class TreeIntSet implements IntSet {
	private IntegerTreeNode topNode = null;	
	
	
	public IntegerTreeNode getTopNode() {
		return topNode;
	}
	
	public void add(int newNumber) { 
		if (contains(newNumber) == false) {
			createNode(newNumber);
		}
	}	
		
	public boolean contains(int item) {
		if (topNode == null) {
			return false;
		}
		return topNode.contains(item);	
	}
	
	public boolean containsVerbose(int item) {
		if (topNode == null) {
			return false;
		}
		return topNode.containsVerbose(item);
	}
	
	private void createNode(int num) {
		if (topNode == null) {
			topNode = new IntegerTreeNode(num);
		}
		else {
			topNode.add(num);
		}		
	}
	
	public String toString() {
		return topNode.toCommaString();
	}	


	public static void main(String[] args) {
	
		TreeIntSet set = new TreeIntSet();
		set.launch();
	}
		
	private void launch() {
	
		add(5);
		add(3);
		add(7);
		add(1);
		add(9);
		add(14);
		add(21);
		add(17);
		
		
		containsVerbose(21);
		
		String s = toString();
		System.out.println(s);
	}
	
}

	/**
	private	void add(IntegerTreeNode node) {
		if (newNumber > traverseNode.getValue()) {
			if (traverseNode.getRight() == null) {
				IntegerTreeNode newNode = IntegerTreeNode(newNumber);
				traverseNode.setRight(newNode);
				}
			else {
				traverseNode = traverseNode.getRight();
				traverseNode.add(newNumber);
			}
		}
		else {
			if (traverseNode.getLeft() == null) {
				IntegerTreeNode newNode = IntegerTreeNode(newNumber)
				traverseNode.setLeft(newNode);
			}
			else {
				traverseNode = traverseNode.getLeft();
				traverseNode.add(newNumber);
			}
		}
	}
	*/		
		
	
//With trees, it is easier to delegate to the other classes than to do absolutely everything in this class.
	