/**********
* Autor:Laura Josselin Hernandez Garcia
* Nombre: CalculatesAreaRectangle.java
* Description: This program calculates the area for rectangle
***********/
import java.util.Scanner;
public class CalculatesAreaRectangle{
  public static void main (String[]args){
    int A; //la altura de un rectangulo
    int B; //la base de un rectangulo
    int Area; //El area del rectangulo
    System.out.println("Ingresa la altura del rectangulo");
    Scanner A1 = new Scanner(System.in);
    A=A1.nextInt();
    System.out.println("Ingresa la base del rectangulo");
    Scanner B1 = new Scanner(System.in);
    B=B1.nextInt();
    Area=B*A;
    System.out.println ("El area del rectangulo es " + Area);
  }//end main
}//end CalculatesAreaRectangle
