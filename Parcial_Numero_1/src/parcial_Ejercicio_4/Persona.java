package parcial_Ejercicio_4;

public class Persona {
	int cedula;
	String nombre;
	int aņoDeNacimiento;

	public Persona() {

	}

	public Persona(int cedula, String nombre, int fechaDeNacimiento) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.aņoDeNacimiento = fechaDeNacimiento;
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

	public int getAņoDeNacimiento() {
		return aņoDeNacimiento;
	}

	public void setAņoDeNacimiento(int aņoDeNacimiento) {
		this.aņoDeNacimiento = aņoDeNacimiento;
	}

	public int calcularEdad() {
		int edad = (2021 - this.getAņoDeNacimiento());
		return edad;
	}
}
