/*******
BiggerNumber.java
Laura Josselin Hernandez Garcia
This program evaluates three numbers and prints the largest number
****/
import javax.swing.JOptionPane;
public class BiggerNumber{
  public static void main(String[] args) {
    double A, B, M;//numeros
    A=Double.parseDouble(JOptionPane.showInputDialog("Enter the first number "));
    B=Double.parseDouble(JOptionPane.showInputDialog("Enter the second number"));
    if (A>B){
      M=A
      JOptionPane.showMessageDialog(null, "The greatest number is " + M);
    }//en if
    else if (B>A){
      M=B
      JOptionPane.showMessageDialog(null, "The greatest number is " +M);
    }//end if
    else
    JOptionPane.showMessageDialog(null, "Enter a correct number");
  }//end main
}//end class
