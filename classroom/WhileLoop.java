/*******
WhileLoop.java
Lura Josselin Hernandez Garcia
This program mskes entries in a bridal registry
*********/
import javax.swing.JOptionPane;
public class WhileLoop{
  public static void main(String[] args) {
  String registry="";
  char more;
  more=JOptionPane.showInputDialog("Do you want to create a bridal registry (y/n)").charAt(0);
  while(more=='y'){
    registry+=JOptionPane.showInputDialog("Enter item");
    registry+=JOptionPane.showInputDialog("\nEnter store");
    more=JOptionPane.showInputDialog("Any more items? (y/n)").charAt(0);
  }//end while
  if(!registry.equals("")){
    JOptionPane.showMessageDialog(null,"\nBridal registry\n"+registry);
  }//end if
  }//end main
}//end class
