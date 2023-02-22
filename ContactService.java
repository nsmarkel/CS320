package contact;

import java.util.ArrayList;

public class ContactService {

	private ArrayList<Contact> IDs;
	
	public ContactService() {
		IDs = new ArrayList<>();
	}
	//checks if ID is already in use. If not, adds it to array 
	public boolean addID(Contact IDbool) {
		boolean IDexists = false;
		
		for(Contact IDList : IDs) {
			if (IDList.equals(IDbool)) {
				IDexists = true;
			}
		}
		 //if not an ID add it as one
        if (!IDexists) {
            IDs.add(IDbool);
            return true;
        } else {
            return false;
        }
	}
	
	//delete function
	public boolean deleteID(String ID) {
		for(Contact IDList : IDs) {
			if (IDList.getID().equals(ID)) {
				IDs.remove(IDList);
				return true;
			}
		}
		return false;
	}
	
	
    public boolean updateID(String id, String firstName, String lastName, String number,
            String address) {
        for (Contact IDList : IDs) {
            if (IDList.getID().equals(id)) {
                if (!firstName.equals("") && !(firstName.length() > 10)) {
                    IDList.setFirstName(firstName);
                }
                if (!lastName.equals("") && !(lastName.length() > 10)) {
                    IDList.setLastName(lastName);
                }
                if (!number.equals("") && (number.length() == 10)) {
                    IDList.setNumber(number);
                }
                if (!address.equals("") && !(address.length() > 30)) {
                    IDList.setAddress(address);
                }
                return true;
            }
        }
        //else return false
        return false;
    }
}
