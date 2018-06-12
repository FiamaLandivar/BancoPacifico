/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipocuenta;

/**
 *
 * @author fiama
 */
public abstract class CuentaAhorros extends TipoCuenta {
    
     private double montodisponible;
     
     
         public CuentaAhorros (int id) {
         super();
    }

    public CuentaAhorros() {
    }

    public double getMontodisponible() {
        return montodisponible;
    }

    public void setMontodisponible(double montodisponible) {
        this.montodisponible = montodisponible;
    }
   
}
