package collection.section1.lecture57;

import java.util.HashMap;
import java.util.Map;

public class MobilePhone implements ISimpleMobilePhone {

    private Map<String, Contact> contacts;

    public MobilePhone() {
        this.contacts = new HashMap<>();
    }

    public Map<String, Contact> getContacts() {
        return contacts;
    }

    public void setContacts(Map<String, Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public boolean store(Contact contact) {
        if (this.query(contact)) {
            return false;
        }

        this.contacts.put(contact.getName(), contact);
        return true;
    }

    @Override
    public boolean modify(Contact contact) {
        if (!this.query(contact)) {
            return false;
        }

        if(null == this.contacts.replace(contact.getName(), contact)) {
            return false;
        }

        return true;
    }

    @Override
    public void remove(Contact contact) {

    }

    @Override
    public boolean query(Contact contact) {
        if (!this.contacts.containsValue(contact)) {
            return false;
        }

        return true;
    }
}
