/******
Person1.java
Laura Josselin Hernandez Garcia
*********/
public class Person1{
  private String name;
  private String address;
  public Person1 (String name, String address){
  this.name=name;
  this.address=address;
  }
  public String getName(){
    return this.name;
  }
  public String getAddress(){
    return this.address;
  }
  public void setAddress(String address){
    this.address=address;
  }
  @ Override
  public String toString(){
    return "Person name: "+ getName()+"\n Person address: "+ getAddress();
  }
}
