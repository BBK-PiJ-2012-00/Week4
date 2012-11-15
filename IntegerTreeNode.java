public class IntegerTreeNode {
	private int value;
	private IntegerTreeNode left = null;
	private IntegerTreeNode right = null;
		
	public IntegerTreeNode(int n) {
		this.value = n;	
	}
	
	public int getValue() {
		return this.value;
	}
	
	public IntegerTreeNode getLeft() {
		return this.left;
	}
	
	public IntegerTreeNode getRight() {
		return this.right;
	}
	
	public void setLeft(IntegerTreeNode node) {
		this.left = node;
	}
	
	public void setRight(IntegerTreeNode node) {
		this.right = node;
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
			if (right != null) {
				return right.contains(n);
			}
		}
		else if (left != null) {
			return left.contains(n);
		}
		return false;		
	}
	
	public boolean containsVerbose(int n) {
		if (n == this.value) {
			System.out.println(this.value);
			return true;
		}
		else if (n > this.value) {
			if (right != null) {
				System.out.println(this.value);
				return right.containsVerbose(n);
			}
		}
		else if (left != null) {
			System.out.println(this.value);
			return left.containsVerbose(n);
		}
		return false;
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
	
	public String toString() {
		String string = "";
		string = string + "[" + this.value + " ";		
		if (this.left == null) {
			string = string + "L[] ";
		}
		else { 
			string = string + "L ";
			string = string + left.toString();
		}
		if (this.right == null) {
			string = string + "R[] ";
		}
		else {
			string = string +  "R " + right.toString();
		}
		return string + "]";
	}
	
	public String toCommaString() {
		String string = "";
		string = string + this.value;
		if (this.left != null) {
			string = string + ", " + left.toCommaString();
		}
		if (this.right != null) {
			string = string + ", " + right.toCommaString();
		}
		return string;
	}
	
	public String toSimpleString() {
		String string = "";
		string = string + "[" + this.value + " ";
		if (this.left != null) {
			string = string + left.toSimpleString();
		}
		if (this.right != null) {
			string = string + right.toSimpleString();
		}
		return string + "]";
	}
	
	public int depth() { //find the deepest subtree
		int leftDepth = 0;
		int rightDepth = 0;
		if (this.left != null) {
			leftDepth = left.depth();
		} 
		if (this.right != null) {
			rightDepth = right.depth();
		}
		if (rightDepth > leftDepth) {
			return rightDepth + 1;
		}
		else {
			return leftDepth + 1;
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
		
			
			
	
	
	
		
		
		
		
		
		
		
}

/**
Add a method depth() that returns the number of levels in a tree. By convention, a tree with only one node
(i.e. the root) has a depth of zero. Hint: the depths of the trees in Figure 1 are 0, 1, 2, and 3.
Hint: the depth of a tree is one more than the deepest of its subtreees.
*/

		

	
	