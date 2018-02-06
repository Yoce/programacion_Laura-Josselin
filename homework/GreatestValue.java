/*****
GreatestValue.java
Laura Josselin Hernandez Garcia
This program prints the largest number
*****/
import javax.swing.JOptionPane;
public class GreatestValue{
  public static void main (String[]args){
    float A;//primer valor
    float B;//Segundo valor
    float C;//Tercer valor
    float M;//Valor mayor
    A=Float.parseFloat(JOptionPane.showInputDialog("Enteger the first number"));
    B=Float.parseFloat(JOptionPane.showInputDialog("Enter the seond number"));
    C=Float.parseFloat(JOptionPane.showInputDialog("Enter the third number"));
    if (A>B && A>C){
      M=A;
      JOptionPane.showMessageDialog(null, "The largest number is " + M);
    }else if(B>A && B>C){
      M=B;
      JOptionPane.showMessageDialog(null, "The largest number is " + M);
    }else if(C>A && C>B){
      M=C;
      JOptionPane.showMessageDialog(null, "The largest number is " + M);
    }else {
      JOptionPane.showMessageDialog(null, "Enter a correct number");
    }
  }
}
