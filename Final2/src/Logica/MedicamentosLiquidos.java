/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author ADRIANA
 */
public class MedicamentosLiquidos {
    int cod_Liquidos;
    int cod_Lugares;
    String nombre;
    int cantidad_Frasco;
    float precio_Frasco;
    String descripcion;

    public MedicamentosLiquidos() {
    }

    public MedicamentosLiquidos(int cod_Liquidos, int cod_Lugares, String nombre, int cantidad_Frasco, float precio_Frasco, String descripcion) {
        this.cod_Liquidos = cod_Liquidos;
        this.cod_Lugares = cod_Lugares;
        this.nombre = nombre;
        this.cantidad_Frasco = cantidad_Frasco;
        this.precio_Frasco = precio_Frasco;
        this.descripcion = descripcion;
    }

    public int getCod_Liquidos() {
        return cod_Liquidos;
    }

    public int getCod_Lugares() {
        return cod_Lugares;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad_Frasco() {
        return cantidad_Frasco;
    }

    public float getPrecio_Frasco() {
        return precio_Frasco;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setCod_Liquidos(int cod_Liquidos) {
        this.cod_Liquidos = cod_Liquidos;
    }

    public void setCod_Lugares(int cod_Lugares) {
        this.cod_Lugares = cod_Lugares;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad_Frasco(int cantidad_Frasco) {
        this.cantidad_Frasco = cantidad_Frasco;
    }

    public void setPrecio_Frasco(float precio_Frasco) {
        this.precio_Frasco = precio_Frasco;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    @Override
    public String toString(){
        return "Medicamento liquido{ Nombre: " +nombre+ ", descripcion: "+ descripcion+
                ", Cantidad: "+cantidad_Frasco +", Precio frasco: "+ precio_Frasco + ", Codigo: "+cod_Liquidos+"}";
    }
}
