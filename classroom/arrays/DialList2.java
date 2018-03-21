/*******
DialList2.java
Laura Josselin Hernandez Garcia
This program creates  dial phone number list an prints the created list. It uses a partially filled array
*******/
import javax.swing.*;
public class DialList2{
  public static void main(String[] args) {
    String phoneList []=new String [100];//declaracion e inicializacion
    int filledNumbers=0;//number of phones
    String phoneNum;//an  entered phone number
    phoneNum=JOptionPane.showInputDialog(null,"Enter a phone number (or press q to QUIT)");
    while (!phoneNum.equalsIgnoreCase("q")&& filledNumbers< phoneList.length){
      if (phoneNum.length()<10){
        JOptionPane.showMessageDialog(null,"Must enter a valid number (10 characteres)");
      }else{
        phoneList[filledNumbers]=phoneNum;
        filledNumbers++;
      }
      phoneNum=JOptionPane.showInputDialog(null,"Enter a phone number (or press q to QUIT)");
    }//end while
    JOptionPane.showMessageDialog(null,"Dial List");
    for (int i=0; i<filledNumbers;i++ ) {
      JOptionPane.showMessageDialog(null,(i+1)+ " phone " + phoneList[i]);
    }
  }
}
