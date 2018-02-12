/*******
AverageStudent.java
Laura Josselin hernandez Garcia
This program calculates the average of a number of students
******/
import javax.swing.JOptionPane;
public class AverageStudent{
  public static void main(String[] args) {
    int C=1;//Contador
    int ED;//edad de cada alumno
    int SU=0;//suma de las edades
    int NU=0;//numero de alumnos
    final float PR;//edad promedio
    NU=Integer.parseInt(JOptionPane.showInputDialog("Enter number of students"));
    while (C<=NU){
      ED=Integer.parseInt(JOptionPane.showInputDialog("Enter the student's age "+C));
      SU+=ED;
      C++;
    }//end while
    PR=SU/NU;
    JOptionPane.showMessageDialog(null,"The average age of the students is " + PR);
  }//end main
}//end class
