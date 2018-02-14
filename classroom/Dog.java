/*}
Dog.java
Laura Josselin Hernandez Garcia
This class sets (Establecer) the dog's properties and methods}
*/
import javax.swing.*;
public class Dog
{
  //Dog's properties-Variables
  private String color;
  private String eyeColor;
  private double height;
  private double lenght;
  private double weight;

  //sets the dog's color
  public void setColor(String dogColor){
    color=dogColor;
  }
  //gets the dog's color
  public String getColor(){
    return color;
  }

  //sets dog's eyeColor
  public void setEyeColor(String dogEyeColor){
    eyeColor=dogEyeColor;
  }
  //sets dog's eyeColor
  public String getEyeColor(){
    return eyeColor;
  }

  //sets dog's height
  public void setheight(double dogHeight){
    height=dogHeight;
  }
  //sets dog's height
  public double getheight(){
    return height;
  }

  //sets dog's lenght
  public void setlenght(double dogLenght){
    lenght=dogLenght;
  }
  //sets dog's lenght
  public double getlenght(){
    return lenght;
  }
  //sets dog's weight
  public void setweight(double dogweight){
    weight=dogweight;
  }
  //sets dog's weight
  public double getweight (){
    return weight;
  }

  //Dog's methods-acttions
  public void sit(){
    JOptionPane.showMessageDialog(null, "the dog is sat");
  }
  //Bark methods
  public void bark(){
    JOptionPane.showMessageDialog(null, "The dos is barking");
  }
  //Lay Down method
  public void layDown(){
    JOptionPane.showMessageDialog(null,"The dog is laid down");
  }
  //The dog is slepping homs
  public void slepping(){
    JOptionPane.showMessageDialog(null, "The dog is slepping homs");
  }
  //eating method
  public void eating(){
    JOptionPane.showMessageDialog(null, "The dog is eating homs");
  }
}
