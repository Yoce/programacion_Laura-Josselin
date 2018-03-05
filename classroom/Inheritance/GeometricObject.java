/********
GeometricObject.java
Laura Josselin Hernandez Garcia
THis is a superclase
********/
import java.util.Date;
public abstract class GeometricObject{
  private String color;
  private boolean filled;
  private Date dateCreated;
  //Methods
  public GeometricObject(){
    this.color="purple";
    this.filled=true;
    this.dateCreated=new Date();
  }
  public GeometricObject(String color, boolean filled){
    this.color=color;
    this.filled=filled;
    this.dateCreated=new Date();
  }
  public String getColor(){
    return this.color;
  }
  public void setColor(String color){
    this.color=color;
  }
  public boolean isFilled(){
    return this.filled;
  }
  public void setFilled(boolean filled){
    this.filled=filled;
  }
  public Date getDateCreated(){
    return this.dateCreated;
  }
  public abstract double getArea();
  public abstract double getPerimeter();
}
