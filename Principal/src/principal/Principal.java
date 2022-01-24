/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import Excepciones.MismaContraExcep;
import Excepciones.SaldoInsuficienteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ADRIANA
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MismaContraExcep {
        
        Cuenta ob1 = new Cuenta();
        Gerente ob2 = ob1;
        Cliente ob3 = ob1;
        Cajero ob4 = ob1;
        Usuario ob5 =ob1;
        ob5.ConsultarSaldo();
        ob2.activar();
        //ob3.cambiarClave("123");
        ob4.desactivar();
        //ob4.retirarSinCuenta(ob1.aleatorio());
        //ob4.consulta(15235);
        //ob4.recargas();
        Cuenta cuenta = new Cuenta();
        Cliente cliente=cuenta;
        cliente.cambiarClave(JOptionPane.showInputDialog(null,"Ingrese la nueva clave", "Ingreso de clave",JOptionPane.QUESTION_MESSAGE));
        /*do{
            try{
                
            } catch (MismaContraExcep ex){
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Misma contraseña",JOptionPane.ERROR_MESSAGE);
         */      
        double monto;
        monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor a consignar"));
        cliente.depositar(monto);
        int nmroIntentos=0;
        boolean transaccionExitosa = false;
        do{
            try{
                monto=Double.parseDouble(JOptionPane.showInputDialog("ingrese el valor a retirar"));
                transaccionExitosa = cliente.retirar(monto);
            } catch (SaldoInsuficienteException ex){
                JOptionPane.showMessageDialog(null, ex.getMessage()+". Por favor corrija el monto.", "Error en transaccion",JOptionPane.ERROR_MESSAGE);
                //System.out.println(ex.getMessage());
            }finally{
                nmroIntentos++;
                //System.out.println(nmroIntentos);
            }
        }while(!transaccionExitosa);
        //ob3.retirar(monto);
    }
    
}
