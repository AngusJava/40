
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
          .print(
              "Co chcesz zrobić:\n 1 - dodanie danych \n 2 - wyswietlanie studenta \n 3 - wyszukaj studenta \n 4 - łapanie błedu \n 5 - przykladowy błąd \n 0 - Koniec programu \n ");
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
            Scanner data_dzien = new Scanner(System.in);
            Scanner data_miesiac = new Scanner(System.in);
            Scanner data_rok = new Scanner(System.in);
            System.out.print("Podaj imie: ");
            String name = imie.nextLine();
            System.out.print("Podaj nazwisko: ");
            String lname = nazwisko.nextLine();
            System.out.print("Podaj wiek studenta: ");
            int age = wiek.nextInt();
            System.out.print("Podaj Datę dnia:  ");
            String date = data_dnia.nextLine();
            System.out.print("Podaj dzien:  ");
            int date_day = data_dnia.nextInt();
            System.out.print("Podaj miesiac  ");
            int date_mouth = data_dnia.nextInt();
            System.out.print("Podaj rok ");
            int date_year = data_dnia.nextInt();
            if (date_day > 31) {
              System.out.print("dzien spoza zakresu");
              break;
            }
            if (date_mouth > 12) {
              System.out.print("miesiac spoza zakresu");
              break;
            }
            if (date_year < 1900 || date_year > 2025) {
              System.out.print("rok nie w zakresie");
              break;
            }
            s.addStudent(new Student(name, lname, age, date, date_day, date_mouth, date_year));
            break;

          case 2:
            var students = s.getStudents();
            for (Student current : students) {
              System.out.println(current.ToString());
            }
            break;
          case 3:
            Scanner inputLastName = new Scanner(System.in);
            System.out.print("Wprowadź nazwisko do wyszukania: ");
            String searchLastName = inputLastName.nextLine();
            Student searchedStudent = s.findStudentByName(searchLastName);
            if (searchedStudent != null) {
              System.out.println("Znaleziono studenta: " + searchedStudent.ToString());
            } else {
              System.out.println("Nie znaleziono studenta o podanym nazwisku.");
            }
            break;
          case 4:
            TestWrongAge.main(args);
            WrongStudentName.main(args);
            WrongDateOfBirth.main(args);
          case 5:
            try {

              int wynik = 5 / 0; // Potencjalnie błędna operacja

              System.out.println("Wynik: " + wynik);

            } catch (ArithmeticException e) {

              System.out.println("Wystąpił błąd arytmetyczny: " + e.getMessage());

            } finally {

              System.out.println("To jest blok finally.");

            }
        }
      }

    } catch (

    IOException e) {
    }
  }
}