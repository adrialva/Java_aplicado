/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;
import Excepciones.MismaContraExcep;
import Excepciones.SaldoInsuficienteException;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author ADRIANA
 */
public class Cuenta implements Cliente, Cajero, Gerente{
    public double saldo=2000;
    public String numero;
    public String clave;
    public String titular;
    boolean activa= false;
    int [] codigo = new int[6];

    public Cuenta() {
        this.clave = " ";
    }

    
    @Override
    public void activar() {
        if(!activa){
            activa=true;
        }
    }

    @Override
    public void desactivar() {
        if(activa){
            activa=false;
        }
    }

    @Override
    public void modDatos(double saldo, String numero, String titular) {
        this.saldo=saldo;
        this.numero=numero;
        this.titular=titular;
    }

    @Override
    public boolean retirar(double montoDinero)throws SaldoInsuficienteException {
        boolean retiroExitoso=false;
        if(saldo-montoDinero<1000){
            throw new SaldoInsuficienteException();
        }
        else{
            saldo=saldo-montoDinero;
            retiroExitoso=true;
            System.out.println("Su saldo nuevo es: $" + saldo);
            return retiroExitoso;
        }
    }

    @Override
    public void transferir(double montoDinero, Cuenta cuentaDestino) {
        try {
            retirar(montoDinero);
        } catch (SaldoInsuficienteException ex) {
            Logger.getLogger(Cuenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        cuentaDestino.depositar(montoDinero);
    }

    @Override
    public void cambiarClave(String nuevaClave) throws MismaContraExcep {
        clave="123";
        clave = nuevaClave;
        if(nuevaClave==clave){
            throw new MismaContraExcep();
            }
        else{
            JOptionPane.showMessageDialog(null, "Su contraseña ha sido asignada correctamente");
        }
    }
    
    @Override
    public double ConsultarSaldo() {
        return saldo;
    }

    @Override
    public void depositar(double montoDinero) {
        saldo=saldo+montoDinero;
                
    }
    Scanner s= new Scanner(System.in);
    @Override
    public void consulta(double montoDinero) {
        //ver saldo, ver ultimo retiro
        System.out.println("    Informacion de su cuenta:");
        System.out.println("• Saldo:" + saldo);
        System.out.println("• Ultimo retiro: $" + (saldo=saldo-montoDinero));
    }
    public int aleatorio(){
        int aleat=0;
        Random aleatorio= new Random();
        for(int i=0; i<codigo.length; i++){
            codigo[i]=new Random().nextInt(10);
            aleat=codigo[i];
            System.out.println(aleat);
        }
        return aleat;
    }
    @Override
    public void retirarSinCuenta(int aleat) {
        int codIngre;
        
        System.out.println("Ingrese su codigo para retirar el dinero: ");
        codIngre=s.nextInt();
            
        if(aleat!= codIngre){
            System.out.println("Codigo incorrecto, intentelo en 30 minutos");
        }
        else{
            System.out.println("Retire su dinero\n Gracias por utilizar nuestros servicios.");
        }
    }
  
    @Override
    public void recargas(){
        int nrecarga;
        int nrecarga2;
        System.out.println("Ingrese el numero al cual desea hacer la recarga: ");
        nrecarga = s.nextInt();
        System.out.println("Verifique su numero");
        nrecarga2= s.nextInt();
        while(nrecarga!=nrecarga2){
            System.out.println("numero incorrecto. Ingreselo nuevamente");
            nrecarga2=s.nextInt();
            
            if(nrecarga==nrecarga2){
            double recarga;
            System.out.println("Ingrese el valor que desea recargar");
            recarga=s.nextDouble();
            System.out.println("Su recarga de valor: $" +recarga+" se ha realizado con exito ");
            JOptionPane.showMessageDialog(null, "Su recarga de valor: $" +recarga+" se ha realizado con exito ", "mensaje",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        if(nrecarga==nrecarga2){
            double recarga;
            System.out.println("Ingrese el valor que desea recargar");
            recarga=s.nextDouble();
            System.out.println("Su recarga de valor: $" +recarga+" se ha realizado con exito ");
            JOptionPane.showMessageDialog(null, "Su recarga de valor: $" +recarga+" se ha realizado con exito ", "mensaje",JOptionPane.INFORMATION_MESSAGE);  
        }
        
    }

}
