public class Employee {
	private String name;
	private int id;
	private Employee nextEmployee = null;
	private Employee previousEmployee = null;
	private static int employeeCount = 0;  
	
	public Employee(String name, int age) {
		employeeCount++;
		this.name = name;
		this.id = null;
		this.nextEmployee = null;
		this.previousEmployee = null;
	}
	
	public static int getCount() {
		return employeeCount;
	}
	
	public static int decrementCounter(int counter) {
		return employeeCount--;
	}
	
	public void setID(int id) {
		this.id = id;
	}
	
	public int getID(){
		return id;
	}
	
	public Employee getNext() {
		return nextEmployee;
	}
	
	public void setNext(Employee employee) {
		this.nextEmployee = employee; 
	}
	
	public Employee getPrevious() {
		return previousEmployee;
	}
	
	public void setPrevious(Employee employee) {
		this.previousEmployee = employee;
	}
	
	public String getName() { //to access private fields above from another class
		return name;
	}
	
	public int getID() {
		return id;
	}
}
	