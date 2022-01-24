/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author ADRIANA
 */
public class MedicamentosSolidos {
    String nombre;
    String descripcion;
    int cantidad;
    float precio_tableta;
    float precio_caja;
    int codigo;
    String code;
    String sql4;
    String driver = "com.mysql.cj.jdbc.Driver";
    String URL_bd = "jdbc:mysql://localhost:3306/prodactuz";
    String usuario = "root";
    String clave = "";
    Connection con = null;
    Statement comando = null;
    ResultSet registros = null;
    public MedicamentosSolidos() {
    }

    public MedicamentosSolidos(String nombre, String descripcion, int cantidad, float precio_tableta, float precio_caja, int codigo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio_tableta = precio_tableta;
        this.precio_caja = precio_caja;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public float getPrecio_tableta() {
        return precio_tableta;
    }

    public float getPrecio_caja() {
        return precio_caja;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio_tableta(float precio_tableta) {
        this.precio_tableta = precio_tableta;
    }

    public void setPrecio_caja(float precio_caja) {
        this.precio_caja = precio_caja;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    @Override
    public String toString(){
        return "Medicamento solido{ Nombre: " +nombre+ ", descripcion: "+ descripcion+
                ", Cantidad: "+cantidad + ", Precio tableta: "+ precio_tableta+", Precio caja: "+
                precio_caja + ", Codigo: "+codigo+"}";
    }
}
