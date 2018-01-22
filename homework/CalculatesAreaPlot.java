/*******
* Autor:Laura Josselin Hernandez Garcia
* Nombre:CalculatesAreaPlot.java
* Description: this program calculates area of plot
********/
import java.util.Scanner;
public class CalculatesAreaPlot{
    public static void main (String[]args){
      int B;//Base del rectangulo y triangulo
      int A;//Altura del rectangulo triangulo juntos
      int C;//Altura del rectangulo
      int AT;//Area del triangulo
      int AR;//Area del rectangulo
      int Area;//Area del terreno
      System.out.println("Ingrse la medida de la base del terreno");
      Scanner base = new Scanner(System.in);
      B=base.nextInt();
      System.out.println("Ingrese la medida de la altura mayor del terreno");
      Scanner altura = new Scanner(System.in);
      A=altura.nextInt();
      System.out.println("Ingrese la medida de la altura menor del terreno");
      Scanner altura2 = new Scanner(System.in);
      C=altura2.nextInt();
      AT= (B*(A-C))/2;
      AR=B*C;
      Area=AT+AR;
      System.out.println("El area del terreno es " + Area);
    }//end main
}//end CalculatesAreaTerreno
