package patrones.patronDecorator;
import patrones.*;

public class VehiculoBase implements Vehiculo{
   public String color;
   public boolean direccionAsistida;
   public String marca;
   public String modelo;
   public IMotor motor;
   public Carroceria tipoCarroceria;
   
   public String getPrestaciones(){
       String n1 = "Prestaciones:\n";
       n1 += "El presente vehículo es un " + marca + "\n";
       n1 += "Estilo " + tipoCarroceria.tipoCarroceria + "\n";
       n1 += "Color: " + color + "\n";
       n1 += (direccionAsistida ? "Con ":"Sin ") + "dirección asistida" + "\n";
       n1 += "Carrocería de " + tipoCarroceria.material + "\n";
       n1 += "Respuesta del motor: " + motor.InyectarCombustible(100) + "\n";
       return n1;
   }
    
}
