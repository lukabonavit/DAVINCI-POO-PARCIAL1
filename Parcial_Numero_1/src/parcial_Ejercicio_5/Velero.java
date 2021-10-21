package parcial_Ejercicio_5;

public class Velero extends Barco {

	public Velero() {
		super();
	}

	@Override
	public String alarma() {
		return super.alarma() + "del barco Velero esta sonando!";
	}
}
