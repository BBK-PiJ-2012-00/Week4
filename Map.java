public class Map implements SimpleMap { //you either have a list inside map, or an array
	private int key;
	private String value;
	private KeyStore head = null;
	private KeyStore tail = null;
	private KeyList; //this is what your map is!
	private KeyStore traverse = null;
	
	 
	
/**
* Puts a new String in the map.  If the key is already in the map, nothing is done.
*/
	public String put(int key, String name) { //compare keys here, then addToList if successful
		if (isEmpty() == false) {
			if (containsKey(head, key) == false) {
				if(head.getNext().getKey() == null) { //need to create a next first....
					head.getNext().setKey(key);
					head.getNext().setName(name);
					return head.getNext().getName();
			}
			else {
				d
			
		
		
		
		
		
		if (head.getKey() == null) {			
			head.setName(name);
			head.setKey(key);
			tail = head;
			KeyStore.incrementKeyCount();
			return head.getName();
		}
		else if (head.getKey() != null) {
			int counter;
			traverse = head;
			
				
			// replace with while loop, breaking as soon as matching key is found, and making new key tail if no match found
				
	}
	
	public boolean containsKey(KeyStore head, int key) { //checks keys
			traverse = head;
			int counter;
			for (counter = 0; counter < KeyStore.getKeyCount(); counter++) {
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
	}
	
	public void addToList(KeyStore newItem) {
			tail.setNext(newItem);
			tail = newItem;
	}
		
					
	
	/**
* Returns the name associated with that key, or null if there is none.
*/
	String get(int key) {
	
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
	
		Map map = new Map();
		map.launch();
		
	}
	
	private void launch() {
	
	KeyStore item1 = new KeyStore("Reno", 2197);
	head = item1; //setting the head here means there is always a head -- can change this so that head is created
	tail = item1;
	String mappedName = put(item1.getKey(), item1.getName());
	System.out.println(mappedName);
	
	KeyStore item2 = new KeyStore();
	addToList(item2);
	
	KeyStore item3 = new KeyStore();
	addToList(item3);
	
	KeyStore item4 = new KeyStore();
	addToList(item4);
	
	
	
	
	String name2 = "Tseng";
	int idTseng = 1999;
	//KeyStore key2 = new KeyStore("Tseng", 1999); 
	String mappedName2 = put(1999, "Tseng");
	System.out.println(mappedName2);
	
	String name3 = "Elena";
	int idElena = 7623;
	
	String name4 = "Rude";
	int idRude = 2197;
	
	//you want to test that the key doesn't appear in the map before you can assign it a value and add it to the list, 
	//so you take a value and a key, into put(), you check that the key doesn't appear, and you then assign it to an item in the
	//list - the next one.  So you should have a linked list of empty items, other than the head, to which things are assigned
	// so you already have a linked list which constitutes your map, and you want to add keys and values to it
	// so link your items as a list first, and then you see what you can put in it.
	
	
	