package patrones.patronBuilder;
import patrones.*;


public class CitroenXsarBuilder extends VehiculoBuilder{
	@Override
	public void DefinirdireccionAsistida() {
		vehiculo.direccionAsistida = false;
	}

	@Override
	public void DefinirMarca() {
		vehiculo.marca = "Citroen";
	}

	@Override
	public void DefinirModelo() {
		vehiculo.modelo = "Xsara Picasso";
	}

	@Override
	public void ConstruirMotor() {
		vehiculo.motor = new MotorDiesel();
	}

	@Override
	public void ConstruirCarroceria() {
		// TODO Auto-generated method stub
		vehiculo.tipoCarroceria = new Carroceria();
		vehiculo.tipoCarroceria.tipoCarroceria = "monovolumen";
		vehiculo.tipoCarroceria.habitaculoReforzado = false;
		vehiculo.tipoCarroceria.material = "acero";
		vehiculo.color = "negro";
	}
	

}
