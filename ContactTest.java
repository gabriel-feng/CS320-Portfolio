package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import contact.Contact;

public class ContactTest {
	@Test
	void testContact() {
		Contact contact = new Contact("12", "a", "a", "1234567890", "a");
		assertTrue(contact.GetContactId().equals("12"));
		assertTrue(contact.GetFirstName().equals("a"));
		assertTrue(contact.GetLastName().equals("a"));
		assertTrue(contact.GetNumber().equals("1234567890"));
		assertTrue(contact.GetAddress().equals("a"));
	}
	
	@Test
	void testContactIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> 
		{new Contact("12345678901", "a", "a", "1234567890", "a");});
	}
	
	@Test
	void testContactIdIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> 
		{new Contact(null, "a", "a", "1234567890", "a");});
	}
	
	@Test
	void testFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> 
		{new Contact("1234567890", "characters1", "a", "1234567890", "a");});
	}
	
	@Test
	void testFirstNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> 
		{new Contact("1234567890", null, "a", "1234567890", "a");});
	}
	
	@Test
	void testLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> 
		{new Contact("1234567890", "a", "characters1", "1234567890", "a");});
	}
	
	@Test
	void testLastNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> 
		{new Contact("1234567890", "a", null, "1234567890", "a");});
	}
	
	@Test
	void testNumberTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> 
		{new Contact("1234567890", "a", "a", "12345678901", "a");});
	}
	
	@Test
	void testNumberIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> 
		{new Contact("1234567890", "a", "a", null, "a");});
	}
	
	@Test
	void testNumberTooShort() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> 
		{new Contact("1234567890", "a", "a", "123456789", "a");});
	}
	
	@Test
	void testAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> 
		{new Contact("1234567890", "a", "a", "1234567890", "abcdefghijklmnopqrstuvwxyzasdfg");});
	}
	
	@Test
	void testAddressIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> 
		{new Contact("1234567890", "a", "a", "1234567890", null);});
	}
}
