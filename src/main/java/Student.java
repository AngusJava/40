public class Student {

  private String Name;
  private int Age;
  private String Lname;

  public Student(String name, String lname, int age) {
    Name = name;
    Age = age;
    //4_2
    Lname = lname;
  }

  public String GetName() {
    return Name;
  }

  public int GetAge() {
    return Age;
  }

  public String ToString() {
    return Name + " " + Lname + " " + Integer.toString(Age);
  }

  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if (data.length != 3)
      return new Student("Parse Error", "error", -1);
    return new Student(data[0], data[1], Integer.parseInt(data[2]));
  }
}