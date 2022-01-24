package modelo;

import java.io.Serializable;
import java.util.Scanner;
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
public class Carrera implements Serializable {
    Scanner lector = new Scanner(System.in);
    String []estaciones;
    Object[][] carriles=null;
    String nombre;
    int numComp;
    DefaultTableModel modelCarrera= null;
    public Carrera(String nombre){
        this.nombre=nombre;
        
    }

    public void setNumComp(int numComp) {
        this.numComp = numComp;
    }

    public int getNumComp() {
        return numComp;
    }

    public String[] getEstaciones() {
        return estaciones;
    }
    String getNombre(){
        return nombre;
    }
    public DefaultTableModel getModelCarrera() {
        return modelCarrera;
    }
    
    public void actualizarModelo(){
        
        //System.out.println("Ingrese la cantidad de competidores");
        //numComp= lector.nextInt();
        
        int i,j;
        carriles = new Object [numComp][5];
        for(i=0; i<=1; i++){
            for(j=0; j<=4; j++){
            carriles[i][j]=null;
            }
        }
        estaciones = new String [5];
        estaciones[0]="Partida";
        estaciones[1]="100 m";
        estaciones[2]="200 m";
        estaciones[3]="300 m";
        estaciones[4]="400 m"; 
        
        modelCarrera = new DefaultTableModel(carriles,estaciones);
        
    }
}
