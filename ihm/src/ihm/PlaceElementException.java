/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ihm;

/**
 *
 * 
 */
public class PlaceElementException extends Exception {
    public PlaceElementException() {
        super("Il y a d�j� un �l�ment existant dans cette case.");
    }
}
