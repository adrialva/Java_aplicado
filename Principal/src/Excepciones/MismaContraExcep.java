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
public class MismaContraExcep extends Exception {
    public MismaContraExcep(){
        super("Esa contraseña es igual a la anterior");
    }
}
