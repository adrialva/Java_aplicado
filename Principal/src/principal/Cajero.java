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
public interface Cajero extends Usuario{
    public void desactivar();
    public void consulta(double montoDinero);
    public void retirarSinCuenta(int aleat);
    public void recargas();
}
