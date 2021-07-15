package patrones.patronBuilder;

import patrones.Carroceria;
import patrones.MotorDiesel;
import patrones.Vehiculo;

public class AudiSportbackBuilder extends vehiculoBuilder{
	Vehiculo v = new Vehiculo();
	@Override
	public void DefinirdireccionAsistida() {
		// TODO Auto-generated method stub
		v.direccionAsistida = true;
	}

	@Override
	public void DefinirMarca() {
		// TODO Auto-generated method stub
		v.marca = "Audi";
	}

	@Override
	public void DefinirModelo() {
		// TODO Auto-generated method stub
		v.modelo = "A3 Sportback";
	}

	@Override
	public void ConstruirMotor() {
		// TODO Auto-generated method stub
		v.motor = new MotorDiesel();
	}

	@Override
	public void ConstruirCarroceria() {
		// TODO Auto-generated method stub
		v.tipoCarroceria = new Carroceria();
		v.tipoCarroceria.tipoCarroceria = "deportivo";
		v.tipoCarroceria.habitaculoReforzado = true;
		v.tipoCarroceria.material = "fibra de carbono";
		v.color = "plata cromado";
	}

}
