/******
PairNumners.java
Laura Josselin Hernandez Garcia
This program prints the number of numbers that are even between 1 and 100
*******/
import javax.swing.JOptionPane;
public class PairNumners{
  public static void main(String[] args) {
    int N=0;//numero par por generar
    for (int i=2;i<=100 ;i+=2) {
      N++;
    }//end for
    JOptionPane.showMessageDialog(null,"The total number of pairs is "+N);
  }//end main
}//end class
