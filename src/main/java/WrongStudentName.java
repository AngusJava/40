import java.util.Scanner;

class MessageWrongStudentName extends Exception {
    public MessageWrongStudentName(String message) {
        super(message);
    }
}
 // 6_3
public class WrongStudentName {
    public static void main(String[] args, String lname) {
        try {
            if (lname == null || lname.trim().isEmpty()) {
                throw new MessageWrongStudentName("Nazwisko nie może być puste.");
            }

            System.out.println("Nazwisko studenta: " + lname);
        } catch (MessageWrongStudentName e) { 
            System.out.println("Wystąpił błąd w nazwisku studenta: " + e.getMessage());
        } finally {
            System.out.println("Wprowadzanie nazwiska studenta zakończone.");
        }
    }
}
