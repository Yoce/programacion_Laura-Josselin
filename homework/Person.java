/******
Person.java
Laura Josselin Hernandez Garcia
this is a class
******/
import javax.swing.*;
public class Person{
  private String H="Hombre";
  private String name="";
  private int age=0;
  private int DNI;
  private char gender='H';
  private double weigth=0;
  private double height=0;
  //Metodos SET
  public void setName(String name){
    this.name=name;
  }
  public void setAge(int age){
    this.age=age;
  }
  public void setGender(char gender){
    this.gender=gender;
  }
  public void setWeigth(double weigth){
    this.weigth=weigth;
  }
  public void setHeight(double height){
    this.height=height;
  }
  //methods
  public Person(){
    JOptionPane.showMessageDialog(null, this.name=" ");
    JOptionPane.showMessageDialog(null, this.age=0);
    JOptionPane.showMessageDialog(null,this.gender=' ');
    JOptionPane.showMessageDialog(null,this.weigth=0);
    JOptionPane.showMessageDialog(null,this.height=0);

  }
public Person(String name, int age, char gender){
  this.name = name;
  this.age=age;
  this.gender=gender;
  this.DNI=DNI;
  this.weigth=0;
  this.height=0;

  }
  public Person(String name, int age, char gender, double weigth, double height){
    this.name=name;
    this.age=age;
    this.DNI=DNI;
    this.gender=gender;
    this.weigth=weigth;
    this.height=height;
  }
  public int calculateBMI(){
    double bmi=this.weigth/(Math.pow(this.height,2));
    if (bmi<20){
      return -1 ;
      } else if(bmi>=20 && bmi<=25){
      return 0;
    }else
      return 1;
  }
    public Boolean isMayorDeEdad(){
      if (this.age>=18){
        return true;
      }
      else
      return false;
    }//end isMayorDeEdad
  public int generateDNI(){
  return this.DNI=(int)(Math.random()*(9999999-1+1)+9999999);
  }
}//public class person
