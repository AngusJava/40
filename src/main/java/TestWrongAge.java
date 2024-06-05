import java.util.Scanner;

class WrongAge extends Exception {
    public WrongAge(String message) {
        super(message);
    }
}
// 6_4
public class TestWrongAge {
    public static void main(String[] args, int age) {
        try {
            if (age < 0 || age > 100) {
                throw new WrongAge("Wiek musi być w zakresie od 0 do 100 lat.");
            }
            System.out.println("Wiek: " + age);
        } catch (WrongAge e) {
            System.out.println("Wystąpił błąd wieku: " + e.getMessage());
        } finally {
            System.out.println("Wiek jest prawidłowym zakresie");
        }
    }
}
