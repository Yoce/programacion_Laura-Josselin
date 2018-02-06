/******
DiscountAndTotal.java
Laura Josselin Hernandez Garcia
this program calculates the discount and the total to pay for a suit
******/
import javax.swing.JOptionPane;
public class DiscountAndTotal{
  public static void main(String[] args) {
  float CT;//costo del traje
  float DE;//descuento que se obtendra
  double PF;//precio final del traje
  CT=Float.parseFloat(JOptionPane.showInputDialog("Enter the cost of the suit"));
  if (CT>2500){
    PF=CT*1.15;
  JOptionPane.showMessageDialog(null,"The discount is $ " + CT*.15 + " \nThe total to pay is $ " + PF);
}//end if
else{
  PF=CT*1.08;
  JOptionPane.showMessageDialog(null, "The discount is $ " + CT*.08 + " \nThe total to pay is $ " + PF);
}//end else
}//end main
}//end class
