/**********
* Autor:Laura Josselin Hernandez Garcia
* Nombre:ConverterMetrejava
* Description:This program converters of metres a inch.
***********/
import java.util.Scanner;
public class ConverterMetre{
  public static void main (String[]args){
  double CM;//cantidad d emetros que requiere
  double PG;//pulgadas que debe requerir
  double PULGADA=0.0254;
  System.out.println("Ingrese la cantidad de metros");
  Scanner metros = new Scanner (System.in);
  CM=metros.nextInt();
  PG=CM/PULGADA;
  System.out.println("Lo que va a requerir en pulgadas es "+ PG);
}//end class
}//end ConerterMetre
