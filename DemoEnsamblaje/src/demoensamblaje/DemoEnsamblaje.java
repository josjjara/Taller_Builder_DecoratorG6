/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoensamblaje;

import patrones.patronBuilder.*;
import patrones.patronDecorator.*;

/**
 *
 * @author david_000
 */
public class DemoEnsamblaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Definir vehiculo
    	
    	VehiculoBuilder builder = new AudiSportbackBuilder();
    	VehiculoDirector director = new VehiculoDirector(builder);
    	director.ConstruirVehiculo();
    	Vehiculo v1 = director.getVehiculo();
    	
        //--------------------------------------------------
        //Definir vehiculo
        builder = new CitroenXsarBuilder();
    	director = new VehiculoDirector(builder);
    	director.ConstruirVehiculo();
    	Vehiculo v2 = director.getVehiculo();
    	
        //--------------------------------------------------
        

        //TODO: Agregar accesorios: radio y sensores de retro a v1
        //Debería agregar estos accesorios como parte de las prestaciones del vehiculo
        v1 = new VehiculoConSensores(new VehiculoConRadio(v1));
        //Mostrar prestaciones actualizadas del vehiculo
        System.out.println(v1.getPrestaciones());
        //--------------------------------------------------
        
        //TODO: Agregar accesorios: camara de retro a v2
        //Debería agregar estos accesorios como parte de las prestaciones del vehiculo
        v2 = new VehiculoConCamaraR(v2);
        //Mostrar prestaciones actualizadas del vehiculo
        System.out.println(v2.getPrestaciones());
    }
    
}
