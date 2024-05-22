public class Student {

  private String Name;
  private int Age;
  private String Lname;
  private String Date;

  public Student(String name, String lname, int age, String date) {
    Name = name;
    Age = age;
    // 4_2
    Lname = lname;
    // 4_4 date urodzenia w innej formie
    Date = date;
  }

  public String GetName() {
    return Name;
  }

  public int GetAge() {
    return Age;
  }

  public String ToString() {
    return Name + " " + Lname + " " + Integer.toString(Age) + " " + Date;
  }

  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if (data.length != 4)
      return new Student("Parse Error", "error", -1, "error");
    return new Student(data[0], data[1], Integer.parseInt(data[2]), data[3]);
  }
}