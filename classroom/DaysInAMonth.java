/*****
DaysInAMonth.java
Laura Josselin Hernandez Garcia
This program finds the number of days in a month
*********/
import javax.swing.JOptionPane;
public class DaysInAMonth{
  public static void main(String[] args) {
    int numberOfDaysInAMonth=0;
    String monthOfYear;
    int numberYear;
    numberYear=JOptionPane.showInputDialog("Enter the year ");
    monthOfYear=JOptionPane.showInputDialog("Enter your month");
    switch(monthOfYear){
      case "January":
        numberOfDaysInAMonth=31;
        break;
      case "February":
        numberOfDaysInAMonth=28;
        break;
        if (numberYear%4=0){
          case "February":
          numberOfDaysInAMonth=29;
          break;
      }
      case "March":
      numberOfDaysInAMonth=31;
      break;
      case "April":
      numberOfDaysInAMonth=30;
      break;
      case "May":
      numberOfDaysInAMonth=31;
      break;
      case "jun":
      numberOfDaysInAMonth=30;
      break;
      case "Julay":
      numberOfDaysInAMonth=31;
      break;
      case "August":
      numberOfDaysInAMonth=31;
      break;
      case "September":
      numberOfDaysInAMonth=30;
      break;
      case "October":
      numberOfDaysInAMonth=31;
      break;
      case "November":
      numberOfDaysInAMonth=30
      break;
      case "Dicember":
      numberOfDaysInAMonth=31;
      break;
    }//end switch
  }
}
