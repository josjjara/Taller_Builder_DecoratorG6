package patrones.patronDecorator;

public class VehiculoConSensores extends DecoratorVehiculos {
	
	public VehiculoConSensores(Vehiculo v) {
		super(v);
	}
	
	public String getPrestaciones() {
		return super.getPrestaciones() + "\nAdicional: Sensor para retro" ;
	}
}
