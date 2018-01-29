/******
IfControlStatement.java
Laura  Josselin Hernandez Garcia
This program checks for period at the end of line.
*********/
import javax.swing.JOptionPane;
public class IfControlStatement{
  public static void main (String[]args){
    String sentence;
    int lastChanterPosition;
    sentence= JOptionPane.showInputDialog("Enter your sentence");
    lastChanterPosition=sentence.length()-1;
    if (sentence.charAt(lastChanterPosition)!= '.') {
      JOptionPane.showMessageDialog(null, "Invalid Entry - Your sentence needs a period");
    }//end if
  }//end main
}//end class
