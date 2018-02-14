/********
DogDriver.java
Laura Josselin Hernandez Garcia
This program creat dog objects and uses dog class
********/
import javax.swing.*;
public class DogDriver{
  public static void main(String[] args) {
    Dog fido;
    fido=new Dog();
    fido.setColor("black");
    fido.setEyeColor("blue");
    JOptionPane.showMessageDialog(null,fido.getColor());
    JOptionPane.showMessageDialog(null,fido.getEyeColor());
    fido.eating();
    fido.bark();
    fido.slepping();
    //--------------------------
    Dog fufi=new Dog();
    fufi.setColor("black an blue");
    fufi.setColor("purple");
    JOptionPane.showMessageDialog(null,"fufi's eyes color is "+fufi.getEyeColor());

    fufi.slepping();
  }
}
