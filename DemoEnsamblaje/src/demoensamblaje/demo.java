package demoensamblaje;

import patrones.Vehiculo;
import patrones.patronBuilder.AudiSportbackBuilder;
import patrones.patronBuilder.CitroenXsarBuilder;
import patrones.patronBuilder.vehiculoDirector;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Definimos el director citroen
		CitroenXsarBuilder citroen = new CitroenXsarBuilder();
		vehiculoDirector directorCitroen = new vehiculoDirector(citroen);
		//Construir el veh�culo
		directorCitroen.ConstruirVehiculo();
		//Obtener veh�culo
		Vehiculo vCitroen = directorCitroen.getVehiculo();
		
		
		// Definimos el director audi
		AudiSportbackBuilder audi = new AudiSportbackBuilder();
		vehiculoDirector directorAudi = new vehiculoDirector(audi);
		//Construir el veh�culo
		directorAudi.ConstruirVehiculo();
		//Obtener veh�culo
		Vehiculo vAudi = directorAudi.getVehiculo();
		
		//Mostrar por pantalla
		System.out.println("PRIMER VEHICULO: " + vCitroen  );
		System.out.println();
		System.out.println("SEGUNDO VEHICULO: " + vAudi);
	}

}
