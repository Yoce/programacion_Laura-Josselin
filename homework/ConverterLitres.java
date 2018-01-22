/*******
* Autor:Laura Josselin Hernandez Garcia
* Nombre:ConverterLitres.java
* Description: this program convertes litres a gallon.
********/
import java.util.Scanner;
public class ConverterLitres{
  public static void main (String[]args){
      int L;//cantidad de litros que produce
      double PG;//precio de galon
      double TG;//cantidad e galones que produce
      double GA;//gancncia por la entrega de leche
      double GAL=3.785;
      System.out.println("Ingrese la cntidad de litros que produce al dia");
      Scanner litros = new Scanner (System.in);
      L=litros.nextInt();
      System.out.println("Ingrese el precio del galon");
      Scanner precioGalones = new Scanner (System.in);
      PG=precioGalones.nextInt();
      TG=L/GAL;
      GA=TG*PG;
      System.out.println("Las ganancias del dia son " + GA + " pesos" );
  }//end main
}//end ConverterLitres
