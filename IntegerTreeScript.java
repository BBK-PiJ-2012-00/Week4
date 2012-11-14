public class IntegerTreeScript {

	public static void main(String[]args) {
	
		IntegerTreeScript script = new IntegerTreeScript();
		
		script.launch();
		
	}
	
	private void launch() {
	
	IntegerTreeNode top = new IntegerTreeNode(13);
	
	top.add(3);
	
	top.add(17);
	
	top.add(1);
	
	top.add(30);
	
	top.add(40);
	
	String printString = top.toString();
	System.out.println(printString);
	
	String printSimple = top.toSimpleString();
	System.out.println(printSimple);
	
	int topDepth = top.depth();
	System.out.println("The depth of the tree is: " + topDepth);
	
	
	System.out.println(top.getMax() + " is the highest value in the tree.");
	System.out.println(top.getMin() + " is the lowest value in the tree.");
	
	}
}