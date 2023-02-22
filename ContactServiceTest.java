package contactTest;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import contact.Contact;
import contact.ContactService;

public class ContactServiceTest {

	@Test
	public void addTest() {
		ContactService conServ = new ContactService();
		Contact test = new Contact("1345678", "Billy", "Bob", "2468109999", "Yup");
		assertEquals(true, conServ.addID(test));
	}
	
	@Test
	public void deleteTest() {
		ContactService conServ = new ContactService();
		Contact test = new Contact("1345678", "Billy", "Bob", "2468109999", "Yup");
		
		conServ.addID(test);
		
		assertEquals(true, conServ.deleteID("1345678"));
	}
	
	@Test
	public void updateTest() {
		ContactService conServ = new ContactService();
		Contact test = new Contact("1345678", "Billy", "Bob", "2468109999", "Yup");
		
		conServ.addID(test);
		
		assertEquals(true, conServ.updateID("1345678", "Johnny", "Bravo", "8675309999", "Nope"));
	}
}
