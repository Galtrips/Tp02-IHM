/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ihm;

import java.awt.Font;
import javax.swing.UIManager;
import static ihm.EtatCase.Croix;
import static ihm.EtatCase.Cercle;

/**
 *
 * 
 */
public class Tp02IHm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       UIManager.put("Button.font", new Font("Arial",Font.BOLD,20));
       UIManager.put("Label.font", new Font("Arial",Font.BOLD,20));
       MaFenetre win = new MaFenetre();
       win.setVisible(true);
       
    }
    
}
