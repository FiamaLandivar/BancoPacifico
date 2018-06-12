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
public class CuentaAhorroKids extends CuentaAhorros{
      
    private String nombretutor;
    
    
     public CuentaAhorroKids(int id) {
        super(id);
    }

    public CuentaAhorroKids() {
    }

    public String getNombretutor() {
        return nombretutor;
    }

    public void setNombretutor(String nombretutor) {
        this.nombretutor = nombretutor;
    }
    
    
         @Override
    public void Mostrar(){
        super.Mostrar();
        
       System.out.println("-------------------------------Tiene una cuenta ahorro kids");
    }  
    
}
