/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appbd;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author ADRIANA
 */
public class AppBD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String driver = "com.mysql.cj.jdbc.Driver";
        String URL_bd = "jdbc:mysql://localhost:3306/proyectos";
        String Usuario = "root";
        String clave = "";
        Connection con = null;
        Statement comando = null;
        ResultSet registros = null;
        String sql;
        int filas_afectadas;
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(URL_bd, Usuario, clave);
            if (con != null){
               System.out.println("Conexion Exitosa");
               comando = con.createStatement();
               //sql = "SELECT nombre, costo FROM tbl_proyectos"; // si no sirve pasar a minusculas
               
               //sql = "UPDATE tbl_lugar SET codigo = WHERE codigo = 3;";
               //filas_afectadas = comando.executeUpdate(sql);
               //System.out.println("se afectaron" + filas_afectadas +"registros");
               sql = "select * from tbl_lugar";
               registros = comando.executeQuery(sql);
               while(registros.next()){
                   System.out.println("Nombre:" + registros.getString("nombre"));
                   System.out.println("Codigo:" + registros.getInt("codifgo"));
               }
               //sql = "INSERT INTO tbl_lugar(codigo, nombre) VALUE ('salón 405');";
               con.close();
            }else{
               System.out.println("Conexion No Exitosa");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AppBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AppBD.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    
}
