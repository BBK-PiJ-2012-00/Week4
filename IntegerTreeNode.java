public class IntegerTreeNode {
	private int value;
	private IntegerTreeNode left = null;
	private IntegerTreeNode right = null;
	private IntegerTreeNode traverse;
	
	public IntegerTreeNode(int n) {
		this.value = n;	
	}
	
	public int getValue() {
		return this.value;
	}
	
	public int getLeft() {
		return this.left.value;
	}
	
	public int getRight() {
		return this.right.value;
	}
	
	public void add(int newNumber) {
		if (newNumber > this.value) {
			if (right == null) {
				right = new IntegerTreeNode(newNumber);
			}
			else {
				right.add(newNumber);
			}
		}
		else {
			if (left == null) {
				left = new IntegerTreeNode(newNumber);
			}
			else {
				left.add(newNumber);
			}
		}
	}
	
	public boolean contains(int n) {
		if (n == this.value) {
			return true;
		}
		else if (n > this.value) {
			return right.contains(n);
		}
		else if (left != null) {
			return left.contains(n);
		}
		else {
			return false;
		}
	}

	
	public int getMin() { //returns smallest number in tree
		if (left != null) {
			return left.getMin();
		}
		return this.value;
	}
		
	public int getMax() { //returns highest value in tree
		if (right != null) {
			return right.getMax();			
		}
		return this.value;
	}
	
}
	

		

	
	