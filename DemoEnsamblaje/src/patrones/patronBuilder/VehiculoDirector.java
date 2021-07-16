package patrones.patronBuilder;
import patrones.patronDecorator.*;

public class VehiculoDirector {
	private VehiculoBuilder builder;
	
	public VehiculoDirector(VehiculoBuilder builder) {
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
