public class Map implements SimpleMap {
	private static int employeeCount;
	private int key;
	private String value;
	
 //map is the link between keys and values
	


/**
* Puts a new String in the map.  If the key is already in the map, nothing is done.
*/
	public String put(int key, String name) {
		this.id = key;
		this.mappedName = name;	
		String mapped = 
				
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
	
	Person reno = new Person("Reno", 30);
	Person tseng = new Person("Tseng", 36);
	Person rude = new Person("Rude", 33);
	Person elena = new Person("Elena", 25);
	Person rufus = new Person("Rufus", 24);
	Person vincent = new Person("Vincent", 49);
	
	
	//what is a map? a special kind of data structure that links a key with one or more pieces of data, caled the value.
	//So, a map contains a bunch of keys, which link to other stuff.  
	