/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentasbp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import tipocuenta.CuentaAhorroJovenes;
import tipocuenta.CuentaAhorroKids;
import tipocuenta.CuentaAhorroMayores;
import tipocuenta.CuentaCorriente;
import tipocuenta.TipoCuenta;

/**
 *
 * @author fiama
 */
public class Cuentasbp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CuentaAhorroKids ck1=new CuentaAhorroKids(50);
        ck1.setApellido("Jimenez");
        ck1.setNombre("Kiara");
        ck1.setEdad(5);
        CuentaAhorroJovenes cj1=new CuentaAhorroJovenes(100);
        cj1.setApellido("Landivar");
        cj1.setNombre("Fiama");
        cj1.setEdad(20);
        CuentaAhorroMayores cm1=new CuentaAhorroMayores(150);
        cm1.setApellido("Coloma");
        cm1.setNombre("Emilio");
        cm1.setEdad(65);
        CuentaCorriente cC1=new CuentaCorriente (2000) {};
        cC1.setApellido("Jimenez");
        cC1.setNombre("Cristhian");
        cC1.setEdad(25);
        
        List<TipoCuenta> tipocnta = new ArrayList<>();
       tipocnta.add(ck1);
        tipocnta.add(cj1);
        tipocnta.add(cm1);
        tipocnta.add(cC1);
        
        tipocnta.forEach((tipoCnta) -> {
            tipoCnta.Mostrar();
        });
            
    Scanner s= new Scanner(System.in);
    
    s.nextLine();
        
        
    }
    
}
