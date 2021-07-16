package patrones.patronBuilder;
import patrones.MotorDiesel;
import patrones.Carroceria;


public class AudiSportbackBuilder extends VehiculoBuilder{
	@Override
	public void DefinirdireccionAsistida() {
		vehiculo.direccionAsistida = true;
	}

	@Override
	public void DefinirMarca() {
		vehiculo.marca = "Audi";
	}

	@Override
	public void DefinirModelo() {
		vehiculo.modelo = "A3 Sportback";
	}

	@Override
	public void ConstruirMotor() {
		vehiculo.motor = new MotorDiesel();
	}

	@Override
	public void ConstruirCarroceria() {
		// TODO Auto-generated method stub
		vehiculo.tipoCarroceria = new Carroceria();
		vehiculo.tipoCarroceria.tipoCarroceria = "deportivo";
		vehiculo.tipoCarroceria.habitaculoReforzado = true;
		vehiculo.tipoCarroceria.material = "fibra de carbono";
		vehiculo.color = "plata cromado";
	}

}
