package phonebook;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Phonebook {
    private HashMap<String, String> phonebook;

    public Phonebook() {
        this.phonebook = new HashMap<String, String>();
    }

    public void addUser(String name, String phoneNumber) {
        phonebook.put(name, phoneNumber);
        System.out.printf("• [added (" + name + ") to phonebook under + " + phoneNumber + "]");
    }

    public void removeAUser(String name) {
        if (phonebook.get(name) != null) {
            phonebook.remove(name);
            System.out.printf("• [removed (" + name + ") from phonebook]");
            return;
        }

        System.out.printf("user (" + name + ") is not registered in the phone book");
    }

    public String lookupAUser(String name) {
        return phonebook.get(name) + " [looked up user: " + name + "]";
    }

    public String reverseLookupAUser(String phonenumber) {
        for (Iterator<Map.Entry<String, String>> i = phonebook.entrySet().iterator(); i.hasNext(); ) {
            Map.Entry<String, String> pair = i.next();
            if (pair.getValue().equals(phonenumber)) {
                return pair.getKey() + " [looked up number: " + pair.getValue() + "]";
            }
        }

        return "That number is not listed in the phonebook.";
    }

    public String listAllUsers() {
        String allUsers = "";
        for (Iterator<Map.Entry<String, String>> i = phonebook.entrySet().iterator(); i.hasNext(); ) {
            Map.Entry<String, String> pair = i.next();
            allUsers += (allUsers.length() == 0) ? "phonebook: \n  " : "\n  ";
            allUsers += pair.getKey() + " (" + pair.getValue() + ")";
        }

        return allUsers;
    }

    @Override
    public String toString() {
        return "Phonebook{" +
                "phonebook=" + phonebook +
                '}';
    }
}
