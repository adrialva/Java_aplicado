/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import Excepciones.MismaContraExcep;
import Excepciones.SaldoInsuficienteException;

/**
 *
 * @author ADRIANA
 */
public interface Cliente extends Usuario{
    public boolean retirar(double montoDinero)throws SaldoInsuficienteException;
    public void transferir(double montoDinero, Cuenta cuentaDestino);
    public void cambiarClave(String nuevaClave)throws MismaContraExcep;
}
