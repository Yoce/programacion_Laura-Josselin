/*****
ImplementPerson1.java
Laura Josselin Hernandez  Garcia
this is a class
******/
import javax.swing.*;
public class Person1Implement{
  public static void main(String[] args) {
    Student1 estudiante=new Student1 ("Laura","Francisco Villa S/N","TIC",18,1500);
    JOptionPane.showMessageDialog(null, estudiante.toString());
    Staff1 personal=new Staff1 ("Denisse","Calle Nacional 45","UVP",1450);
    JOptionPane.showMessageDialog(null, personal.toString());
  }
}
