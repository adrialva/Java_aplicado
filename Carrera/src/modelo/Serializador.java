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
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author ADRIANA
 */
public class Serializador {
    private FileInputStream archivoEntrada=null;
    private FileOutputStream archivoSalida= null;
    private ObjectInputStream serializadorEntrada=null;
    private ObjectOutputStream serializadorSalida=null;
    
    Competidor participantes[]= new Competidor[8];

    public Competidor getParticipantes(int i) {
        return participantes[(i)];
    }
    
    public void guardarObjeto(Competidor[] objetos, String nombreDelArchivo){
        try{
            archivoSalida = new FileOutputStream(nombreDelArchivo);
            serializadorSalida = new ObjectOutputStream(archivoSalida);
            for(int i=0; i<8; i++){
                serializadorSalida.writeObject(objetos[i]);
            }
            
        }catch(FileNotFoundException ex){
            Logger.getLogger(Serializador.class.getName()).log(Level.SEVERE, null, ex);
        }catch(IOException ex){
            Logger.getLogger(Serializador.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                serializadorSalida.close();
                archivoSalida.close();
            } catch (IOException ex) {
                Logger.getLogger(Serializador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void abrirObjeto(String nombreDelArchivo){
       
        try {
            archivoEntrada = new FileInputStream(nombreDelArchivo);
            serializadorEntrada = new ObjectInputStream(archivoEntrada);
            for(int i=0; i<8; i++){
                participantes[i] = (Competidor) serializadorEntrada.readObject();
                System.out.println("Leyendo "+participantes[i].getNombre());
            }
        } 
        catch (FileNotFoundException ex) {
            Logger.getLogger(Serializador.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(IOException ex){
            Logger.getLogger(Serializador.class.getName()).log(Level.SEVERE, null, ex);    
        }
        catch(ClassNotFoundException ex){
            Logger.getLogger(Serializador.class.getName()).log(Level.SEVERE, null, ex);    
        }finally{
            try{
                serializadorEntrada.close();
            }catch (IOException ex) {
                Logger.getLogger(Serializador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
