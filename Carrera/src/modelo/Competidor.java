package modelo;


import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADRIANA
 */
public class Competidor extends Thread implements Serializable{
    DefaultTableModel modelCarrera =null;
    private String nombre;
    private int edad;
    private String pais;
    private int posicion;
    private long tiempoTotal;
    private int tiempoFinal;
    private long time;
    private int ultimaPosicion;
    Carrera carrera = null;
    long tiempo;

    public Competidor() {
    }
    
    public Competidor(String nombre, int edad, String pais, Carrera carrera, int posicion) {
        super(nombre);
        this.nombre = nombre;
        this.edad = edad;
        this.pais = pais;
        this.carrera=carrera;
        this.posicion=posicion;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPosicion() {
        return posicion;
    }

    public int getTiempoFinal() {
        return tiempoFinal;
    }

    public long getTime() {
        return time;
    }
    
    
    public void run(){
        for(int i=0; i<=4; i++){
            try {
                tiempo = (long) (Math.random()*5000 + 1000);
                Thread.sleep(tiempo);
                tiempoTotal = tiempoTotal + tiempo;
                ultimaPosicion=i;
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Competidor.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(nombre + carrera.estaciones[i]);
            carrera.getModelCarrera().setValueAt(nombre, this.getPosicion(), i);// asigno al competidor en una posicion de la tabla 
            
            if(i==0){
                time=tiempo/1000;
            }
            if(i==4){
                Thread.interrupted();
            }
            System.out.println(tiempoTotal/1000);
        }
        System.out.println("Tiempo inicial de "+ nombre + " "+time);
        tiempoFinal=(int)(tiempoTotal/1000);
        System.out.println(tiempoFinal);
        
    }

    public int getUltimaPosicion() {
        return ultimaPosicion;
    }
    
    long getTiempoTotal(){
        return tiempoTotal;
    }

    
}
