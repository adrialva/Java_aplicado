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
public class PistasException extends Exception{
    public PistasException(){
        super("El numero de pistas no coincide con el numero de competidores");
    }
}
