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
public class CuentaAhorroJovenes extends CuentaAhorros {
    
    private String estadoCivil;
    
    
        public CuentaAhorroJovenes(int id) {
         super(id);
    }

         public CuentaAhorroJovenes () {
    }
   

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
     @Override
    public void Mostrar(){
        super.Mostrar();
        
       System.out.println("-------------------------------Tiene una cuenta ahorro jovenes");
    }     
    
    
    
}
