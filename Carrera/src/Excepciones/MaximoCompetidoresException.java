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
public class MaximoCompetidoresException extends Exception{
    public MaximoCompetidoresException(){
        super("El maximo de competidores es 8");
    }
}
