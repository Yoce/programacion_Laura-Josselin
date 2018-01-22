/**********
* Autor:Laura Josselin Hernandez Garcia
* Nombre: PagoConagua.java
* Description: This program
***********/
import java.util.Scanner;
public class PagoConagua{
  public static void main (String[]args){
    double A;//altura de la alberca
    double L;//largo de la alberca
    double N;//ancho de la alberca
    double CM;//costo del metro cubico
    double V;//volumen de la alberca
    double PAG;//pagoa realizar por el consumo
    System.out.println("Ingrese la medida de la altura");
    Scanner altura=new Scanner (System.in);
    A=altura.nextInt();
    System.out.println("Ingrese la medida del largo");
    Scanner largo=new Scanner(System.in);
    L=largo.nextInt();
    System.out.println("Ingrese la medida del ancho");
    Scanner ancho= new Scanner (System.in);
    N=ancho.nextInt();
    System.out.println("Ingrese el costo por metro cubico");
    Scanner costo= new Scanner (System.in);
    CM=costo.nextInt();
    V=(L*N)*A;
    PAG=V*CM;
    System.out.println("El pago a realizar es " + PAG);
  }//end main
}//end PagoConagua
