/********
Laura Josselin Hernandez Garcia
PrintPurchaseOrder.java
This program calculates and prints a purchase order amount
**********/
import java.util.Scanner;
public class PrintPurchaseOrder{
  public static void main (String []args){
    Scanner userData=new Scanner(System.in);
    double price;
    int quantity;
    String name;
    System.out.println("Enter the name product ");
    name=userData.nextLine();
    System.out.println("Enter the price ");
    price=userData.nextDouble();
    System.out.println("Enter the quantity");
    quantity=userData.nextInt();
    System.out.println("Total purchase order  " + name +" $ " + price*quantity);
  }
}
