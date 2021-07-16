package patrones.patronBuilder;

import patrones.Vehiculo;

public  class vehiculoDirector {
	private vehiculoBuilder builder;
	
	public vehiculoDirector(vehiculoBuilder builder) {
		this.builder = builder;
	}
	
	public void ConstruirVehiculo() {
		builder.DefinirColor();
		builder.ConstruirCarroceria();
		builder.ConstruirMotor();
		builder.DefinirdireccionAsistida();
		builder.DefinirMarca();
		builder.DefinirModelo();
		
		
	}
	
	public Vehiculo getVehiculo() {
		return builder.GetVehículo();}

}
