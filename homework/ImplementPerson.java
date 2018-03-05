/*******
ImplementPerson.java
Laura Josselin Hernandez Garcia
This is a class
**********/
import javax.swing.*;
public class ImplementPerson{
  public static void main(String[] args) {
    Person person =new Person();
    person.setName(JOptionPane.showInputDialog("Enter your name"));
    person.setAge(Integer.parseInt(JOptionPane.showInputDialog("Enter your age")));
    person.setGender(JOptionPane.showInputDialog("Enter your gender H (Hombre) M (Mujer) ").charAt(0));
    person.setWeigth(Double.parseDouble(JOptionPane.showInputDialog("Enter your weigth")));
    person.setHeight(Double.parseDouble(JOptionPane.showInputDialog("Enter your height")));
    person.calculateBMI();
    person.isMayorDeEdad();
    if (person.isMayorDeEdad()==true){
      JOptionPane.showMessageDialog(null, "You are of legal age");
    }else
    JOptionPane.showMessageDialog(null, "You are a minor");
    person.generateDNI();
    JOptionPane.showMessageDialog(null,"Name " +person.getName(),"\n Your DNI is:"+ person.generateDNI()+"\nGender:"+person.getGender()+"\n Your are "+person.isMayorDeEdad()+"You are:"+person.calculateBMI());
    Person person2 = new Person();
    person2.setName(person.setName);
    person2.setAge(person.setAge);
    person2.setGender(person.setGender);
    person2.setWeight(80);
    person2.setHeight(1.36);
    person2.isMayorDeEdad();
    if (person2.isMayorDeEdad()==true){
      JOptionPane.showMessageDialog(null, "You are of legal age");
    }else
    JOptionPane.showMessageDialog(null, "You are a minor");
    person2.calculateBMI();
    if (person2.calculateBMI()==-1){
      return "You are underweight";
    }else if (person2.calculateBMI()=0){
      return "You are at your ideal weight";
    }else
    return "You are overweight";
    person2.generateDNI();
    JOptionPane.showMessageDialog(null,"Name " +person2.getName(),"\n Your DNI is:"+ person2.generateDNI()+"\nGender:"+person2.getGender()+"\n Your are "+person2.isMayorDeEdad()+"You are:"+person2.calculateBMI());
    */
    /*Person person3=new Person("Laura",20,"H",90.150,1.86);
    if (isMayorDeEdad()==true){
      JOptionPane.showMessageDialog(null, "You are of legal age");
    }else
  JOptionPane.showMessageDialog(null, "You are a minor");
  */

  /*person3.calculateBMI();
    if (calculateBMI()=-1){
      return "You are underweight";
    }else if (calculateBMI()=0){
      return "You are at your ideal weight";
    }else
    return "You are overweight";
    person3.generateDNI();
    JOptionPane.showMessageDialog(null,"Name " +person.setName(),"\n Your DNI is:"+ person.generateDNI()+"\nGender:"+person.setGender()+"\n Your are "+person.isMayorDeEdad()+"You are:"+person.calculateBMI());
    */
 }
}
