/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista_control;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.excepciones.AIgualACeroException;
import modelo.EcuacionCuadratica;
import modelo.excepciones.RaicesNoRealesException;
import modelo.Serializador;

/**
 *
 * @author ADRIANA
 */
public class Principal {
    public static void main(String [] args){
        Scanner lector = new Scanner(System.in);
        int opcion;
        System.out.println("**PROGRAMA ECUACION CUADRATICA**");
        System.out.println("Menu de opciones");
        System.out.println("    1. Guardar ecuacion");
        System.out.println("    2. Abrir ecuacion guardada");
        System.out.println("    Digite su opcion: ");
        opcion = lector.nextInt();
        EcuacionCuadratica ecuacion1 = null;
        Serializador serializador = new Serializador();
        switch(opcion){
            case 1 :
                ecuacion1= new EcuacionCuadratica();
                System.out.print("Ingrese el valor de a: ");
                ecuacion1.setA(lector.nextDouble()); 
                System.out.print("Ingrese el valor de b: ");
                ecuacion1.setB(lector.nextDouble());
                System.out.print("Ingrese el valor de c: ");
                ecuacion1.setC(lector.nextDouble());
               
                boolean huboError=false;
                do{
                    try {
                        ecuacion1.resolver();
                    } catch (AIgualACeroException ex) {
                        huboError=true;
                        System.out.println(ex.getMessage()+ ", por favor, modifique el valor de A");
                        System.out.print("Ingrese el valor de a: ");
                        ecuacion1.setA(lector.nextDouble());
                    } catch (RaicesNoRealesException ex) {
                        huboError=true;
                        System.out.println(ex.getMessage() + ", por favor, modifique los valores e la ecuacion");

                        System.out.print("Ingrese el valor de a: ");
                        ecuacion1.setA(lector.nextDouble()); 
                        System.out.print("Ingrese el valor de b: ");
                        ecuacion1.setB(lector.nextDouble());
                        System.out.print("Ingrese el valor de c: ");
                        ecuacion1.setC(lector.nextDouble());
                    }
                }while(huboError);
                System.out.println("Raiz 1 = " + ecuacion1.getX1());
                System.out.println("Raiz 2 = " + ecuacion1.getX2());
                System.out.println("Digite el nombre del archivo: ");
                
                serializador.guardarObjeto(ecuacion1, lector.next());
                break;
            case 2:
                ecuacion1 = null;
                System.out.println("Digite el nombre del archivo: ");
                ecuacion1=serializador.abrirObjeto(lector.next());
                System.out.println("Datos de la ecuacion recuperada: ");
                System.out.println(ecuacion1.getA()+"x^2 + "+ecuacion1.getB()+"x + "+ ecuacion1.getC()+" = 0");
                break;
        }
    }
}
