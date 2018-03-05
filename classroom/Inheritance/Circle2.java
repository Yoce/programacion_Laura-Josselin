import javax.swing.*;
public class Circle2 extends GeometricObject{
  private double radius;
  public Circle2(){
  }
  public Circle2(double radius){
    this.radius=radius;
  }
  public Circle2(double radius, String color, boolean filled){
    super(color, filled);
    this.radius=radius;
  }
  public double getRadius(){
    return this.radius;
  }
  public void setRadius(double radius){
    this.radius=radius;
  }
  public double getArea(){
    return Math.PI*Math.pow(this.radius,2);
  }
  public double getPerimeter(){
    return Math.PI*(this.radius*2);
  }
  public double getDiameter(){
    return this.radius*2;
  }
  @Override
  public String toString(){
  return"date created: "+super.getDateCreated()+"\n color "+super.getColor()+"\n area: "+getArea();
  }
  /*public void printCircle(){
   JOptionPane.showMessageDialog(null,"The circle created "+ getDateCreated() + "has a color "+ getColor());

 }*/
}
