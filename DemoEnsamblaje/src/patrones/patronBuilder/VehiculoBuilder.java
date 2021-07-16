package patrones.patronBuilder;
import patrones.patronDecorator.*;

public abstract class VehiculoBuilder {
	protected VehiculoBase vehiculo = new VehiculoBase();	
	public void DefinirColor() {}
	
	public  void DefinirdireccionAsistida() {}
	
	public  void DefinirMarca() {}
	
	public  void DefinirModelo() {}
	
	public void ConstruirMotor() {}
	
	public void ConstruirCarroceria() {}
	
	public VehiculoBase GetVehículo() {
		return vehiculo;
	}
}
