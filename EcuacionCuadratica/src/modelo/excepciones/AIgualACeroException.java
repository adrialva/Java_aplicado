/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.excepciones;
import java.lang.Exception.*;
/**
 *
 * @author ADRIANA
 */
public class AIgualACeroException extends Exception {

    public AIgualACeroException() {
        super("El coeficiente A no debe ser igual a cero");
    }
    
}
