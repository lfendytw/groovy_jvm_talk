public class Person {
  private String name;
  private String dob;
  private String gender;

  public Person(String name, String dob, String gender){
    this.name = name;
    this.dob = dob;
    this.gender = gender;
  }

  public String getName(){
    return this.name;
  }

  public String getDob(){
    return this.dob;
  }

  public String getGender(){
    return this.gender;
  }
}
