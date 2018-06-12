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
public abstract class CuentaCorriente extends TipoCuenta {
    
    private double cupo;

    public CuentaCorriente(int id) {
        super();
    }

    public CuentaCorriente() {
    }
    
    
    public double getCupo() {
        return cupo;
    }

    public void setCupo(double cupo) {
        this.cupo = cupo;
    }
    
    
        @Override
    public void Mostrar(){
        super.Mostrar();
        
       System.out.println("-------------------------------Tiene una cuenta corriente");
    }
}
