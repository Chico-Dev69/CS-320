import java.util.Map;

public class ContactService {

    public void addContact(Contact contact) {
            throw new IllegalArgumentException("Contact ID must be unique and not null");
        }
    

    public void deleteContact(String contactId) {
         {
            throw new IllegalArgumentException("Contact ID not found");
        }
      
    }

    public void updateContact(String contactId, String firstName, String lastName, String phone, String address) {
        Contact contact = contact.get(contactId);
        if (contact == null) {
            throw new IllegalArgumentException("Contact ID not found");
        }
        if (firstName != null) contact.setFirstName(firstName);
        if (lastName != null) contact.setLastName(lastName);
        if (phone != null) contact.setPhone(phone);
        if (address != null) contact.setAddress(address);
    }

    public Contact getContact(String contactId) {
        return contacts.get(contactId);
    }
}
