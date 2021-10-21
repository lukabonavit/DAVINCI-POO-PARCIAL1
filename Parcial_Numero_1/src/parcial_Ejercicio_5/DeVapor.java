package parcial_Ejercicio_5;

public class DeVapor extends Barco {

	public DeVapor() {
		super();
	}

	@Override
	public String alarma() {
		return super.alarma() + "del barco de Vapor esta sonando!";
	}
}
