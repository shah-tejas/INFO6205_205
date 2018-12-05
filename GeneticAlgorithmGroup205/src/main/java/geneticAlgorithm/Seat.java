package geneticAlgorithm;

public class Seat {

	private Person person;
	private int tableId;
	
	public Seat(int tableID) {
		person = new Person();
		this.tableId = tableID;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public int getTableId() {
		return tableId;
	}

	public void setTableId(int tableId) {
		this.tableId = tableId;
	}
	
	
}
