/*******
ImplementPerson.java
Laura Josselin Hernandez Garcia
This is a class
**********/
import javax.swing.*;
public class ImplementPerson{
  public static void main(String[] args) {
    String name=JOptionPane.showInputDialog("Enter your name");
    int age=Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
    char gender=JOptionPane.showInputDialog("Enter your gender H (Hombre) M (Mujer) ").charAt(0);
    double weigth=Double.parseDouble(JOptionPane.showInputDialog("Enter your weigth"));
    double height=Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
    Person person;
    person=new Person(name,age, gender, weigth, height);
    JOptionPane.showMessageDialog(null,"Name: "+name+"\n Gender: "+ gender);
    person.isMayorDeEdad();
    if (person.isMayorDeEdad()==true){
      JOptionPane.showMessageDialog(null, "You are of legal age");
    }else
    JOptionPane.showMessageDialog(null, "You are a minor");
    person.calculateBMI();
    if (person.calculateBMI()==-1){
      JOptionPane.showMessageDialog(null,"You are underweight");
    }else if (person.calculateBMI()==0){
    JOptionPane.showMessageDialog(null,"You are at your ideal weight");
    }else
    JOptionPane.showMessageDialog(null,"You are overweight");
    person.generateDNI();

    Person person2 ;
    person2= new Person(name,age,gender);
    JOptionPane.showMessageDialog(null,"Name: "+name+"\n Gender: "+ gender);
    person2.isMayorDeEdad();
    if (person2.isMayorDeEdad()==true){
      JOptionPane.showMessageDialog(null, "You are of legal age");
    }else
    JOptionPane.showMessageDialog(null, "You are a minor");
    person2.generateDNI();

  
    Person person3=new Person();
    if (person3.isMayorDeEdad()==true){
      JOptionPane.showMessageDialog(null, "You are of legal age");
    }else
  JOptionPane.showMessageDialog(null, "You are a minor");
  person3.calculateBMI();
    if (person3.calculateBMI()==-1){
      JOptionPane.showMessageDialog(null,"You are underweight");
    }else if (person3.calculateBMI()==0){
    JOptionPane.showMessageDialog(null,"You are at your ideal weight");
    }else
    JOptionPane.showMessageDialog(null,"You are overweight");
    person3.generateDNI();
 }
}
