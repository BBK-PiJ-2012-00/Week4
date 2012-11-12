public class IntegerTreeScript {

	public static void main(String[]args) {
	
		IntegerTreeScript script = new IntegerTreeScript();
		
		script.launch();
		
	}
	
	public static void launch() {
	
	IntegerTreeNode top = new IntegerTreeNode(13);
	
	top.add(3);
	
	top.add(17);
	
	top.add(1);
	
	top.add(30);
	
	System.out.println(top.getValue());
	System.out.println(top.getLeft());
	System.out.println(top.getRight());
	System.out.println(top.getMax() + " is the highest value in the tree.");
	System.out.println(top.getMin() + " is the lowest value in the tree.");
	
	}
}