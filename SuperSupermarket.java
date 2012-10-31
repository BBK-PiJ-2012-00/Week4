public class SuperSupermarket implements PersonQueue {
//This version uses a truly dynamic list by using a method to both create people and add them to list.  Works.

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
		
	public void createPerson(String name, int age) { //alternative to declaring in launch. Doesn't matter that object name is lost at end of method - object retained in list.
		Person newPerson = new Person(name, age);
		if (Person.getCount() == 1) {
			head = newPerson;
			tail = newPerson;
		}
		else if (Person.getCount() > 1) {
			insert(newPerson);
			tail = newPerson;	
		}	
	}
			
	
	
	public static void main(String[] args) {
		
		SuperSupermarket supermarket = new SuperSupermarket();
		supermarket.launch();
		
	}
	
	private void launch() {
	
	System.out.println("**Welcome to the SuperSupermarket**");
	
	int i;
	for (i = 0; i < 5; i++) {	
	System.out.println("Please add yourself to the queue, describing your name and age: ");
	String name = System.console().readLine();
	int age = Integer.parseInt(System.console().readLine());
	createPerson(name, age);
    }
	
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