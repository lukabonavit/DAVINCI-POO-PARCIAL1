package parcial_Ejercicio_4;

public class Persona {
	int cedula;
	String nombre;
	int añoDeNacimiento;

	public Persona() {

	}

	public Persona(int cedula, String nombre, int fechaDeNacimiento) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.añoDeNacimiento = fechaDeNacimiento;
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

	public int getAñoDeNacimiento() {
		return añoDeNacimiento;
	}

	public void setAñoDeNacimiento(int añoDeNacimiento) {
		this.añoDeNacimiento = añoDeNacimiento;
	}

	public int calcularEdad() {
		int edad = (2021 - this.getAñoDeNacimiento());
		return edad;
	}
}
