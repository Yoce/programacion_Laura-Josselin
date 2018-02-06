/*****
TravelPayment.java
Laura Josselin Hernandez Garcia
This program calculates the cost of a student trip
*****/
import javax.swing.JOptionPane;
public class TravelPayment{
  public static void main(String[] args) {
    int NA;//Numero de alumnos que realizan el viaje
    float PA;//Pago por alumnos
    final float TOT;//Total que va a pagar la empresa por el viaje
    NA=Integer.parseInt(JOptionPane.showInputDialog("enter the number of students"));
    if (NA>=100){
      PA=65;
      TOT=PA*NA;
      JOptionPane.showMessageDialog(null,"The cost per student is $ "+PA+ "\nThe total to pay for the trip is "+TOT);
    }//end if
    else if(NA<=99 && NA>=50){
      PA=70;
      TOT=PA*NA;
      JOptionPane.showMessageDialog(null,"The cost per student is $ "+PA+ "\nThe total to pay for the trip is "+TOT);
    }//end if
    else if(NA<=49 && NA>=30){
      PA=95;
      TOT=PA*NA;
      JOptionPane.showMessageDialog(null,"The cost per student is $ "+PA+ "\nThe total to pay for the trip is "+TOT);
    }//end if
    else if(NA<30){
      PA=4000/NA;
      TOT=PA*NA;
      JOptionPane.showMessageDialog(null,"The cost per student is $ "+PA+ "\nThe total to pay for the trip is "+TOT);
    }//end if
    else{
      JOptionPane.showMessageDialog(null,"Enter the value correct");
    }//end else
  }//end main
}//end class
