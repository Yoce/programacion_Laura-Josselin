/******
AverageHeight.java
Laura Josselin Hernandez Garcia
This program calculates the average height of a number of people
*******/
import javax.swing.JOptionPane;
public class AverageHeight{
  public static void main(String[] args) {
    int C=0;//contador
    float ES;//estatura de cada persona
    float SU=0;//suma de estaturas
    float PR=0;//estatura promedio
    char more;
    do{
      C++;
      ES=Float.parseFloat(JOptionPane.showInputDialog("Enter the height of the person " +C));
      more=JOptionPane.showInputDialog("Do you want to add another number? (y/n) or (Y/N)").charAt(0);
      SU+=ES;
      PR=SU/C;
    }while (more=='y'|| more=='Y');
      JOptionPane.showMessageDialog(null,"The average height of people is "+PR);
  }//end main
}//end class
