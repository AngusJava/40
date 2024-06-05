import java.util.Scanner;

class MessageWrongStudentName extends Exception {
    public MessageWrongStudentName(String message) {
        super(message);
    }
}

public class WrongStudentName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Podaj nazwisko studenta: ");
            String lastName = scanner.nextLine();

            if (lastName == null || lastName.trim().isEmpty()) {
                throw new MessageWrongStudentName("Nazwisko nie może być puste.");
            }

            System.out.println("Nazwisko studenta: " + lastName);
        } catch (MessageWrongStudentName e) {
            System.out.println("Wystąpił błąd w nazwisku studenta: " + e.getMessage());
        } finally {
            System.out.println("Wprowadzanie nazwiska studenta zakończone.");
        }
    }
}
