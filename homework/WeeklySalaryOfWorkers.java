/******
WeeklySalaryOfWorkers.java
Laura Josselin Hernnandez Garcia
This program calculates the weekly salary of a number of workers
*******/
import javax.swing.JOptionPane;
public class WeeklySalaryOfWorkers{
  public static void main(String[] args) {
    int N;//numero de trabajadores
    float HT;//horas trabajadas
    float PH;//pago por horas
    float SS=0;//sueldo semanal
    int I=0;//Contador del ciclo de empleado
    N=Integer.parseInt(JOptionPane.showInputDialog("Enter the number of workers"));
    PH=Float.parseFloat(JOptionPane.showInputDialog("Enter the payment per hour"));
    while (I<=N-1){
    I++;
    HT=Float.parseFloat(JOptionPane.showInputDialog("Enter the hours worked in the worker's week " + I));
    SS=(HT*PH);
    JOptionPane.showMessageDialog(null,"The weekly salary of the worker "+I +" is "+ SS);
    }
    JOptionPane.showMessageDialog(null,"The total to be paid is "+ SS*N );
  }//end main
}//end class
