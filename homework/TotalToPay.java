/*****
TotalToPay.java
Laura Josselin hernandez Garcia
This program calculates the total to pay
******/
import javax.swing.JOptionPane;
public class TotalToPay{
  public static void main(String[] args) {
    int X ;//Cantidad de lapices
    double PAG;//pago que realizara por los lapices
    X=Integer.parseInt(JOptionPane.showInputDialog("Entrer the amount of pencils"));
    if (X>=1000){
      JOptionPane.showMessageDialog(null,"The total to pay is " + X*.85 + " pesos");
    }//end if
    else{
      JOptionPane.showMessageDialog(null,"The total to pay is " + X*.90 +" pesos");
    }//end else
  }//end main
}//end class
