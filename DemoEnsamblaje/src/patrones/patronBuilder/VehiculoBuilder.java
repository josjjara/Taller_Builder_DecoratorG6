package patrones.patronBuilder;
import patrones.patronDecorator.*;

public abstract class VehiculoBuilder {
	protected VehiculoBase vehiculo = new VehiculoBase();
	
	public void DefinirColor() {}
	
	public abstract void DefinirdireccionAsistida();
	
	public abstract void DefinirMarca();
	
	public abstract void DefinirModelo();
	
	public abstract void ConstruirMotor();
	
	public abstract void ConstruirCarroceria();
	
	public VehiculoBase GetVehículo() {
		return vehiculo;
	}
}
