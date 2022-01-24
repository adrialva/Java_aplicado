/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADRIANA
 */
public class ConexionBD {
    String sql;
        String driver = "com.mysql.cj.jdbc.Driver";
        String URL_bd = "jdbc:mysql://localhost:3306/prodactuz";
        String usuario = "root";
        String clave = "";
        Connection con = null;
        Statement comando = null;
        ResultSet registros = null;
        int filas_afectadas;
        String lugares[] = null;
        String item = "";
        String sql2, sql3, sql4, sql5;
        String codigo="";

    public Connection getCon() {
        return con;
    }

    public String[] getLugares() {
        return lugares;
    }

    public String getCodigo() {
        return codigo;
    }

    public ResultSet getRegistros() {
        return registros;
    }

    public String getItem() {
        return item;
    }

    public ConexionBD() {
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(URL_bd, usuario, clave);
            if (con != null) {
                System.out.println("Conexion Exitosa");
                comando = con.createStatement();
            } else {
                System.out.println("Conexion No Exitosa");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ResultSet consultarBD(String sentencia) {
        try {
            comando = con.createStatement();
            registros = comando.executeQuery(sentencia);
        } catch (SQLException sqlex) {
            System.out.println(sqlex.getMessage());
        } catch (RuntimeException rex) {
            System.out.println(rex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return registros;
    }
    int i=0;
    public void llenarCombo(){
        ResultSet registros2 = null;
        int longitud=0;
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(URL_bd, usuario, clave);
            if (con != null) {
                sql = "SELECT * FROM `tbl_lugares`  WHERE `cod_lugares` ";
                comando = con.createStatement();
                registros2 = comando.executeQuery(sql);
                while(registros2.next()){
                    longitud = registros2.getInt("cod_lugares");
                }
                registros = comando.executeQuery(sql);    
                
                lugares = new String [longitud];
                while (registros.next()) {
                        lugares[i]= registros.getString("nombre");
                        System.out.println(lugares[i] + i);
                        i=i+1;
                    }
                con.close();
            } else {
                System.out.println("Conexion No Exitosa");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String llenarTabla(String item){
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(URL_bd, usuario, clave);
            if (con != null) {
                sql4 = " SELECT `Cod_lugares` FROM `tbl_lugares` WHERE `Nombre` = \""+item +" \"";
                comando = con.createStatement();
                
                registros = comando.executeQuery(sql4);
                
                while (registros.next()) {
                    codigo=registros.getString("Cod_lugares");
                    System.out.println("codigo lugar:" + codigo);
                    }
                //con.close();
                System.out.println("cod:"+codigo);
            } else {
                System.out.println("Conexion No Exitosa");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("\n"+item);
        return codigo;
    }
    
     public List<MedicamentosSolidos> listarSolidos(){
        System.out.println(codigo);
        List<MedicamentosSolidos>listaSolidos = new ArrayList<>();
        String sql3 ="SELECT * FROM tbl_medicamentos_solidos WHERE `Cod_lugares` = "+codigo;
        try{
            ResultSet registros = consultarBD(sql3);
            MedicamentosSolidos solidos;
            while(registros.next()){
                solidos = new MedicamentosSolidos();
                solidos.setNombre(registros.getString("Nombre"));
                solidos.setDescripcion(registros.getString("Descripcion"));
                solidos.setCantidad(registros.getInt("Cantidad"));
                solidos.setPrecio_tableta(registros.getFloat("Precio_tableta"));
                solidos.setPrecio_caja(registros.getFloat("Precio_caja"));
                solidos.setCodigo(registros.getInt("Cod_solidos"));
                listaSolidos.add(solidos);
            }
            //con.close();
        }
        catch(SQLException ex){
            System.out.println("Error en la consulta");
        }
         System.out.println(listaSolidos);
        return listaSolidos;
    }
}
