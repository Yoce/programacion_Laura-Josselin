/*********
Laura Josselin hernandez Garcia
FreeFries.java
this program reads points scored by home team and the opposing team and determines IF the fans win free
********/
import javax.swing.JOptionPane;//para utilizar modo grafico GUI
public class FreeFries{
  public static void main(String[]args){
    int homePoints;
    int opponentPoints;
    homePoints=Integer.parseInt(JOptionPane.showInputDialog("Enter home points"));
    opponentPoints=Integer.parseInt(JOptionPane.showInputDialog("Enter opponent Points"));
    if (homePoints>opponentPoints && homePoints>=100){
      JOptionPane.showMessageDialog(null, "A free order of French Fries for White Tigers Fans");
    }
  }
}
