/******
Contraseña.java
Laura Josselin Hernandes Garcia
this class prints if a password is strong or not
*********/
import javax.swing.*;
public class Contraseña{
  //Contraseña properties
  private int longitud;
  private String contraseña;
  //sets the contraseña's longitud
  public void setlongitug(int longitud){
    this.longitud=longitud;
  }
  public int getlongitud(){
    return this.longitud;
  }
  //sets the contraseña's contraseña
  public void setcontraseña(String contraseña){
    this.contraseña=contraseña;
  }
  public String getcontraseña(){
    return this.contraseña;
  }
  //Proceso de contraseña
  public static void main(String[] args) {
    contraseña=JOptionPane.showInputDialog("Ingrese su contraseña");
    longitud=contraseña.length();
    if (longitud=7){
        isStrong(longitud=7)
    }
    else
      JOptionPane.showMessageDialog("ERROR"+"\nSu contraseña debe contener 8 caracteres");


}
}
