/**********
* Autor:Laura Josselin Hernandez Garcia
* Nombre:CalculatesAreaCono .java
* Description: This program
****/
import java.util.Scanner;
public class CalculatesAreaCono{
  public static void main (String[]args){
    double R;//base del triangulo rectangulo y radio
    double H;//hipotenusa del triangulo rectangulo
    double C;// cateto faltante
    double AT;//area triangular
    double AC;//area circular
    double PI=3.1416;
    double Area;//area de la figura
    System.out.println("Ingrese la medida del radio");
    Scanner radio = new Scanner (System.in);
    R=radio.nextInt();
    System.out.println("Ingrese la medida de la hipotenusa");
    Scanner hipotenusa=new Scanner (System.in);
    H=hipotenusa.nextInt();
    AC=(PI*(R*R))/2;
    C=Math.sqrt((R*R)+(H*H));
    AT=((R*C)/2)*2;
    Area=AC+AT;
    System.out.println("El area es " + Area);
  }//end main
}//end CalculatesAreaCono
