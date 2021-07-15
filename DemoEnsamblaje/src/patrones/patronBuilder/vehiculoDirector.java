package patrones.patronBuilder;

import patrones.Vehiculo;

public abstract class vehiculoDirector {
	private vehiculoBuilder builder;
	
	public vehiculoDirector(vehiculoBuilder builder) {
		this.builder = builder;
	}
	
	public void ConstruirVehiculo() {}
	
	public Vehiculo getVehiculo() {
		return null;}

}
