package collection.section1.lecture57;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone();
        Contact contact = new Contact();
        Map<String, Contact> contacts = new HashMap<>();
        int option = 0;
        Scanner scanner = new Scanner(System.in);
        while (6 != option) {
            System.out.println("1. List of contacts");
            System.out.println("2. Add new contacts");
            System.out.println("3. Update existing contact");
            System.out.println("4. Remove contacts");
            System.out.println("5. Find contacts");
            System.out.println("6. Quit");
            System.out.println("What do you want?");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Contact list: ");
                    contacts = phone.getContacts();
                    contacts.forEach((k, v) -> {
                        System.out.println(v);
                    });
                    break;

                case 2:
                    System.out.print("Input name: ");
                    scanner = new Scanner(System.in);
                    String name = scanner.nextLine();
                    System.out.print("Input phone number: ");
                    scanner = new Scanner(System.in);
                    String phoneNumber = scanner.nextLine();
                    contact = new Contact(name, phoneNumber);
                    if(!phone.store(contact)) {
                        System.out.println("Contact existed. Do you want to update it?");
                        System.out.println("Typing Y to YES, any key to NO...");
                        scanner = new Scanner(System.in);
                        String agree = scanner.nextLine();

                        if(agree.equals("Y")) {
                            phone.modify(contact);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Input contact name: ");
                    scanner = new Scanner(System.in);
                    name = scanner.nextLine();
                    contact = phone.getContacts().get(name);
                    if(null == contact) {
                        System.out.println("Contact name does NOT exist.");
                        break;
                    }

                    System.out.print("Input contact phone number: ");
                    scanner = new Scanner(System.in);
                    phoneNumber = scanner.nextLine();
                    contact.setPhoneNumber(phoneNumber);
                    break;

                case 4:
                    System.out.print("Input contact name: ");
                    scanner = new Scanner(System.in);
                    name = scanner.nextLine();
                    contacts= phone.getContacts();
                    contact = contacts.get(name);
                    if(null == contact) {
                        System.out.println("Contact name does NOT exist.");
                        break;
                    }

                    if(!contacts.remove(name, contact)) {
                        System.out.println("Remove contact failed");
                        break;
                    }

                    System.out.println("Remove contact successful");
                 
                    break;

                case 5:
                    System.out.print("Input contact name: ");
                    scanner = new Scanner(System.in);
                    name = scanner.nextLine();
                    contacts= phone.getContacts();
                    contact = contacts.get(name);
                    if(null == contact) {
                        System.out.println("Contact name does NOT exist.");
                        break;
                    }

                    System.out.println(contact);
                    break;

                default:
                    break;
            }
        }
        scanner.close();
    }
}
