package patrones.patronDecorator;

public class VehiculoConRadio extends DecoratorVehiculos {
	
	public VehiculoConRadio(Vehiculo v) {
		super(v);
	}
	
	public String getPrestaciones() {
		return super.getPrestaciones() + "\nAdicional: Radio con pantalla tactil" ;
	}
}