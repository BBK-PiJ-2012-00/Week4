public class IntListNode {
	private int value;
	private IntListNode next;
	private IntListNode previous;
	
	public IntListNode(int num) {
		this.value = num;
	}
	
	public void add(int num) {
		if (this.next == null) {
			next = new IntListNode(num);
			this.next.previous = this;
		}
		else {
			this.next.add(num);
		}
	}
	
	public boolean contains(int num) {
		if (this.value == num) {
			return true;
		}
		else if (this.next != null) {
			return this.next.contains(num);
		}
		return false;
	}
		
	public boolean containsVerbose(int num) {
		if (this.value == num) {
			System.out.println(this.value);
			return true;
		}
		else if (this.next != null) {
			System.out.println(this.value);
			return this.next.containsVerbose(num);
		}
		return false;
	}
	
	public String toString() { //casting??
		String string = "";
		string = string + Integer.toString(this.value);
		if (this.next != null) {
			string = string + ", " + this.next.toString(); //Be mindful of comma placement
		}
		return string;
	}
}
	
	
	