/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp02.ihm;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 *
 * @author brice.effantin
 */
public class MaFenetre extends JFrame implements ActionListener {
    
    private JLabel play;
    private int turn;
    
    private JButton btRaz=new JButton("Nouvelle Partie");
    
    private JButton case1=new JButton();
    private JButton case2=new JButton();
    private JButton case3=new JButton();
    private JButton case4=new JButton();
    private JButton case5=new JButton();
    private JButton case6=new JButton();
    private JButton case7=new JButton();
    private JButton case8=new JButton();
    private JButton case9=new JButton();
    
    private JFrame frame = new JFrame();
    
    private ModeleGrille grille;
    
    public MaFenetre(){
        
        this.turn = 0;
        
        this.setTitle("Morpion");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.play = new JLabel("Au joueur "+((turn % 2)+1) +" de jouer");
        
        case1.addActionListener(this);
        case2.addActionListener(this);
        case3.addActionListener(this);
        case4.addActionListener(this);
        case5.addActionListener(this);
        case6.addActionListener(this);
        case7.addActionListener(this);
        case8.addActionListener(this);
        case9.addActionListener(this);
        btRaz.addActionListener(this);
        
        this.initialisation();
    }
    
    private void initialisation() {
        //on place les 2 éléments
        JPanel pano=new JPanel();
        pano.setLayout(new GridBagLayout());
        GridBagConstraints gc=new GridBagConstraints();
        gc.fill=GridBagConstraints.BOTH;
        
        //on place la case 1
        gc.gridx=0;
        gc.gridy=1;
        
        ImageIcon imageVide = new ImageIcon(getClass().getResource("../../icones/fondBlanc.png"));
        case1.setIcon(imageVide);
        case1.setBackground(Color.white);
        pano.add(case1,gc);
        
        //on place la case 2
        gc.gridx=1;
        gc.gridy=1;
        
        imageVide = new ImageIcon(getClass().getResource("../../icones/fondBlanc.png"));
        case2.setIcon(imageVide);
        case2.setBackground(Color.white);
        pano.add(case2,gc);

        //on place la case 3
        gc.gridx=2;
        gc.gridy=1;
        
        imageVide = new ImageIcon(getClass().getResource("../../icones/fondBlanc.png"));
        case3.setIcon(imageVide);
        case3.setBackground(Color.white);
        pano.add(case3,gc);
        
        //on place la case 4
        gc.gridx=0;
        gc.gridy=2;
        
        imageVide = new ImageIcon(getClass().getResource("../../icones/fondBlanc.png"));
        case4.setIcon(imageVide);
        case4.setBackground(Color.white);
        pano.add(case4,gc);
        
        //on place la case 5
        gc.gridx=1;
        gc.gridy=2;
        
        imageVide = new ImageIcon(getClass().getResource("../../icones/fondBlanc.png"));
        case5.setIcon(imageVide);
        case5.setBackground(Color.white);
        pano.add(case5,gc);
        
        //on place la case 6
        gc.gridx=2;
        gc.gridy=2;
        
        imageVide = new ImageIcon(getClass().getResource("../../icones/fondBlanc.png"));
        case6.setIcon(imageVide);
        case6.setBackground(Color.white);
        pano.add(case6,gc);
        
        //on place la case 7
        gc.gridx=0;
        gc.gridy=3;
        
        imageVide = new ImageIcon(getClass().getResource("../../icones/fondBlanc.png"));
        case7.setIcon(imageVide);
        case7.setBackground(Color.white);
        pano.add(case7,gc);
        
        //on place la case 8
        gc.gridx=1;
        gc.gridy=3;
        
        imageVide = new ImageIcon(getClass().getResource("../../icones/fondBlanc.png"));
        case8.setIcon(imageVide);
        case8.setBackground(Color.white);
        pano.add(case8,gc);
        
        //on place la case 9
        gc.gridx=2;
        gc.gridy=3;
        
        imageVide = new ImageIcon(getClass().getResource("../../icones/fondBlanc.png"));
        case9.setIcon(imageVide);
        case9.setBackground(Color.white);
       
        pano.add(case9,gc);
        
        //on place le bouton
        gc.gridx=0;
        gc.gridy=4;
        gc.gridwidth=3;
        gc.insets=new Insets(10,3,3,3); //on crée des marges autour du bouton
        btRaz.setEnabled(false);
        pano.add(btRaz,gc);
        
        //on place le label
        gc.gridx=1;
        gc.gridy=0;
        gc.insets=new Insets(10,-10,10,10);
        
        pano.add(play,gc);

        this.setContentPane(pano);
        this.pack();

        grille = new ModeleGrille();
    }
    
