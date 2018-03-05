/*******
Student1.java
Laura Josselin Hernandez Garcia
This is a class
******/
public class Student1 extends Person1{
  //propiertes
  private String program;
  private int year;
  private double fee;
  //methods
  public Student1(String name, String address,String program, int year, double fee){
    super (name,address);
    this.program=program;
    this.year=year;
    this.fee=fee;
  }
  public String getProgram(){
    return this.program;
  }
  public void SetPromgram(String program){
    this.program=program;
  }
  public int getYear(){
    return this.year;
  }
  public void setYear(int year){
    this.year=year;
  }
  public double getFee(){
    return this.fee;
  }
  public void setFee(double fee){
    this.fee=fee;
  }
  @Override
  public String toString(){
    return "Student1 person name: "+ super.getName()+"\nStudent person address: "+ super.getAddress()+"\nStudent person program: "+ getProgram()+"\nStudent person year: "+ getYear()+"\nStudent person fee: "+ getFee();
  }
}
