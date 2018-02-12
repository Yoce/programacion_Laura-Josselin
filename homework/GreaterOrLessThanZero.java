/*******
GreaterOrLessThanZero.java
Laura Josselin Hernandes Garcia
This program prints the number of numbers greater or less than 0
********/
import javax.swing.JOptionPane;
public class GreaterOrLessThanZero{
  public static void main(String[] args) {
    int C=0;//contador
    int CA;//cantidad a leer
    int CP=0;//cantidades positivas
    int CN=0;//cantidades negativas
    char more;
    do{
      C++;
      CA=Integer.parseInt(JOptionPane.showInputDialog("The number number "+C));
    more=JOptionPane.showInputDialog("Do you want to add another number? (y/n) or (Y/N)").charAt(0);
    if (CA<0){
      CN++;
    }//end if
    else if (CA>0){
      CP++;
    }//end else if
  }while (more=='y' || more=='Y');
      JOptionPane.showMessageDialog(null,"The positive number of numbers is "+ CP+ " \n The negative number of numbers is "+ CN );
  }//end main
}//end class
