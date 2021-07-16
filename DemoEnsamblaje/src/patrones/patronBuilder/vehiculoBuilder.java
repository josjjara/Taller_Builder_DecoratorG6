package patrones.patronBuilder;

import patrones.Vehiculo;

public  class vehiculoBuilder{
	protected Vehiculo vehiculo;
	
	public void DefinirColor() {}
	
	public  void DefinirdireccionAsistida() {}
	
	public  void DefinirMarca() {}
	
	public  void DefinirModelo() {}
	
	public void ConstruirMotor() {}
	
	public void ConstruirCarroceria() {}
	
	public Vehiculo GetVehículo() {
		return vehiculo;
	}
}
