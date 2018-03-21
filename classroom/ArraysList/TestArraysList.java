import java.util.ArrayList;
import javax.swing.*;
public class TestArraysList{
  public static void main(String[] args) {
    ArrayList <String> cityList = new ArrayList <String> ();
    cityList.add("london");
    cityList.add("New York");
    cityList.add("Paris");
    cityList.add("Tokyo");
    cityList.add("Maiami");
    JOptionPane.showMessageDialog(null,"List size: "+ cityList.size());
    JOptionPane.showMessageDialog(null,"Is Maiami int his list ? " + cityList.contains("Maiami"));
    JOptionPane.showMessageDialog(null,"The location of Paris is " + cityList.indexOf("Paris"));
    JOptionPane.showMessageDialog(null,"Is this list empty? "+ cityList.isEmpty());
    cityList.remove("london");
  }
}
