public class Student {

  private String Name;
  private int Age;
  private String Lname;
  private String Date;
  private int Date_day;
  private int Date_mouth;
  private int Date_year;

  public Student(String name, String lname, int age, String date, int data_day, int data_mouth, int data_year) {
    Name = name;
    Age = age;
    Lname = lname;
    Date = date;
    Date_day = data_day;
    Date_mouth = data_mouth;
    Date_year = data_year;
  }

  public String GetName() {
    return Name;
  }

  public int GetAge() {
    return Age;
  }

  public String GetLname() {
    return Lname;
  }

  public String ToString() {
    return Name + " " + Lname + " " + Integer.toString(Age) + " " + Date + " " + Date_day + "-" + Date_mouth + "-"
        + Date_year;
  }

  public static Student Parse(String str) {
    String[] data = str.split("[ -]");
    if (data.length != 7)
      return new Student("Parse Error", "error", -1, "error", -1, -1, -1);
    return new Student(data[0], data[1], Integer.parseInt(data[2]), data[3], Integer.parseInt(data[4]),
        Integer.parseInt(data[5]), Integer.parseInt(data[6]));
  }
}
