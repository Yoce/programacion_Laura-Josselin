/**********
* Autor:Laura Josselin Hernandez Garcia
* Nombre:CalculatesSalary.java
* Description: This program calculates the salary of a worker.
***********/
import java.util.Scanner;
public class CalculatesSalary{
  public static void main (String[]args){
    double HT;//horas trabajadas
    double PH;//pago por hora
    double SS;//sueldo semanal
    int DIAS=6;//dias que trabaja a la semana
    System.out.println("Ingrese las horas trabajadas");
    Scanner horas = new Scanner(System.in);
    HT=horas.nextInt();
    System.out.println("Ingrese el pago por hora");
    Scanner pago = new Scanner(System.in);
    PH=pago.nextInt();
    SS=(HT*PH)*DIAS;
    System.out.println("El salario del trabajador es " + SS + " pesos");
  }
}
