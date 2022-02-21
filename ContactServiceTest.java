package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import contact.ContactService;

class ContactServiceTest {

	@Test
	void testContactServiceInitialization() {
		ContactService contactService = new ContactService();
		assertTrue(contactService.GetContacts() != null);
	}
	
	@Test
	void testContactServiceAddInvalidContact() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			ContactService contactService = new ContactService();
			contactService.AddContact("12", "a", "a", "12345678901", "a");
		});
	}
	
	@Test
	void testContactServiceAddDuplicateIdContact() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			ContactService contactService = new ContactService();
			contactService.AddContact("12", "a", "a", "1234567890", "a");
			contactService.AddContact("12", "a", "a", "1234567890", "a");
		});
	}
	
	@Test
	void testContactServiceRemoveNonexistentContact() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			ContactService contactService = new ContactService();
			contactService.RemoveContact("12");
		});
	}
	
	@Test
	void testContactServiceUpdateNonexistentContact() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			ContactService contactService = new ContactService();
			contactService.RemoveContact("12");
		});
	}
}
