import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;

public class ContactReader {
    public Contact readContact(String fileName) {
        Contact contact = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            contact = (Contact) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("The file " + fileName + " was not found.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the contact.");
        } catch (ClassNotFoundException e) {
            System.out.println("The class Contact could not be found.");
        }
        return contact;
    }
}