/*******
BMIOOP.java
Laura Josselin Hernandez Garcia
This class calculates the Body Mass Index
********/
public class BMIOOP{
  //properties-attributes
  private String name;
  private int age;
  private double weight;//In pounds
  private double height;//in inches
  private final double KILOGRAM_PER_POUND=0.45359237;
  private final double METERS_PER_INCH=0.0254;
  private double BMI;
  //methods -Action
  public void setName (String name){
    this.name=name;
  }
  public String getName(){
    return this.name;
  }
  public void setAge(int age){
    this.age=age;
  }
  public int getAge(){
    return this.age;
  }
  public void setWeight(double weight){
    this.weight=weight;
  }
  public double getWeight (){
    return weight;
  }
  public void setHeight(double height){
    this.height=height;
  }
  public double getHeight(){
    return this.height;
  }
  public double getBMI(){
    double bmi=this.weight*KILOGRAM_PER_POUND/((this.height*METERS_PER_INCH)*(this.height*METERS_PER_INCH));
    return Math.round(bmi*100)/100;
  }
  //metohd to evaluate BMI and return a message
  public String getStatus(){
    double bmi=getBMI();
    if(bmi<16){
      return "Your are seriously underweight";
    }
    else if(bmi>18){
      return "Your are underweight";
    }
    else if (bmi<24){
      return"Your are normal weight";
    }
    else if (bmi<29){
      return "Your are overweight";
    }
    else if (bmi<35){
      return "Your are seriously overweight";
    }
    else {
      return"Your are overweight";
    }
  }//end bim
}//en class
