/******
TotalHoursAndSalary.java
Laura Josselin Hernandez Garcia
This program calculates the total hours and the salary of a worker
*********/
import javax.swing.JOptionPane;
public class TotalHoursAndSalary{
  public static void main(String[] args) {
    int D=0;//contador del ciclo de dias
    float PH;//pago por hora
    int SH=0;// horas trabajadas en la semana
    int HT;//horas trabajadas por dia
    float SU;// sueldo semanal
    PH=Float.parseFloat(JOptionPane.showInputDialog("Enter the payment per hour"));
    while (D<=5){
      D++;
      HT=Integer.parseInt(JOptionPane.showInputDialog("Enter the hours worked in the day "+ D));
      SH+=HT;
    }//end while
    SU=PH*SH;
    JOptionPane.showMessageDialog(null,"The weekly salary of the worker is "+ SU);
  }//end main
}//end class
