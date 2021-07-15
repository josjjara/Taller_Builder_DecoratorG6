package patrones.patronBuilder;

import patrones.Vehiculo;

public abstract class vehiculoDirector {
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
		
		if ((builder.GetVehículo().tipoCarroceria.tipoCarroceria == "deportivo") && (builder.GetVehículo().direccionAsistida == false)) {
			try {
				throw new Exception ("Error en el ensamblado");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public Vehiculo getVehiculo() {
		return builder.GetVehículo();}

}
