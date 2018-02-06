/*****
BudgetOfSmokedLobster.java
Laura Josselin Hernandez Garcia
This program prints a budget for the smoked lobster company.
*****/
import javax.swing.JOptionPane;
public class BudgetOfSmokedLobster{
  public static void main(String[] args) {
    int NP;//Numero de personas
    final float TOT;//Total que se va a pagar por el banquete
    NP=Integer.parseInt(JOptionPane.showInputDialog("Enter the number of people"));
    if(NP<=200){
      TOT=NP*95;
    JOptionPane.showMessageDialog(null,"The total to pay is $ "+ TOT);
    }//end if
    else if(NP>200 && NP<=300){
      TOT=NP*85;
      JOptionPane.showMessageDialog(null,"The total to pay is $ "+ TOT);
    }//end if
    else if(NP>300){
      TOT=NP*75;
      JOptionPane.showMessageDialog(null,"The total to pay is $ "+ TOT);
    }//end if
  }//end main
}//end class
