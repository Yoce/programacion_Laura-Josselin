/*********
Circle.java
Laura Josselin Hernandez Garcia
******/
import javax.swing.*;
public class Circle{
  //propiertes
  private double radius;//Se
  //constructor
  public Circle(){

  }
  public Circle(double radius){

  }
  // methods
  public void setRadius(double radius){
    this.radius=radius;
  }
  public double getRadius(){
    return this.radius;
  }
  public double getArea(){
    return Math.pow(this.radius,2)*Math.PI;
  }
  // Main method
  public static void main(String[] args) {
    double radius=Double.parseDouble(JOptionPane.showInputDialog("Enter the radius"));
    Circle circle =new Circle(radius);
    JOptionPane.showMessageDialog(null,"The circle's area with a radius of "+ circle.getRadius()+ "is "+ circle.getArea());
  }
}
