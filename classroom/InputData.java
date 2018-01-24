/****
Laura Josselin Hernandez Garcia
InputData.java
This programa displays a perzonalized Hello greeting
*******/
import java.util.Scanner;

public  class InputData{
  public static void main(String[] args) {
    Scanner userData = new Scanner (System.in);
    String name;
    System.out.println("Enter your name ") ;
    name=userData.nextLine();
    System.out.println("Hello "+ name + " !" );
  }
}
