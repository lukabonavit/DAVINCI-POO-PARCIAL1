package parcial_Ejercicio_4;

public class Alumno extends Persona {
	String curso;

	public Alumno() {

	}

	public Alumno(int cedula, String nombre, int aņoDeNacimiento, String curso) {
		super(cedula, nombre, aņoDeNacimiento);
		this.curso = curso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public int calcularEdad() {
		return super.calcularEdad();
	}
}
