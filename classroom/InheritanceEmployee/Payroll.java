import javax.swing.*;
public class Payroll{
  public static void main(String[] args) {
    //Salaried
    String name=JOptionPane.showMessageDialog(null,"Salaried's name");
    double salary=Double.parseDouble(JOptionPane.showMessageDialog(null,"Salaried's salary"));
    Employee sasuke=new Salaried(name, salary);
    JOptionPane.showMessageDialog(null,sasuke.getPay());

    //Hourly
    name=JOptionPane.showMessageDialog(null,"Salaried's name");
    double hours=Double.parseDouble(JOptionPane.showMessageDialog(null,"Hours worked"));
    Employee sakura=new Hourly(name, hours);
    JOptionPane.showMessageDialog(null,"Sakura's pay "+ sakura.getPay());

    //Commission
    Commission shikamaru=new Commissioned ("Shikamaru");
    shikamaru.addSales(550);
    shikamaru.addSales(1250);
  }
}
