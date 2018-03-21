import javax.swing.*;
import java.util.ArrayList;
public class Bear{
  private final String MAKER;// bear's manufactures
  private final String TYPE;//type of bear
  public Bear (String maker, String type){
    this.TYPE=type;
    this.MAKER=maker;
  }
  public void display(){
    JOptionPane.showMessageDialog(null, MAKER + " " + TYPE);
  }
  public static void main(String[] args) {
    ArrayList<Bear> teddyBearStore=new ArrayList<Bear>();
    int opc=Integer.parseInt(JOptionPane.showInputDialog(null,"....MENU....?\n 1.-Add Bear \n 2.-Search... \n 3.-Remove \n 4.-Show all \n 5.-Exit"));
    do{
      switch (opc){
        case 1: String maker= JOptionPane.showInputDialog("Maker?");
                String type= JOptionPane.showInputDialog("Type?");
                Bear winniePhoo= new Bear (maker, type);
                teddyBearStore.add(winniePhoo);
                break;
        case 2:
          int index =Integer.parseInt(JOptionPane.showInputDialog("Index?"));
          teddyBearStore.get(index).display();
          break;
        case 3:
          index =Integer.parseInt(JOptionPane.showInputDialog("Index to remove?"));
          if (teddyBearStore.remove(index) != null){
              JOptionPane.showMessageDialog(null,"Element removed");
          }else {
            JOptionPane.showMessageDialog(null,"Element wasn't removed");
          }
            break;
        case 4:
          for (Bear bear : teddyBearStore){
            bear.display();
          }
          break;
        case 5:
        JOptionPane.showMessageDialog(null,"Bye");
        break;
        default:
        JOptionPane.showMessageDialog(null,"ERROR");
        break;
      }
       opc=Integer.parseInt(JOptionPane.showInputDialog(null,"....MENU....?\n 1.-Add Bear \n 2.-Search... \n 3.-Remove \n 4.-Show all \n 5.-Exit"));
    } while (opc!=5);
  }
}
