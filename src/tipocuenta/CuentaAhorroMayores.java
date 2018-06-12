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
public class CuentaAhorroMayores extends CuentaAhorros {
    
    private String jubilacion;
    
    
        public CuentaAhorroMayores(int id) {
        super(id);
    }

    public CuentaAhorroMayores() {
    }


    public String getJubilacion() {
        return jubilacion;
    }

    public void setJubilacion(String jubilacion) {
        this.jubilacion = jubilacion;
    }
    
        @Override
    public void Mostrar(){
        super.Mostrar();
        
       System.out.println("-------------------------------Tiene una cuenta ahorro mayores");
    }  
    
    
}
