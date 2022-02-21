package contact;

public class Contact {
	private String contactId;
	private String firstName;
	private String lastName;
	private String number;
	private String address;
	
	public Contact(String contactId, String firstName, String lastName, String number, String address) {
		if (contactId == null || contactId.length() > 10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("First name must be 10 characters or shorter");
		}
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Last name must be 10 characters or shorter");
		}
		if (number == null || number.length() != 10) {
			throw new IllegalArgumentException("Phone number must be 10 characters");
		}
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Address must be 30 characters or less");
		}
		
		this.contactId = contactId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.number = number;
		this.address = address;
	}
	
	public String GetContactId() {
		return contactId;
	}
	
	public String GetFirstName() {
		return firstName;
	}
	
	public String GetLastName() {
		return lastName;
	}
	
	public String GetNumber() {
		return number;
	}

	public String GetAddress() {
		return address;
	}
	
	public void SetFirstName(String firstName) {
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("First name must be 10 characters or shorter");
		}
		this.firstName = firstName;
	}
	
	public void SetLastName(String lastName) {
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Last name must be 10 characters or shorter");
		}
		this.lastName = lastName;
	}
	
	public void SetNumber(String number) {
		if (number == null || number.length() != 10) {
			throw new IllegalArgumentException("Phone number must be 10 characters");
		}
		this.number = number;
	}

	public void SetAddress(String address) {
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Address must be 30 characters or less");
		}
		this.address = address;
	}
}
