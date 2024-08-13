public class ContactApp {
    public static void main(String[] args) {
        Contact contact = new Contact("Anoohya", "123-456-7890", "anoohya@gmail.com");
        ContactWriter contactWriter = new ContactWriter();
        ContactReader contactReader = new ContactReader();
        String fileName = "contact.ser";
        contactWriter.saveContact(fileName, contact);
        System.out.println("Reading contact from file:");
        Contact readContact = contactReader.readContact(fileName);
        if (readContact != null) {
            System.out.println(readContact);
        }
        System.out.println("\nAttempting to read from a non-existent file:");
        contactReader.readContact("nonexistentfile.ser");
    }
}