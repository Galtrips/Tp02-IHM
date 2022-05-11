/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ihm;

import static ihm.EtatCase.Cercle;
import static ihm.EtatCase.Croix;
import static ihm.EtatCase.Vide;

/**
 *
 * 
 */
public class ModeleGrille {
    private int lignes;
    private int colonnes;
    private EtatCase grille[][];
    
    private int winner = 0;
    
    public ModeleGrille() {
        lignes = 3;
        colonnes = 3;
        grille = new EtatCase[colonnes][lignes];
        initGrille();
    }
    
    public void initGrille() {
        for (int i = 0; i < colonnes; i++) {
            for (int j = 0; j < lignes; j++) {
                grille[i][j] = Vide;
            }
        }
    }
    
    public EtatCase getEtatCase(int ligne, int colonne) {
       return grille[colonne][ligne];
   }
    
    public void setEtatCase(int ligne, int colonne, EtatCase etat) throws PlaceElementException, AlwradyWinException {
        if (grille[colonne][ligne] == Vide) {
            if (this.finPartie() == false) {
                grille[colonne][ligne] = etat;
            }
            else {
                throw new AlwradyWinException();
            }
        }
        else {
            throw new PlaceElementException();
        }
        
    }
    
    public int getLignes() {
        return lignes;
    }

    public int getColonnes() {
        return colonnes;
    }
    
    public boolean finPartie() {
        
        for (int i = 0; i < colonnes; i++) {
            if (grille[i][0] == grille[i][1] && grille[i][0] == grille[i][2]) {
                if (grille[i][0] != Vide) {
                    return true;
                }
            }
        }
        
        for (int i = 0; i < lignes; i++) {
            if (grille[0][i] == grille[1][i] && grille[0][i] == grille[2][i]) {
                if (grille[0][i] != Vide) {
                    return true;
                }
            }
        }
        
        if (grille[0][0] == grille[1][1] && grille[0][0] == grille[2][2]) {
            if (grille[0][0] != Vide) {
                return true;
            }
        }
        
        if (grille[0][2] == grille[1][1] && grille[2][0] == grille[0][2]) {
            if (grille[0][2] != Vide) {
                return true;
            }
        }
        
        boolean caseVide = false;
        
        for (int i = 0; i < colonnes; i++) {
            for (int j = 0; j < lignes; j++) {
                if (grille[i][j] == Vide) {
                    return false;
                }
            }
        }
        
        this.winner = -1;
        return true;
    }
    
    public void print() {
    
        for (int i = 0; i < colonnes; i++) {
            for (int j = 0; j < lignes; j++) {
                if(grille[i][j] == Vide) {
                    System.out.print(" ");
                } else if (grille[i][j] == Croix) {
                    System.out.print("X");
                } else if (grille[i][j] == Cercle) {
                    System.out.print("O");
                } else {
                    System.out.print("E");
                }
            }
            System.out.print("\n");
        }
    }

    public int getWinner() {
        return winner;
    }

    public void setWinner(int winner) {
        this.winner = winner;
    }
}
