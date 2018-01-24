/*******
* Autor:Laura Josselin Hernandez Garcia
* Nombre:AreaCircunference.java
* Description: this program calculates the area of circumference
********/
import java.util.Scanner;
  public class AreaCircunference{
    public static void main (String[]args){
      double R;//medida del radio
      double PI=3.1416;
      double Area;//area de la cirfunferencia
      System.out.println("Ingrese la medida del radio");
      Scanner radio = new Scanner (System.in);
      R=radio.nextInt();
      Area=R*R*PI;
      System.out.println("El area de la circunferenci es " + Area);
    }
  }
