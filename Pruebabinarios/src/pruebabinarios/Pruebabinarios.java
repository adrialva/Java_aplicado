/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebabinarios;

import java.util.Scanner;

/**
 *
 * @author ADRIANA
 */
public class Pruebabinarios {
    static int [] bin= new int [8]; 
    static int multiPrincipal=128;
    static int resultTotal;
    static int i=0;
    public static void operaciones(){
        bin[0]=0; //mayor peso
        bin[1]=0;
        bin[2]=1;
        bin[3]=1;
        bin[4]=0;
        bin[5]=0;
        bin[6]=1;
        bin[7]=1; // menor peso
        while (i!= bin.length){
            if(bin[i] == 1){
                resultTotal=resultTotal+multiPrincipal;
                multiPrincipal=multiPrincipal/2;
            }else{
                multiPrincipal=multiPrincipal/2;
            }
            i++;
        }
        System.out.println(resultTotal);
    }
    public static void main(String[] args) {
        operaciones();
    }
    
}
