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
		//Construir el vehículo
		directorCitroen.ConstruirVehiculo();
		//Obtener vehículo
		Vehiculo vCitroen = directorCitroen.getVehiculo();
		
		
		// Definimos el director audi
		AudiSportbackBuilder audi = new AudiSportbackBuilder();
		vehiculoDirector directorAudi = new vehiculoDirector(audi);
		//Construir el vehículo
		directorAudi.ConstruirVehiculo();
		//Obtener vehículo
		Vehiculo vAudi = directorAudi.getVehiculo();
		
		//Mostrar por pantalla
		System.out.println("PRIMER VEHICULO: " + vCitroen  );
		System.out.println();
		System.out.println("SEGUNDO VEHICULO: " + vAudi);
	}

}
