/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp02.ihm;

/**
 *
 * @author p2103678
 */
public class AlwradyWinException extends Exception {
    public AlwradyWinException() {
        super("La partie est terminé, lancer une nouvelle partie !");
    }
}
