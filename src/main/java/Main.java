
/*
Kod bazowy programu Commit4_0: 
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
*/
import java.util.Scanner;
import java.io.IOException;

class Main {
  public static void main(String[] args) {
    try {
      Service s = new Service();
      System.out
          .print("Co chcesz zrobić:\n 1 - dodanie studenta \n 2 - wyswietlanie studenta \n 0 - Koniec programu \n");
      Scanner scanner = new Scanner(System.in);
      while (true) {
        int wybor = scanner.nextInt();
        switch (wybor) {
          case 0:
            // 4_3
            System.out.println("Koniec programu.");
            return;
          case 1:
            // 4_1
            Scanner imie = new Scanner(System.in);
            Scanner wiek = new Scanner(System.in);
            Scanner nazwisko = new Scanner(System.in);
            Scanner data_dnia = new Scanner(System.in);
            System.out.print("Podaj imie: ");
            String name = imie.nextLine();
            System.out.print("Podaj nazwisko: ");
            String lname = nazwisko.nextLine();
            System.out.print("Podaj wiek studenta: ");
            int age = wiek.nextInt();
            System.out.print("Podaj Datę dnia:  ");
            String date = data_dnia.nextLine();
            s.addStudent(new Student(name, lname, age, date));
            break;
          case 2:
            var students = s.getStudents();
            for (Student current : students) {
              System.out.println(current.ToString());
            }
        }
      }
    } catch (IOException e) {
    }
  }
}