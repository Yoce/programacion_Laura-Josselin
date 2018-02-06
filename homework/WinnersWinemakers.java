/****
WinnersWinemakers.java
Laura Josselin Hernandez Garcia
This program calculates the profits obtained by a winemaker
****/
import javax.swing.JOptionPane;
public class WinnersWinemakers{
  public static void main(String[] args) {
    String TI;//tipo de uva
    int TA;//tamaño de uva
    float P;//Precio de uva
    int K;//Kilos de produccion
    float GA;//Gancncia obtenida
    TI=JOptionPane.showInputDialog("Enter the type of grape A or B");
    TA=Integer.parseInt(JOptionPane.showInputDialog("Enter the size of the grape 1 or 2"));
    P=Float.parseFloat(JOptionPane.showInputDialog("Enter the price of the grape"));
    K=Integer.parseInt(JOptionPane.showInputDialog("Enter the kilograms produced"));
    switch (TI){
      case 'A':
      if (TA=1){
      GA=((P+.20)*K);
      JOptionPane.showMessageDialog(null,"His gains are $ " + GA);
    }//end if
    else if(TA=2){
      GA=((P+.30)*K);
      JOptionPane.showMessageDialog(null,"His gains are $ " + GA);
    }//end if
    else{
      JOptionPane.showMessageDialog(null,"Enter the size correct");
    }//end else
    break;
    case 'B':
    if(TA=1){
      GA=((P-(P-.30))*K);
      JOptionPane.showMessageDialog(null,"His gains are $ " + GA);
    } //END IF
    else if (TA=2){
      GA=((P-(P-.50))*K);
      JOptionPane.showMessageDialog(null,"His gains are $ " + GA);
    }//end if
    else{
      JOptionPane.showMessageDialog(null,"Enter the size correct");
    }//end else
  }//end switch
  }//end main
}//end class
