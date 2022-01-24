/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author ADRIANA
 */
public interface Gerente extends Usuario{
    public void activar();
    public void desactivar();
    public void modDatos(double saldo, String numero, String titular);
}
