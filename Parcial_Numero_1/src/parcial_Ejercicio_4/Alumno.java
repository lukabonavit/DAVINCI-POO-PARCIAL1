package parcial_Ejercicio_4;

public class Alumno extends Persona {
	String curso;

	public Alumno() {

	}

	public Alumno(int cedula, String nombre, int a�oDeNacimiento, String curso) {
		super(cedula, nombre, a�oDeNacimiento);
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
