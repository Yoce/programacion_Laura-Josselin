/***********
SumOfTenAmounts.java
Laura Josselin Hernandez Garcia
this program calculates the sum of ten different quantities and shows the result on the screen
***********/
import javax.swing.JOptionPane;
public class SumOfTenAmounts{
  public static void main(String[] args) {
    int C=0;//Contador
    float VA;//valor por sumar
    float SU=0;//suam de los valores
    char more;
    do{
    C++;
    VA=Float.parseFloat(JOptionPane.showInputDialog("Enter a value "+C));
    more=JOptionPane.showInputDialog("Do you want to add another number? (y/n) or (Y/N)").charAt(0);
    SU+=VA;
    }while(more=='y'|| more=='Y');
    JOptionPane.showMessageDialog(null,"The sum of the values ​​is " + SU);
  }//end main
}//end class
