/**********
BMIOPPInplement.java
Laura Josselin Hernandez Garcia
*******/
import javax.swing.*;
public class BMIOOPInplement{
  public static void main(String[] args) {
    BMIOOP bmioop;
    bmioop=new BMIOOP();
    int opcion=0;
    while (opcion!=7) {
      opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"***MENU***"+"\n1.-Set name"+"\n2.-Set age"+"\n3.-Set weight"+"\n4.-Set height"+"\n5.-Calculate BMI"+"\n6.-Evaluate BMI"+"\n7.-Exit"));
      switch(opcion){
        case 1:
        bmioop.setName(JOptionPane.showInputDialog("name?"));
        break;
        case 2:
        bmioop.setAge(Integer.parseInt(JOptionPane.showInputDialog("Age?")));
        break;
        case 3:
        bmioop.setWeight(Double.parseDouble(JOptionPane.showInputDialog("weight?")));
        break;
        case 4:
        bmioop.setHeight(Double.parseDouble(JOptionPane.showInputDialog("height?")));
        break;
        case 5:
        bmioop.getBMI();
        break;
        case 6:
        JOptionPane.showMessageDialog(null,"Name: "+bmioop.getName()+"Your satust is"+bmioop.getStatus());
        break;
        default:
        JOptionPane.showMessageDialog(null,"ERROR.The values ​​you entered are incorrect");
        break;
      }//end switch
    }//end while
  }//end main
}//end class
