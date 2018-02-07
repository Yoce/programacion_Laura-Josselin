/******
FactorialForLoop.java
Laura Josselin hernandez Garcia
This program prints the factorial of number
******/
import javax.swing.JOptionPane;
public class FactorialForLoop{
  public static void main(String[] args) {
    int factorial=1, number;
    number=Integer.parseInt(JOptionPane.showInputDialog("Enter the number"));
    for (int i=1;i<=number;i++) {
      factorial*=i;
    }//end for
    JOptionPane.showMessageDialog(null,"The factorial of "+number+ " is "+ factorial, "FACTORIAL", JOptionPane.OK_OPTION);
  }//end main
}//end class
