public class Map implements SimpleMap { //you either have a list inside map, or an array
	private KeyStore head = null;
	private KeyStore tail = null;
	private KeyStore traverse = null;	 
	
/**
* Puts a new String in the map.  If the key is already in the map, nothing is done.
*/
	public String put(int key, String name) { //WORKING
		if (isEmpty() == false) {
			if (containsKey(key, name) == false) {
				createItem(key, name);
			}
			else if (containsKey(key, name) == true) {
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
	public String get(int key) { //WORKING
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
	
	/**
* Removes a name from the map. Future calls to get(key) will return null for this key unless another name is added with the same key.
*/

	public void remove(int key) {
		traverse = head;
		int i;
		for (i = 0; i < KeyStore.getKeyCount(); i++) {
			if (traverse.getKey() == key) {
				traverse.setName(null);
		}
			else {
			traverse = traverse.getNext();		
			}
		}
	}
	
	
	public boolean containsKey(int key, String name) { //WORKING
			traverse = head;
			int i;
			for (i = 0; i < KeyStore.getKeyCount(); i++) {
				if ((traverse.getKey() == key) && (traverse.getName() == null)) {
					traverse.setName(name);
					System.out.println("ID successfully reused.");
					return containsKey(key, name);
				}
				else if (traverse.getKey() == key) {
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
	if (mappedName.equals("This ID already exists.")) {
		System.out.println(mappedName);
	}
	else {
		System.out.println(mappedName + " has been added to the database.");
	}
	}
	
	
	System.out.println("Enter an ID number to obtain the employee's name: ");
	int id = Integer.parseInt(System.console().readLine());
	String requestedID = get(id);
	System.out.println("The employee associated with that ID is: " + requestedID);
	
	System.out.println("The employee list is as follows: ");
	System.out.println("There are " + KeyStore.getKeyCount() + " employees.");
	traverse = head;
	for (i = 0; i < KeyStore.getKeyCount(); i++) {
		System.out.println(traverse.getKey() + " " + traverse.getName());
		traverse = traverse.getNext();
	}
	
	System.out.println("Which employee would you like to remove?");
	int idRemoval = Integer.parseInt(System.console().readLine());
	remove(idRemoval);
	
	System.out.println("The employee list is as follows: ");
	System.out.println("There are " + KeyStore.getKeyCount() + " employees.");
	traverse = head;
	for (i = 0; i < KeyStore.getKeyCount(); i++) {
		System.out.println(traverse.getKey() + " " + traverse.getName());
		traverse = traverse.getNext();
	}
	
	System.out.println("Please add an employee: ");
	String name = System.console().readLine();
	id = Integer.parseInt(System.console().readLine());
	String mappedName = put(id, name);
	System.out.println(mappedName + " has been added to the database.");
	
	System.out.println("The employee list is as follows: ");
	System.out.println("There are " + KeyStore.getKeyCount() + " employees.");
	traverse = head;
	for (i = 0; i < KeyStore.getKeyCount(); i++) {
		System.out.println(traverse.getKey() + " " + traverse.getName());
		traverse = traverse.getNext();
	}
	
	

	}

}
	
	
	//Can be ''truly'' dynamic by asking user to say how many employees they'd like to enter, and then setting loop to match
	
	//Can fix confusing println about 'has been added' so that when someone isn't added
	//because a duplicate exists, it's clear that no one's been added.  Minor point.
	
	
	//if isEmpty is true, you create the box and put the name and key in it, which becomes the head (and tail).  
	//otherwise, you check the key against the list and if it's unique, you create a box, put the values in, and link it
	
	