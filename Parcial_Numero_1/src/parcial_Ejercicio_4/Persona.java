package parcial_Ejercicio_4;

public class Persona {
	int cedula;
	String nombre;
	int a�oDeNacimiento;

	public Persona() {

	}

	public Persona(int cedula, String nombre, int fechaDeNacimiento) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.a�oDeNacimiento = fechaDeNacimiento;
	}

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getA�oDeNacimiento() {
		return a�oDeNacimiento;
	}

	public void setA�oDeNacimiento(int a�oDeNacimiento) {
		this.a�oDeNacimiento = a�oDeNacimiento;
	}

	public int calcularEdad() {
		int edad = (2021 - this.getA�oDeNacimiento());
		return edad;
	}
}
