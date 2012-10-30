public class Map { //you either have a list inside map, or an array
	private KeyStore head = null;
	private KeyStore tail = null;
	private KeyStore traverse = null;	 
	
/**
* Puts a new String in the map.  If the key is already in the map, nothing is done.
*/
	public String put(int key, String name) { //WORKING
		if (isEmpty() == false) {
			if (containsKey(key) == false) {
				createItem(key, name);
			}
			else if (containsKey(key) == true) {
				String duplicateAlert = "This ID already exists.";
				return duplicateAlert;
			}
		}
		else if (isEmpty() == true) {
			createItem(key, name);
		}
		return name;
	}
	
/**
* Returns the name associated with that key, or null if there is none.
*/
	String get(int key) { //WORKING
		traverse = head;
		int i;
		for (i = 0; i < KeyStore.getKeyCount(); i++) {
			if (traverse.getKey() == key) {
				return traverse.getName();
			}
			else {
				traverse = traverse.getNext();
			}
		}
		String notFound = "ID not found.";
		return notFound;	
	}		
	
	
	public boolean containsKey(int key) { //WORKING
			traverse = head;
			int i;
			System.out.println(traverse.getKey());
			System.out.println(KeyStore.getKeyCount());
			for (i = 0; i < KeyStore.getKeyCount(); i++) {
				if (traverse.getKey() == key) {
					return true;
				}
				else {
					traverse = traverse.getNext();
				}
			}
			return false;
	}
	
	public boolean isEmpty() {
		if (head == null) {
			return true;
		}
		return false;
	}
	
	public void createItem(int key, String name) { //WORKING
		KeyStore newItem = new KeyStore(key, name);
		if (isEmpty()) {			
			head = newItem;
			tail = newItem;
		}
		else {
			tail.setNext(newItem);
			tail = newItem;
		}
	}	
	
		
	
	
	
	public static void main(String[] args) {
	
		Map map = new Map();
		map.launch();
		
	}
	
	private void launch() {
	
	int i;
	for (i = 0; i < 6; i++) {
	System.out.println("Please enter the name and ID of the employee: ");
	String name = System.console().readLine();
	int id = Integer.parseInt(System.console().readLine());
	String mappedName = put(id, name);
	System.out.println(mappedName + " has been added to the database.");
	}
	
	System.out.println("Enter an ID number to obtain the employee's name: ");
	int id = Integer.parseInt(System.console().readLine());
	String requestedID = get(id);
	System.out.println("The employee associated with that ID is: " + requestedID);
	

	}

}
	
	//Only Remove to add
	
	
	//Can fix confusing println about 'has been added' so that when someone isn't added
	//because a duplicate exists, it's clear that no one's been added.  Minor point.
	
	
	//if isEmpty is true, you create the box and put the name and key in it, which becomes the head (and tail).  
	//otherwise, you check the key against the list and if it's unique, you create a box, put the values in, and link it
	
	