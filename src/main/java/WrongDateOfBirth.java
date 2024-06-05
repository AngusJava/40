import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class WrongDateOfBirthException extends Exception {
    public WrongDateOfBirthException(String message) {
        super(message);
    }
}
// 6_3
public class WrongDateOfBirth {
    public static void main(String[] args, String dateOfBirthStr) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date dateOfBirth = dateFormat.parse(dateOfBirthStr);

            Date currentDate = new Date();
            if (dateOfBirth.after(currentDate)) {
                throw new WrongDateOfBirthException("Data urodzenia nie może być w przyszłości.");
            }
            System.out.println("Data urodzenia: " + dateOfBirthStr);
        } catch (ParseException e) {
            System.out.println("Błąd parsowania daty: " + e.getMessage());
        } catch (WrongDateOfBirthException e) {
            System.out.println("Wystąpił błąd daty urodzenia: " + e.getMessage());
        } finally {
            System.out.println("Data została wpisana ");
        }
    }
}
