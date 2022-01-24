/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;
import java.lang.Exception.*;
/**
 *
 * @author ADRIANA
 */
public class MaximoPistasException extends Exception {
    public MaximoPistasException(){
        super("El maximo de pistas es de 8");
    }
}
