package patrones.patronBuilder;

import patrones.Vehiculo;

public abstract class vehiculoBuilder {
	protected Vehiculo vehiculo;
	
	public void DefinirColor() {}
	
	public abstract void DefinirdireccionAsistida();
	
	public abstract void DefinirMarca();
	
	public abstract void DefinirModelo();
	
	public abstract void ConstruirMotor();
	
	public abstract void ConstruirCarroceria();
	
	public Vehiculo GetVehículo() {
		return vehiculo;
	}
}
