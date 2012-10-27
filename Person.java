public class Person {
	private String name;
	private int age;
	private Person nextPerson = null;
	private Person previousPerson = null;
	private static int personCount = 0;  
	//private static Patient = listManager.patientListStart -- possible workaround to change patient at head and tail of list
	
	public Person(String name, int age) {
		personCount++;
		this.name = name;
		this.age = age;
		this.nextPerson = null;
		this.previousPerson = null;
	}
	
	public static int getCount() {
		return personCount;
	}
	
	public static int decrementCounter(int counter) {
		return personCount--;
	}
	
	public Person getNext() {
		return nextPerson;
	}
	
	public void setNext(Person person) {
		this.nextPerson = person; //sets the nextPatient of this one to whatever is in the parameter.
	}
	
	public Person getPrevious() {
		return previousPerson;
	}
	
	public void setPrevious(Person person) {
		this.previousPerson = person;
	}
	
	public String getName() { //to access private fields above from another class
		return name;
	}
	
	public int getAge() {
		return age;
	}
	

		
		
	/**public boolean deletePatient(Patient patient) {
		if (this.name.equals(patient.name)) { 
			if (this.previousPatient == null) { //this means user is requesting deletion of first patient
				listManager.setListStart(this.nextPatient); //setter required! //listmanager responsible for null exception?
				this.nextPatient.previousPatient = null;
				patientCount--;
				return true;
			}
			else if (this.nextPatient == null) { //this means user is requesting deletion of last patient
				listManager.setListEnd(this.previousPatient); //re-routes pointer of list tail
				this.previousPatient.nextPatient = null;
				patientCount--;
				return true;
			}
		}			
		else if (this.nextPatient.name.equals(patient.name)) {
			this.nextPatient = nextPatient.nextPatient;
			this.previousPatient = previousPatient.previousPatient;
			patientCount--;
			return true;
		}
		 
		return this.nextPatient.deletePatient(patient);
	
	*/	
		
	 
}
	