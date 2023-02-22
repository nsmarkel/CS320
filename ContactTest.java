package contactTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import contact.Contact;

class ContactTest {

	@Test 
	void testID() {
		Contact contact = new Contact("123456789", "Billy", "Bob", "1234567890", "123456");
		assertTrue(contact.getID().equals("123456789"));
		assertTrue(contact.getfirstName().equals("Billy"));
		assertTrue(contact.getlaststName().equals("Bob"));
		assertTrue(contact.getNumber().equals("1234567890"));
		assertTrue(contact.getAddress().equals("123456"));
		
	}
	
	@Test
	void testIDTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,() -> {
			new Contact("12345678910", "Billy", "Bob", "1234567890", "123456");
		});
	}
	
	@Test
	void testIDNull() {
		Assertions.assertThrows(IllegalArgumentException.class,() -> {
			new Contact(null, "Billy", "Bob", "1234567890", "123456");
		});
	}
	
	@Test
	void testFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,() -> {
			new Contact("12345678910", "Billlllllllly", "Bob", "1234567890", "123456");
		});
	}
	
	@Test
	void testFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class,() -> {
			new Contact("12345678910", null, "Bob", "12345678901", "123456");
		});
	}
	
}


