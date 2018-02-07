/*****
CostPerCall.java
Laura Josselin Hernandez Garcia
This program calculates the cost of a call.
******/
import javax.swing.JOptionPane;
public class CostPerCall{
  public static void main(String[] args) {
    int TI;//Tiempo
    String DI;//Tipo de dia
    String TU;//Turno
    float PAG;//Pago por tiempo
    float IMP;//Impuesto
    final float TOT;//Total que se va a pagar
    TI=Integer.parseInt(JOptionPane.showInputDialog("Enter the time of the call"));
    DI=JOptionPane.showInputDialog("Enter the day of the week");
    TU=JOptionPane.showInputDialog("Enter the turn ");
    
  }//end main
}//end class
