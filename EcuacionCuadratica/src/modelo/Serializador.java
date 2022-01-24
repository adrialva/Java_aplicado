/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADRIANA
 */
public class Serializador { ///leer & escribir
    private FileInputStream archivoEntrada=null;
    private FileOutputStream archivoSalida= null;
    private ObjectInputStream serializadorEntrada=null;
    private ObjectOutputStream serializadorSalida=null;
    //private Scanner lector=null;
    
    /*public Serializador(Scanner lector) {
        this.lector=lector;
    }*/
    
    public void guardarObjeto(EcuacionCuadratica ecuacion, String nombreDelArchivo){
        try {
            archivoSalida= new FileOutputStream(nombreDelArchivo);
            serializadorSalida = new ObjectOutputStream(archivoSalida);
            serializadorSalida.writeObject(ecuacion);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Serializador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Serializador.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try{
                serializadorSalida.close();
                archivoSalida.close();  //opcional
            }
            catch(IOException ex){
                Logger.getLogger(Serializador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public EcuacionCuadratica abrirObjeto(String nombreDelArchivo){
        EcuacionCuadratica ecuacion=null;
        try{
            archivoEntrada = new FileInputStream(nombreDelArchivo);
            serializadorEntrada = new ObjectInputStream(archivoEntrada);
            do{
                ecuacion=(EcuacionCuadratica) serializadorEntrada.readObject();
            } while(ecuacion != null);
        }
        catch(FileNotFoundException ex){
            Logger.getLogger(Serializador.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(IOException ex){
            Logger.getLogger(Serializador.class.getName()).log(Level.SEVERE, null, ex);    
        }
        catch(ClassNotFoundException ex){
            Logger.getLogger(Serializador.class.getName()).log(Level.SEVERE, null, ex);    
        }finally{
            try {
                serializadorEntrada.close();
            } catch (IOException ex) {
                Logger.getLogger(Serializador.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                return ecuacion;
            }
        }
        
    }
}
