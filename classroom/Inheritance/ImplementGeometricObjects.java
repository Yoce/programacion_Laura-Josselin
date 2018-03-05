import javax.swing.*;
public class ImplementGeometricObjects{
  public static void main(String[] args) {
    GeometricObject circlelito=new Circle2(3.5, " Blue ", true);
    JOptionPane.showMessageDialog(null,"The area is "+circlelito.getArea());
    JOptionPane.showMessageDialog(null,"The circle was created on "+circlelito.getDateCreated());
    JOptionPane.showMessageDialog(null,circlelito.toString());
    GeometricObject rectanlgelito=new RectangleGO(10,20," Red ", true);
    JOptionPane.showMessageDialog(null,"The area is "+rectanlgelito.getArea());
    JOptionPane.showMessageDialog(null,"The perimeter is "+rectanlgelito.getPerimeter());

    //polimorfismo

    circlelito.toString();
    rectanlgelito.toString();
  }
}
