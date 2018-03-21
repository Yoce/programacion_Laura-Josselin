/******
DialList.java
Laura Josselin Hernandex Garcia
This promgram create a cell phone dial phone number list and prints the created list
*****/
import javax.swing.*;
public class DialList{
  public static void main(String[] args) {
  long [] phoneList; //list of phone numbers
  int sizeList;//number of phone numbers
  long phoneNum;//an entered phone number
  sizeList=Integer.parseInt(JOptionPane.showInputDialog("How many phone numbers would you like to enter?"));
  phoneList=new  long[sizeList];//inicializando
  for (int i=0;i<sizeList ;i++ ) {
    phoneNum=Long.parseLong(JOptionPane.showInputDialog("Enter a phone number"));
    phoneList [i]=phoneNum;
  }//end for
  for (int i=0;i<sizeList;i++ ) {
    JOptionPane.showMessageDialog(null,"index: " + i + " element number: " + (i+1) +" phone number: "+ phoneList[i]);
  }//end for
  }
}
