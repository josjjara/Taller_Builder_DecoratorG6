package patrones.patronDecorator;

public class VehiculoConCamaraR extends DecoratorVehiculos {
	
	public VehiculoConCamaraR(Vehiculo v) {
		super(v);
	}
	
	public String getPrestaciones() {
		return super.getPrestaciones() + "\nAdicional: Camara retro" ;
	}
}