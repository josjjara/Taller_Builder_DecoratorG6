package patrones.patronBuilder;

import patrones.Carroceria;
import patrones.MotorDiesel;
import patrones.Vehiculo;

public class AudiSportbackBuilder extends vehiculoBuilder{
	Vehiculo v = new Vehiculo();
	@Override
	public void DefinirdireccionAsistida() {
		v.direccionAsistida = true;
	}

	@Override
	public void DefinirMarca() {
		v.marca = "Audi";
	}

	@Override
	public void DefinirModelo() {
		v.modelo = "A3 Sportback";
	}

	@Override
	public void ConstruirMotor() {
		v.motor = new MotorDiesel();
	}

	@Override
	public void ConstruirCarroceria() {
		v.tipoCarroceria = new Carroceria();
		v.tipoCarroceria.tipoCarroceria = "deportivo";
		v.tipoCarroceria.habitaculoReforzado = true;
		v.tipoCarroceria.material = "fibra de carbono";
		v.color = "plata cromado";
	}

}
