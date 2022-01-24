/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import modelo.excepciones.AIgualACeroException;
import modelo.excepciones.RaicesNoRealesException;
import java.io.Serializable;

/**
 *
 * @author ADRIANA
 */
public class EcuacionCuadratica implements Serializable{
    private double a;
    private double b;
    private double c;
    private transient double x1; // no se conserva
    private transient double x2; //no se converva 

    public EcuacionCuadratica() {
    }

    public EcuacionCuadratica(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }
    public void resolver() throws AIgualACeroException, RaicesNoRealesException{
        double discriminante=b*b-4*a*c;
        if(a==0){
            throw new AIgualACeroException();
        }
        if (discriminante<0){
            throw new RaicesNoRealesException();
        }
        x1=(-b + Math.sqrt(discriminante))/(2*a);
        x2=(-b - Math.sqrt(discriminante))/(2*a);
    }
}
