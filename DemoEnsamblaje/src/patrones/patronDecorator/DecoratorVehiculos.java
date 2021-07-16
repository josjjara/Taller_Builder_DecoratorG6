package patrones.patronDecorator;

public abstract class DecoratorVehiculos implements Vehiculo{
	
protected Vehiculo v;
	
	public DecoratorVehiculos(Vehiculo v){
		this.v = v;
	}
	
	public String getPrestaciones() {
		return this.v.getPrestaciones();
	}
	
}

