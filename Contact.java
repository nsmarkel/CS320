package contact;

public class Contact {
	
	private String id, firstName, lastName, phone, address;
	
	public Contact(String id, String firstName, String lastName, String phone, String address){
		if(id == null ||id.length()>10) {
			throw new IllegalArgumentException("Invalid id");
		}
		if(firstName == null ||firstName.length()>10) {
			throw new IllegalArgumentException("Invalid firstName");
		}
		if(lastName == null ||lastName.length()>10) {
			throw new IllegalArgumentException("Invalid lastName");
		}
		if(phone == null || !(phone.length()==10)) {
			throw new IllegalArgumentException("Invalid phone");
		}
		if(address == null ||address.length()>30) {
			throw new IllegalArgumentException("Invalid address");
		}
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
	}

	

	public Object getID() {
		// TODO Auto-generated method stub
		return id;
	}

	public void setFirstName(String firstName2) {
		// TODO Auto-generated method stub
		firstName = firstName2;
	}

	public void setLastName(String lastName2) {
		// TODO Auto-generated method stub
		lastName = lastName2;
	}



	public void setNumber(String number) {
		// TODO Auto-generated method stub
		phone = number;
	}



	public void setAddress(String address2) {
		// TODO Auto-generated method stub
		address = address2;
	}



	public Object getfirstName() {
		// TODO Auto-generated method stub
		return firstName;
	}



	public Object getlaststName() {
		// TODO Auto-generated method stub
		return lastName;
	}



	public Object getNumber() {
		// TODO Auto-generated method stub
		return phone;
	}



	public Object getAddress() {
		// TODO Auto-generated method stub
		return address;
	}
	



	
	
	

}
