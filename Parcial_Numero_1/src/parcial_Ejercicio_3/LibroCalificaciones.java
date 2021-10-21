package parcial_Ejercicio_3;

public class LibroCalificaciones {

	private String nombreDelCurso;

	public LibroCalificaciones() {

	}

	public LibroCalificaciones(String nombreDelCurso) {
		super();
		this.nombreDelCurso = nombreDelCurso;
	}

	public void setNombreDelCurso(String nombreDelCurso) {
		this.nombreDelCurso = nombreDelCurso;
	}

	public String getNombreDelCurso() {
		return nombreDelCurso;
	}

	public String mostrarMensaje() {
		String mensaje = "Usted esta en el curso: ";
		return mensaje;
	}

}
