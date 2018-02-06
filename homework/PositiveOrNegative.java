/****
PositiveNumber.java
Laura Josselin Hernandez Garcia
This promgram prints if a number is posotive or negative
******/
 import javax.swing.JOptionPane;
 public class PositiveOrNegative{
   public static void main(String[] args) {
     double number;
     number=Double.parseDouble(JOptionPane.showInputDialog("Enter a number"));
     if (number>0){
       JOptionPane.showMessageDialog(null,"Your number is POSITIVE");
     }
     else{
       JOptionPane.showMessageDialog(null, "Your number is negaive");
     }//en if
   }//end main
 }//end class
