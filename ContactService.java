package contact;

import java.util.ArrayList;
import java.util.List;

public class ContactService {
	private List<Contact> contacts;
	
	public ContactService() {
		contacts = new ArrayList<Contact>();
	}
	
	public List<Contact> GetContacts() {
		return contacts;
	}
	
	public void AddContact(String contactId, String firstName, String lastName, String number, 
			String address) {
		if (!contacts.isEmpty()) {
			for (int i = 0; i < contacts.size(); i++) {
				if (contactId.equals(contacts.get(i).GetContactId())) {
					throw new IllegalArgumentException("Contact ID already in use");
				}
			}
		}
		contacts.add(new Contact(contactId, firstName, lastName, number, address));
	}
	
	public void RemoveContact(String contactId) {
		if (!contacts.isEmpty()) {
			for (int i = 0; i < contacts.size(); i++) {
				if (contactId.equals(contacts.get(i).GetContactId())) {
					contacts.remove(i);
					return;
				}
			}
		}
		throw new IllegalArgumentException("Invalid ID");
	}
	
	public void UpdateContact(String contactId, String firstName, String lastName, String number, 
			String address) {
		if (!contacts.isEmpty()) {
			for (int i = 0; i < contacts.size(); i++) {
				if (contactId.equals(contacts.get(i).GetContactId())) {
					contacts.get(i).SetFirstName(firstName);
					contacts.get(i).SetLastName(lastName);
					contacts.get(i).SetNumber(number);
					contacts.get(i).SetAddress(address);
					return;
				}
			}
		}
		throw new IllegalArgumentException("Invalid ID");
	}
}
