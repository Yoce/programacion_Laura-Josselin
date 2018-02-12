/*******
MonthlyPayment.java
Laura Josselin Hernandez Garcia
This program calculates the monthly payment that a person will make
*******/
import javax.swing.JOptionPane;
public class MonthlyPayment{
  public static void main(String[] args) {
  int I=0;//contador del ciclo de meses
  float P=10;//cantidad para pagar mensualmente
  float T=10;//pago total acumulado
  while (I<=19){
    I++;
    P=P+10;
    T+=10;
    JOptionPane.showMessageDialog(null,"The payment per month "+I+ " IS "+P);
  }//end while
  JOptionPane.showMessageDialog(null,"The accumulated payment is " +T);
}//end main
}//end class
