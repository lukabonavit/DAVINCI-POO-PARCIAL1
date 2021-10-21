package parcial_Ejercicio_3;

public class AppLibroCalificaciones {

	public static void main(String[] args) {

		LibroCalificaciones uno = new LibroCalificaciones();

		uno.setNombreDelCurso("ACM1A");
		System.out.println(uno.mostrarMensaje() + uno.getNombreDelCurso());

		System.out.println("-----------------------------");
		
		LibroCalificaciones dos = new LibroCalificaciones();

		dos.setNombreDelCurso("ACM2A");
		System.out.println(uno.mostrarMensaje() + dos.getNombreDelCurso());

		System.out.println("-----------------------------");
		
		LibroCalificaciones tres = new LibroCalificaciones();

		tres.setNombreDelCurso("ACM3A");
		System.out.println(uno.mostrarMensaje() + tres.getNombreDelCurso());

		LibroCalificaciones cuatro = new LibroCalificaciones();

		System.out.println("-----------------------------");
		
		cuatro.setNombreDelCurso("ACM4A");
		System.out.println(uno.mostrarMensaje() + cuatro.getNombreDelCurso());

	}

}