    private void caseChange(JButton morpion, int caseGrille) throws PlaceElementException, AlwradyWinException {
        this.btRaz.setEnabled(true);
        if (this.turn % 2 == 0) {     
            switch(caseGrille){
                case 1: {
                    grille.setEtatCase(0, 0, EtatCase.Cercle);
     
                    break;
                }
                case 2: {
                    grille.setEtatCase(1, 0, EtatCase.Cercle);
   
                    break;
                }
                case 3: {
                    grille.setEtatCase(2, 0, EtatCase.Cercle);
    
                    break;
                }
                case 4: {
                    grille.setEtatCase(0, 1, EtatCase.Cercle);
     
                    break;
                }
                case 5: {
                    grille.setEtatCase(1, 1, EtatCase.Cercle);
   
                    break;
                }
                case 6: {
                    grille.setEtatCase(2, 1, EtatCase.Cercle);

                    break;
                }
                case 7: {
                    grille.setEtatCase(0, 2, EtatCase.Cercle);

                    break;
                }
                case 8: {
                    grille.setEtatCase(1, 2, EtatCase.Cercle);
 
                    break;
                }
                case 9: {
                    grille.setEtatCase(2, 2, EtatCase.Cercle);

                    break;
                }
                
            }
            
            ImageIcon imageCroix = new ImageIcon(getClass().getResource("../../icones/croix.png"));
            morpion.setIcon(imageCroix);
        }
        else {
            
            switch(caseGrille){
                case 1: {
                    grille.setEtatCase(0, 0, EtatCase.Croix);

                    break;
                }
                case 2: {
                    grille.setEtatCase(1, 0, EtatCase.Croix);

                    break;
                }
                case 3: {
                    grille.setEtatCase(2, 0, EtatCase.Croix);
    
                    break;
                }
                case 4: {
                    grille.setEtatCase(0, 1, EtatCase.Croix);
      
                    break;
                }
                case 5: {
                    grille.setEtatCase(1, 1, EtatCase.Croix);
   
                    break;
                }
                case 6: {
                    grille.setEtatCase(2, 1, EtatCase.Croix);
              
                    break;
                }
                case 7: {
                    grille.setEtatCase(0, 2, EtatCase.Croix);
        
                    break;
                }
                case 8: {
                    grille.setEtatCase(1, 2, EtatCase.Croix);
          
                    break;
                }
                case 9: {
                    grille.setEtatCase(2, 2, EtatCase.Croix);
                  
                    break;
                }
            }
            
            ImageIcon imageCercle = new ImageIcon(getClass().getResource("../../icones/cercle.png"));
            morpion.setIcon(imageCercle);
        }
        if (grille.finPartie()) {
            
            if (grille.getWinner() == -1) {

                JOptionPane.showMessageDialog(frame,"Match Nul !");
            }
            else if (turn % 2 == 0) {
                this.grille.setWinner(1);
                JOptionPane.showMessageDialog(frame,"Le joueur 1 a gagné !");
            }
            else {
                this.grille.setWinner(2);
                JOptionPane.showMessageDialog(frame,"Le joueur 2 a gagné !");
            }
            
        }
        else {
            this.turn++;
            play.setText("Au joueur "+(turn % 2 + 1)+" de jouer");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == case1) {
            try {
                this.caseChange(case1, 1);
            } catch (PlaceElementException ex) {
                System.out.println(ex);
            } catch (AlwradyWinException ex) {
                System.out.println(ex);
            }
        }
        if (e.getSource() == case2) {
            try {
                this.caseChange(case2, 2);
            } catch (PlaceElementException ex) {
                System.out.println(ex);
            } catch (AlwradyWinException ex) {
                System.out.println(ex);
            }
        }
        if (e.getSource() == case3) {
            try {
                this.caseChange(case3, 3);
            } catch (PlaceElementException ex) {
                System.out.println(ex);
            } catch (AlwradyWinException ex) {
                System.out.println(ex);
            }
        }
        if (e.getSource() == case4) {
            try {
                this.caseChange(case4, 4);
            } catch (PlaceElementException ex) {
                System.out.println(ex);
            } catch (AlwradyWinException ex) {
                System.out.println(ex);
            }
        }
        if (e.getSource() == case5) {
            try {
                this.caseChange(case5, 5);
            } catch (PlaceElementException ex) {
                System.out.println(ex);
            } catch (AlwradyWinException ex) {
                System.out.println(ex);
            }
        }
        if (e.getSource() == case6) {
            try {
                this.caseChange(case6, 6);
            } catch (PlaceElementException ex) {
                System.out.println(ex);
            } catch (AlwradyWinException ex) {
                System.out.println(ex);
            }
        }
        if (e.getSource() == case7) {
            try {
                this.caseChange(case7, 7);
            } catch (PlaceElementException ex) {
                System.out.println(ex);
            } catch (AlwradyWinException ex) {
                System.out.println(ex);
            }
        }
        if (e.getSource() == case8) {
            try {
                this.caseChange(case8, 8);
            } catch (PlaceElementException ex) {
                System.out.println(ex);
            } catch (AlwradyWinException ex) {
                System.out.println(ex);
            }
        }
        if (e.getSource() == case9) {
            try {
                this.caseChange(case9, 9);
            } catch (PlaceElementException ex) {
                System.out.println(ex);
            } catch (AlwradyWinException ex) {
                System.out.println(ex);
            }
        }
        if (e.getSource() == btRaz) {
            this.btRaz.setEnabled(false);
            this.initialisation();
            this.turn = 0;
            play.setText("Au joueur "+((turn % 2)+1) +" de jouer");
        }
    }
}
