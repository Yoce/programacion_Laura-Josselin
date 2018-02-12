/******
TotalSales.java
Laura Josselin hernandez Garcia
this program calculates the total sales of a store
*******/
import javax.swing.JOptionPane;
public class TotalSales{
  public static void main(String[] args) {
  int N;//numero de ventas
  int CN=0;//contador de ventas
  int A=0;//ventas mayores a mil
  int B=0;//ventas mayores a quinientos pero menores o igual a mil
  int C=0;//ventas menores o iguales a quinientos
  float V;//monto de ventas
  float T1=0;//total de ventas mayores a A
  float T2=0;//total de ventas tipo B
  float T3=0;//total de ventas tipo C
  float TT;//total de ventas
  N=Integer.parseInt(JOptionPane.showInputDialog("Enter the sales number"));
  while (CN<N){
    CN++;
    V=Float.parseFloat(JOptionPane.showInputDialog("Enter the amount of the sale "+CN));
    if(V>1000){
    A++;
    T1+=V;
    }//END IF
    else if(V>500 && V<=1000){
    B++;
    T2+=V;
    }//ende else if
    else if (V<=500){
      C++;
      T3+=V;
    }//end else if
  }//end while
  JOptionPane.showMessageDialog(null,"Sales greater than 1000 are "+ A+ "\nSales greater than 500 but less than or equal to 1000 are "+ B+ "\nSales under 500 "+ C);
  JOptionPane.showMessageDialog(null,"Total sales greater than a thousand "+T1+"\nTotal sales greater than five hundred but less than or equal to one thousand "+T2+"\nTotal sales less than five hundred "+T3);
  }//end main
}//end class
