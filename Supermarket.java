public class Supermarket implements PersonQueue {

	private Person head = null;
	private Person traverser = null;
	private Person tail = null;
	private Person beingServed = null;

	public void setHead(Person person) {
		head = person;
	}
	
	public void insert(Person newPerson) {
		addPerson(newPerson);
	}
	
	public Person retrieve() { //retrieve has return type Person, servePerson has void...
		beingServed = servePerson();
		return beingServed;
	}
	
	public void addPerson(Person newPerson) {
			tail.setNext(newPerson);
			tail = newPerson;
	}
	
	public Person servePerson() { //could return Person, then print details in retrieve method
		if (isEmpty() == false) {			
			if (head.getNext() != null) { //checks that another customer is in the queue
				beingServed = head;
				head = head.getNext();
				return beingServed;
			}
			else if (head.getNext() == null) {
				beingServed = head;
				head = null; 
				return beingServed;
			}
		}
		else if (isEmpty() == true) {
			System.out.println("There is no queue. All the customers have been served.");
			beingServed = null;
		}
		return beingServed;
	}
				
	public boolean isEmpty() {
		if (head != null) {
			return false;
		}
		else {
			return true;
		}
	}		
	
	
	public static void main(String[] args) {
		
		Supermarket supermarket = new Supermarket();
		supermarket.launch();
		
	}
	
	private void launch() {
	
	System.out.println("**Welcome to the Supermarket**");
	
	Person person1 = new Person("Rufus", 25);
	head = person1;	
	tail = person1;
	
	Person person2 = new Person("Tseng", 36);
	insert(person2);	
	
	Person person3 = new Person("Reno", 29);
	insert(person3);
	
	Person person4 = new Person("Heidegger", 53);
	insert(person4);
	
	Person person5 = new Person("Elena", 26);
	insert(person5);
	
	Person person6 = new Person("Rude", 33);
	insert(person6);
	
	System.out.println("There are " + Person.getCount() + " people in the queue.");
	
	
	int counter;
	for (counter = 0; counter < Person.getCount() - 1; counter++) {
		beingServed = retrieve();	
		System.out.println("The customer being served is " + beingServed.getName());
		System.out.println("The customer at the front of the queue is " + head.getName());
	}
	
	System.out.println("The last person in the queue is " + head.getName());
	
	
	
	}
	
}

/**
*Person.decrementCounter(Person.getCount()); -- static variable, no use in for loop at end
* as it decrements with every person served.
*/

		