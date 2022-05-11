
package ihm;

import java.awt.Font;
import javax.swing.UIManager;
import static ihm.EtatCase.Croix;
import static ihm.EtatCase.Cercle;

public class Tp02IHm {

    public static void main(String[] args) {
       
       UIManager.put("Button.font", new Font("Arial",Font.BOLD,20));
       UIManager.put("Label.font", new Font("Arial",Font.BOLD,20));
       MaFenetre win = new MaFenetre();
       win.setVisible(true);
       
    }
}
