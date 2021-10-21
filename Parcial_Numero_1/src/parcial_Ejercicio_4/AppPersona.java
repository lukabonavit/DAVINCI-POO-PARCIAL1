package parcial_Ejercicio_4;

public class AppPersona {

	public static void main(String[] args) {

		Alumno alumno1 = new Alumno();

		alumno1.setAñoDeNacimiento(2003);
		alumno1.setCedula(44714830);
		alumno1.setCurso("A");
		alumno1.setNombre("Luka");

		System.out.println("Su nombre es: " + alumno1.getNombre() + "\nSu cedula es: " + alumno1.getCedula()
				+ "\nSu curso es: " + alumno1.getCurso() + "\nSu edad es: " + (alumno1.calcularEdad()) + " años");

		System.out.println("---------------------");

		Alumno alumno2 = new Alumno();

		alumno2.setAñoDeNacimiento(2002);
		alumno2.setCedula(44871231);
		alumno2.setCurso("B");
		alumno2.setNombre("Uncas");

		System.out.println("Su nombre es: " + alumno2.getNombre() + "\nSu cedula es: " + alumno2.getCedula()
				+ "\nSu curso es: " + alumno2.getCurso() + "\nSu edad es: " + (alumno2.calcularEdad()) + " años");

		System.out.println("---------------------");

		Alumno alumno3 = new Alumno();

		alumno3.setAñoDeNacimiento(2001);
		alumno3.setCedula(43564430);
		alumno3.setCurso("C");
		alumno3.setNombre("Ivan");

		System.out.println("Su nombre es: " + alumno3.getNombre() + "\nSu cedula es: " + alumno3.getCedula()
				+ "\nSu curso es: " + alumno3.getCurso() + "\nSu edad es: " + (alumno3.calcularEdad()) + " años");

	}

}
