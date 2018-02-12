/********
SavingsInOneYear.java
Laura Josselin Hernandez Garcia
This program calculates a person's savings in a year
******/
import javax.swing.JOptionPane;
public class SavingsInOneYear{
  public static void main(String[] args) {
    float AH;//ahorro mensual
    int M=0;//contador del mes
    float CA=0;//cantidad que se va a horrar
    while(M<=11){
      M++;
      AH=Float.parseFloat(JOptionPane.showInputDialog("Enter the amount to be deposited for the month "+ M));
      CA+=AH;
    }//end while
    JOptionPane.showMessageDialog(null,"Your savings in one year is "+ CA);
  }//end main
}//end class
