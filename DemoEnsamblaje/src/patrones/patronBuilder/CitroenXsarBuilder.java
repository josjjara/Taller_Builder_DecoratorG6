package patrones.patronBuilder;


import patrones.Vehiculo;
import patrones.Carroceria;
import patrones.MotorDiesel;


public class CitroenXsarBuilder extends vehiculoBuilder{
	
	
	Vehiculo v = new Vehiculo();
	@Override
	public void DefinirdireccionAsistida() {
		// TODO Auto-generated method stub
		v.direccionAsistida = false;
	}

	@Override
	public void DefinirMarca() {
		// TODO Auto-generated method stub
		v.marca = "Citroen";
	}

	@Override
	public void DefinirModelo() {
		// TODO Auto-generated method stub
		v.modelo = "Xsara Picasso";
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
		v.tipoCarroceria.tipoCarroceria = "monovolumen";
		v.tipoCarroceria.habitaculoReforzado = false;
		v.tipoCarroceria.material = "acero";
		v.color = "negro";
	}
	

}
