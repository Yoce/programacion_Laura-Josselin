/*******
Staff1.java
Laura Josselin hernandez Garcia
this s a class
******/
public class Staff1 extends Person1{
  private String school;
  private double pay;
  public Staff1(String name, String address,String school, double pay){
    super(name,address);
    this.school=school;
    this.pay=pay;
  }
  public String getSchool(){
    return this.school;
  }
  public void setSchool(String school){
    this.school=school;
  }
  public double getPay(){
    return this.pay;
  }
  public void setPay(double pay){
    this.pay=pay;
  }
  @Override
  public String toString(){
    return "Staff1 person name: "+ super.getName()+"\nStaff1 person address: "+ super.getAddress()+"\nStaff1 person school: "+ getSchool()+"\nStaff1 person pay: "+ getPay();
  }
}
