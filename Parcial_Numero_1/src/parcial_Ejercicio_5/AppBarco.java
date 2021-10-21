package parcial_Ejercicio_5;

import java.util.ArrayList;

public class AppBarco {

	public static ArrayList<Barco> array = new ArrayList<Barco>();

	public static void main(String[] args) {

		DeVapor vapor = new DeVapor();
		Velero velero = new Velero();

		array.add(vapor);
		array.add(velero);

		for (Barco suena : array) {
			System.out.println(suena.alarma());
		}
	}

}
