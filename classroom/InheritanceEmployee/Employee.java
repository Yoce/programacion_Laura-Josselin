/******
Employee.java
Laura Josselin Hernandez Garcia
********/
import javax.swing.*;
public abstract class Employee{
  private String name;
  public Employee (String name){
    this.name=name;
  }
  public abstract double getPay();

  public void printPay(int date){
  }
}
